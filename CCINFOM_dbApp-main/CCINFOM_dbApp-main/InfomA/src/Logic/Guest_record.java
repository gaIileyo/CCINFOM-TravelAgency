package Logic;

import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.time.LocalDate;
import java.util.Set;

public class Guest_record {

    private DefaultTableModel guestModel = new DefaultTableModel(
            new Object[]{"Guest ID", "First Name", "Last Name", "Address",
                    "Contact Number", "Email", "Valid ID Status", "Trust Rating"}, 0
    );

    private DefaultTableModel activityTable = new DefaultTableModel(
            new Object[]{"Transaction ID", "Guest Name", "Service Type",
                    "Start Date", "End Date", "Final Amount", "Payment Status"}, 0
    );

    /* =========================
       VIEW ALL GUESTS
       ========================= */
    public void viewAllGuests(Connection conn) throws SQLException {
        guestModel.setRowCount(0);
        String query = "SELECT * FROM guest";
        String emailColumn = tableHasColumn(conn, "guest", "email")
            ? "email"
            : (tableHasColumn(conn, "guest", "email_address") ? "email_address" : null);

        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                guestModel.addRow(new Object[]{
                        rs.getInt("guest_id"),
                        rs.getString("first_name"),
                        rs.getString("last_name"),
                        rs.getString("address"),
                        rs.getString("contact_number"),
                        emailColumn == null ? "" : rs.getString(emailColumn),
                        rs.getString("valid_id_status"),
                        rs.getInt("trust_rating")
                });
            }
        }
    }

    /* =========================
       ADD GUEST
       ========================= */
    public boolean addGuest(Connection conn, String firstName, String lastName,
                            String address, String contact, String email) throws SQLException {

        String emailColumn = tableHasColumn(conn, "guest", "email") ? "email" : "email_address";

        String query = """
            INSERT INTO guest
            (first_name, last_name, address, contact_number, %s, valid_id_status, trust_rating)
            VALUES (?, ?, ?, ?, ?, 'Not Verified', 0)
        """.formatted(emailColumn);

        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, firstName);
            stmt.setString(2, lastName);
            stmt.setString(3, address);
            stmt.setString(4, contact);
            stmt.setString(5, email);
            stmt.executeUpdate();
        }
        return true;
    }

    private boolean tableHasColumn(Connection conn, String tableName, String columnName) throws SQLException {
        try (ResultSet rs = conn.getMetaData().getColumns(conn.getCatalog(), null, tableName, columnName)) {
            return rs.next();
        }
    }

    /* =========================
       MODIFY GUEST
       ========================= */
    public boolean modifyGuest(Connection conn, int guestId,
                               String columnName, String newValue) throws SQ
