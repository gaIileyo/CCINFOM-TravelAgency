package Logic;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class ServiceExtensionLogic {

    private Connection conn;

    public ServiceExtensionLogic(Connection conn) {
        this.conn = conn;
    }

    /* =====================================================
       1. LOOKUP EXISTING ACTIVITY
       ===================================================== */
    public String lookupActivity(int transactionId) {
        try {
            String sql = """
                SELECT t.activity_transaction_id,
                       CONCAT(g.first_name, ' ', g.last_name) AS guest_name,
                       t.service_type,
                       t.activity_end_date,
                       t.final_amount,
                       t.payment_status
                FROM guest_activity_transaction t
                JOIN guest g ON g.guest_id = t.guest_id
                WHERE t.activity_transaction_id = ?
            """;

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, transactionId);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return "Transaction ID: " + rs.getInt("activity_transaction_id") +
                        "\nGuest: " + rs.getString("guest_name") +
                        "\nService Type: " + rs.getString("service_type") +
                        "\nCurrent End Date: " + rs.getDate("activity_end_date") +
                        "\nAmount Paid: ₱" + rs.getDouble("final_amount") +
                        "\nPayment Status: " + rs.getString("payment_status");
            }
            return "NOT FOUND";

        } catch (SQLException e) {
            return "ERROR";
        }
    }

    /* =====================================================
       2. VALIDATE EXTENSION DAYS
       ===================================================== */
    public boolean validateExtensionDays(int days) {
        return days == 1 || days == 3 || days == 7;
    }

    /* =====================================================
       3. APPLY SERVICE EXTENSION
       ===================================================== */
    public boolean extendService(int transactionId, int days, double additionalCost) {
        try {
            String sql = """
                UPDATE guest_activity_transaction
                SET activity_end_date = DATE_ADD(activity_end_date, INTERVAL ? DAY),
                    final_amount = final_amount + ?,
                    payment_status = 'Pending'
                WHERE activity_transaction_id = ?
            """;

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, days);
            ps.setDouble(2, additionalCost);
            ps.setInt(3, transactionId);

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            return false;
        }
    }

    /* =====================================================
       4. LOG EXTENSION RECORD
       ===================================================== */
    public boolean logServiceExtension(int transactionId, int days, double fee) {
        try {
            String sql = """
                INSERT INTO service_extension_log
                (activity_transaction_id, extension_date, extension_days, extension_fee)
                VALUES (?, NOW(), ?, ?)
            """;

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, transactionId);
            ps.setInt(2, days);
            ps.setDouble(3, fee);

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            return false;
        }
    }

    /* =====================================================
       5. CONFIRM PAYMENT
       ===================================================== */
    public boolean confirmPayment(int transactionId, String paymentMethod) {
        try {
            String sql = """
                UPDATE guest_activity_transaction
                SET payment_status = 'Paid',
                    payment_method = ?
                WHERE activity_transaction_id = ?
            """;

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, paymentMethod);
            ps.setInt(2, transactionId);

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            return false;
        }
    }

    /* =====================================================
       6. EXTENSION SUMMARY REPORT
       ===================================================== */
    public ArrayList<String> generateExtensionReport(int month, int year) {
        ArrayList<String> report = new ArrayList<>();

        try {
            String sql = """
                SELECT t.service_type,
                       COUNT(e.extension_id) AS total_extensions,
                       SUM(e.extension_fee) AS total_revenue
                FROM service_extension_log e
                JOIN guest_activity_transaction t
                    ON e.activity_transaction_id = t.activity_transaction_id
                WHERE MONTH(e.extension_date) = ?
                  AND YEAR(e.extension_date) = ?
                GROUP BY t.service_type
            """;

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, month);
            ps.setInt(2, year);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                report.add(
                        "Service Type: " + rs.getString("service_type") +
                                "\nTotal Extensions: " + rs.getInt("total_extensions") +
                                "\nTotal Revenue: ₱" + rs.getDouble("total_revenue") +
                                "\n-----------------------------------"
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return report;
    }
}


