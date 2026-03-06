package Logic;

import javax.swing.table.DefaultTableModel;
import java.sql.*;

public class GuestBookingHistoryReport {

    private DefaultTableModel bookingHistoryTable = new DefaultTableModel(
            new Object[]{
                    "Transaction ID",
                    "Guest Name",
                    "Service Type",
                    "Start Date",
                    "End Date",
                    "Final Amount",
                    "Payment Status"
            }, 0
    );

    public GuestBookingHistoryReport() {}

    /* =========================
       CREATE BOOKING HISTORY REPORT
       ========================= */
    public void createBookingHistoryReport(Connection conn, String year, String month)
            throws SQLException {

        bookingHistoryTable.setRowCount(0);

        StringBuilder query = new StringBuilder();
        query.append("""
            SELECT t.activity_transaction_id,
                   CONCAT(g.first_name, ' ', g.last_name) AS guest_name,
                   t.service_type,
                   t.activity_start_date,
                   t.activity_end_date,
                   t.final_amount,
                   t.payment_status
            FROM guest_activity_transaction t
            JOIN guest g ON g.guest_id = t.guest_id
            WHERE YEAR(t.activity_start_date) = ?
        """);

        if (!month.isEmpty()) {
            query.append(" AND MONTH(t.activity_start_date) = ? ");
        }

        query.append(" ORDER BY t.activity_start_date DESC");

        try (PreparedStatement stmt = conn.prepareStatement(query.toString())) {

            stmt.setInt(1, Integer.parseInt(year));
            if (!month.isEmpty()) {
                stmt.setInt(2, Integer.parseInt(month));
            }

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                bookingHistoryTable.addRow(new Object[]{
                        rs.getInt("activity_transaction_id"),
                        rs.getString("guest_name"),
                        rs.getString("service_type"),
                        rs.getDate("activity_start_date"),
                        rs.getDate("activity_end_date"),
                        rs.getDouble("final_amount"),
                        rs.getString("payment_status")
                });
            }
        } catch (SQLException e) {
            System.out.println("Error generating Guest Booking History Report");
            e.printStackTrace();
        }
    }

    /* =========================
       GETTER
       ========================= */
    public DefaultTableModel getBookingHistoryTable() {
        return bookingHistoryTable;
    }
}
