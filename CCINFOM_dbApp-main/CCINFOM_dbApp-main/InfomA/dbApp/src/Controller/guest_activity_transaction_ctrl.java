package Controller;

import Logic.guest_activity_transaction;
import GUI.customer_record_GUI;

import java.sql.Connection;
import java.sql.SQLException;

public class guest_activity_transaction_ctrl {

    private guest_activity_transaction logic;
    private customer_record_GUI gui;

    public guest_activity_transaction_ctrl(
            guest_activity_transaction logic,
            customer_record_GUI gui,
            Connection conn) throws SQLException {

        this.logic = logic;
        this.gui = gui;

        logic.viewAllTransactions(conn);
        gui.setUpTable(logic.getModel());
    }
}
