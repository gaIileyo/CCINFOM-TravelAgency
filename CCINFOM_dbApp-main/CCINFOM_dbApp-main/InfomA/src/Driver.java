import Controller.Customer_record_ctrl;
import GUI.Main_menu;
import Logic.Customer_record;
import Logic.ExpiringLicenseReport;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Driver {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            Connection conn = connect();

            if (conn == null) {
                JOptionPane.showMessageDialog(
                        null,
                        "Database connection failed.\nApplication will close.",
                        "Connection Error",
                        JOptionPane.ERROR_MESSAGE
                );
                System.exit(0);
            }

            // Initialize GUI
            Main_menu menu = new Main_menu();

            // Initialize Logic
            ExpiringLicenseReport expiringLicenseReport = new ExpiringLicenseReport();
            Customer_record logic = new Customer_record(expiringLicenseReport);

            // Initialize Controller
            new Customer_record_ctrl(logic, menu, conn);

        });
    }

    public static Connection connect() {

        try {
            return DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/sf_licensing_system",
                    "root",
                    "Dhnx1738"
            );

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
