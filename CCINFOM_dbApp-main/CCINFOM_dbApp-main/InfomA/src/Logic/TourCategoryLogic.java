package Logic;

import java.sql.*;
import java.util.ArrayList;

public class TourCategoryLogic {

    private Connection conn;

    public TourCategoryLogic(Connection conn) {
        this.conn = conn;
    }

    /* =====================================================
       ADD TOUR CATEGORY
       ===================================================== */
    public boolean addCategory(String name, String description) {
        if (name == null || name.isBlank() || description == null || description.isBlank()) {
            return false;
        }

        try {
            String sql = """
                INSERT INTO tour_category (category_name, description)
                VALUES (?, ?)
            """;

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, name.trim());
            ps.setString(2, description.trim());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            return false;
        }
    }

    /* =====================================================
       VIEW CATEGORY + RELATED TOUR PACKAGES
       ===================================================== */
    public ArrayList<String> viewCategoryDetails(int categoryId) {
        ArrayList<String> list = new ArrayList<>();

        try {
            String sql = """
                SELECT tc.category_name,
                       tc.description,
                       tp.package_id,
                       tp.package_name,
                       tp.price,
                       tp.duration,
                       tr.reservation_status,
                       tr.total_tour_cost
                FROM tour_category tc
                LEFT JOIN tour_package tp
                       ON tc.category_id = tp.category_id
                LEFT JOIN tour_reservation tr
                       ON tp.package_id = tr.package_id
                WHERE tc.category_id = ?
            """;

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, categoryId);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                list.add(
                        "Category: " + rs.getString("category_name") +
                        "\nPackage ID: " + rs.getInt("package_id") +
                        "\nPackage Name: " + rs.getString("package_name") +
                        "\nDuration: " + rs.getString("duration") +
                        "\nPrice: ₱" + rs.getDouble("price") +
                        "\nReservation Status: " + rs.getString("reservation_status") +
                        "\nTotal Revenue: ₱" + rs.getDouble("total_tour_cost") +
                        "\n---------------------------------------"
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }
}

