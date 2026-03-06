package Controller;

import GUI.*;
import Logic.GuestRecord;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;

public class GuestRecordController implements ActionListener {

    private final Connection conn;
    private GuestRecord logic;
    private Main_menu mainMenu;
    private GuestRecordGUI guestGUI;
    private AddGuest addGuest;
    private ModifyGuest modifyGuest;

    public GuestRecordController(GuestRecord logic,
                                 Main_menu mainMenu,
                                 Connection conn) throws SQLException {

        this.logic = logic;
        this.mainMenu = mainMenu;
        this.conn = conn;

        this.guestGUI = mainMenu.getGuestRecord();

        mainMenu.getGuestBtn().addActionListener(this);
        guestGUI.getAddBtn().addActionListener(this);
        guestGUI.getModifyBtn().addActionListener(this);
        guestGUI.getResetBtn().addActionListener(this);

        processGuestTable();
    }

    private void processGuestTable() throws SQLException {
        logic.viewAllGuests(conn);
        guestGUI.setUpTable(logic.getModel());
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        // RESET TABLE
        if (e.getSource() == guestGUI.getResetBtn()) {
            refreshTable();
        }

        // ADD GUEST
        if (e.getSource() == guestGUI.getAddBtn()) {
            addGuest = new AddGuest();
            addGuest.getSubmitBtn().addActionListener(this);
        }

        if (addGuest != null && e.getSource() == addGuest.getSubmitBtn()) {
            try {
                if (processAddGuest()) {
                    addGuest.dispose();
                    JOptionPane.showMessageDialog(null,
                            "Guest Added Successfully!");
                    refreshTable();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        // MODIFY GUEST
        if (e.getSource() == guestGUI.getModifyBtn()) {
            modifyGuest = new ModifyGuest();
            modifyGuest.getSubmitBtn().addActionListener(this);
        }

        if (modifyGuest != null && e.getSource() == modifyGuest.getSubmitBtn()) {
            try {
                if (processModifyGuest()) {
                    modifyGuest.dispose();
                    JOptionPane.showMessageDialog(null,
                            "Guest Updated Successfully!");
                    refreshTable();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    private boolean processAddGuest() throws SQLException {

        String firstName = addGuest.getFirstName().getText();
        String lastName = addGuest.getLastName().getText();
        String contact = addGuest.getContactNumber().getText();

        if (firstName.isEmpty() || lastName.isEmpty() || contact.isEmpty())
            return false;

        logic.addGuest(conn, firstName, lastName, contact);
        return true;
    }

    private boolean processModifyGuest() throws SQLException {

        String idText = modifyGuest.getId().getText();
        String column = modifyGuest.getColumn().getText();
        String value = modifyGuest.getValue().getText();

        if (idText.isEmpty() || column.isEmpty() || value.isEmpty())
            return false;

        int id = Integer.parseInt(idText);
        return logic.modifyGuest(conn, id, column, value);
    }

    private void refreshTable() {
        try {
            logic.viewAllGuests(conn);
            guestGUI.setUpTable(logic.getModel());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
