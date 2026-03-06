package Logic;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.table.DefaultTableModel;

public class guest_activity_transaction {

    private DefaultTableModel model = new DefaultTableModel(
        new Object[]{
            "Guest ID",
            "First Name",
            "Last Name",
            "Transaction ID",
            "Service Type",
            "Tour Package",
            "Guide First Name",
            "Guide Last Name",
            "Start Date",
            "End Date",
            "Base Amount",
            "Additional Charges",
            "Discount",
            "Final Amount",
            "Payment Method",
            "Payment Status"
        }, 0
    );

    public void viewAllTransactions(Connection conn) throws SQLException {
        model.setRowCount(0);

        String sql = "SELECT g.guest_id, g.first_name, g.last_name, gat.activity_transaction_id, "
                + "gat.service_type, tp.package_name AS tour_package, "
                + "ga.first_name AS guide_first_name, ga.last_name AS guide_last_name, "
                + "gat.activity_start_date, gat.activity_end_date, "
                + "gat.base_amount, gat.additional_charges, gat.discount_applied, gat.final_amount, "
                + "gat.payment_method, gat.payment_confirmation_status "
                + "FROM guest_activity_transaction gat "
                + "JOIN guest g ON gat.guest_id = g.guest_id "
                + "LEFT JOIN tour_reservation tr "
                + "ON gat.service_type IN ('Tour','Combined') "
                + "AND tr.reservation_id = gat.reference_id "
                + "LEFT JOIN guide ga ON tr.assigned_guide_id = ga.guide_id "
                + "LEFT JOIN tour_package tp ON tr.package_id = tp.package_id "
                + "ORDER BY g.guest_id, gat.activity_start_date";

        try (PreparedStatement pst = conn.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                model.addRow(new Object[]{
                        rs.getInt("guest_id"),
                        rs.getString("first_name"),
                        rs.getString("last_name"),
                        rs.getInt("activity_transaction_id"),
                        rs.getString("service_type"),
                        rs.getString("tour_package"),
                        rs.getString("guide_first_name"),
                        rs.getString("guide_last_name"),
                        rs.getDate("activity_start_date"),
                        rs.getDate("activity_end_date"),
                        rs.getDouble("base_amount"),
                        rs.getDouble("additional_charges"),
                        rs.getDouble("discount_applied"),
                        rs.getDouble("final_amount"),
                        rs.getString("payment_method"),
                        rs.getString("payment_confirmation_status")
                });

                System.out.println(
                        rs.getString("guest_id") + " | "
                                + rs.getString("first_name") + " " + rs.getString("last_name") + " | "
                                + rs.getString("tour_package") + " | "
                                + rs.getString("guide_first_name") + " " + rs.getString("guide_last_name") + " | "
                                + rs.getDate("activity_start_date") + " to "
                                + rs.getDate("activity_end_date") + " | "
                                + rs.getDouble("final_amount")
                );
            }
        }
    }

    public DefaultTableModel getModel() {
        return model;
    }
}
