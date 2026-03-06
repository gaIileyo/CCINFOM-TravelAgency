import Controller.guest_activity_transaction_ctrl;
import GUI.customer_record_GUI;
import Logic.guest_activity_transaction;

import java.sql.*;

public class Driver {

    public static void main(String[] args) throws SQLException {

        Connection conn = connect();

        customer_record_GUI gui = new customer_record_GUI();
        guest_activity_transaction logic = new guest_activity_transaction();

        new guest_activity_transaction_ctrl(logic, gui, conn);
    }

    public static Connection connect(){
        try{
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/sf_licensing_sys",
                    "root",
                    "Dhnx1738");

            System.out.println("Connected to database successfully");
            return connection;

        } catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }
}
