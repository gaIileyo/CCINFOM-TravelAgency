package Logic;

import java.sql.*;

public class BookingIssueResolutionLogic {

    private Connection conn;

    public BookingIssueResolutionLogic(Connection conn) {
        this.conn = conn;
    }

    /* =====================================================
       1. LOOKUP BOOKING / ACTIVITY
       ===================================================== */
    public String lookupActivity(int transactionId) {
        try {
            String sql = """
                SELECT t.activity_transaction_id,
                       CONCAT(g.first_name, ' ', g.last_name) AS guest_name,
                       t.service_type,
                       t.activity_start_date,
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
                        "\nStart Date: " + rs.getDate("activity_start_date") +
                        "\nEnd Date: " + rs.getDate("activity_end_date") +
                        "\nAmount: ₱" + rs.getDouble("final_amount") +
                        "\nPayment Status: " + rs.getString("payment_status");
            }
            return "NOT FOUND";

        } catch (SQLException e) {
            return "ERROR";
        }
    }

    /* =====================================================
       2. VALIDATE ISSUE REASON
       ===================================================== */
    public boolean validateIssueReason(String reason) {
        return reason != null && !reason.isBlank() && reason.length() >= 10;
    }

    /* =====================================================
       3. RESOLVE BOOKING ISSUE
       ===================================================== */
    public boolean resolveIssue(int transactionId, String newStatus) {
        try {
            String sql = """
                UPDATE guest_activity_transaction
                SET payment_status = ?
                WHERE activity_transaction_id = ?
            """;

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, newStatus);
            ps.setInt(2, transactionId);

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            return false;
        }
    }

    /* =====================================================
       4. LOG BOOKING ISSUE
       ===================================================== */
    public boolean logIssue(int transactionId, String reason) {
        try {
            String sql = """
                INSERT INTO booking_issue_log
                (activity_transaction_id, issue_reason, issue_date)
                VALUES (?, ?, NOW())
            """;

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, transactionId);
            ps.setString(2, reason);

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            return false;
        }
    }
}

