package Logic;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CategoryReportLogic {

    private Connection conn;

    public CategoryReportLogic(Connection conn) {
        this.conn = conn;
    }

    public ArrayList<String> generateTourPackageRevenueReport(int month, int year) {

        ArrayList<String> report = new ArrayList<>();

        String query =
                "SELECT tp.package_name, " +
                "COUNT(tr.tour_reservation_id) AS total_bookings, " +
                "SUM(tr.total_tour_cost) AS total_revenue " +
                "FROM tour_reservation tr " +
                "JOIN tour_package tp ON tr.package_id = tp.package_id " +
                "WHERE MONTH(tr.tour_date) = ? " +
                "AND YEAR(tr.tour_date) = ? " +
                "AND tr.reservation_status = 'Confirmed' " +
                "GROUP BY tp.package_name " +
                "ORDER BY total_revenue DESC";

        try (PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, month);
            stmt.setInt(2, year);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                String packageName = rs.getString("package_name");
                int totalBookings = rs.getInt("total_bookings");
                double totalRevenue = rs.getDouble("total_revenue");

                String line = String.format(
                        "Package: %s | Bookings: %d | Revenue: ₱%,.2f",
                        packageName,
                        totalBookings,
                        totalRevenue
                );

                report.add(line);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return report;
    }
}
