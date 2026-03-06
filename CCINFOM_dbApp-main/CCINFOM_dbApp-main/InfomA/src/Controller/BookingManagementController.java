package Controller;

import GUI.BookingManagementGUI;
import Logic.BookingManagementLogic;

import javax.swing.*;

public class BookingManagementController {

    private BookingManagementGUI gui;
    private BookingManagementLogic logic;

    public BookingManagementController(BookingManagementGUI gui,
                                       BookingManagementLogic logic) {

        this.gui = gui;
        this.logic = logic;

        initController();
    }

    private void initController() {

        // 1️⃣ LOOKUP BOOKING
        gui.btnLookup.addActionListener(e -> {

            gui.output.setText("");

            try {
                int bookingId =
                        Integer.parseInt(gui.txtBookingId.getText().trim());

                String info = logic.lookupBooking(bookingId);

                if (info.equals("NOT FOUND")) {
                    gui.output.append("Booking not found.\n");
                } else {
                    gui.output.append("Booking Found:\n" + info + "\n");
                }

            } catch (NumberFormatException ex) {
                gui.output.append("Invalid Booking ID.\n");
            }
        });


        // 2️⃣ VERIFY MODIFICATION REASON
        gui.btnVerify.addActionListener(e -> {

            String reason = gui.txtReason.getText().trim();

            if (logic.verifyReason(reason)) {
                gui.output.append("Reason verified.\n");
            } else {
                gui.output.append("Reason must be at least 5 characters.\n");
            }
        });


        // 3️⃣ UPDATE BOOKING STATUS
        gui.btnUpdate.addActionListener(e -> {

            try {
                int bookingId =
                        Integer.parseInt(gui.txtBookingId.getText().trim());

                String reason = gui.txtReason.getText().trim();

                if (!logic.verifyReason(reason)) {
                    gui.output.append("Update failed: Invalid reason.\n");
                    return;
                }

                String selectedAction =
                        (String) gui.cmbAction.getSelectedItem();

                String newStatus;

                switch (selectedAction) {

                    case "Confirm Booking":
                        newStatus = "Confirmed";
                        break;

                    case "Cancel Booking":
                        newStatus = "Cancelled";
                        break;

                    case "Mark as Completed":
                        newStatus = "Completed";
                        break;

                    default:
                        newStatus = "Pending";
                }

                boolean updated =
                        logic.updateBookingStatus(bookingId, newStatus);

                if (updated) {
                    gui.output.append("Booking updated successfully!\n");
                    logic.logBookingUpdate(bookingId, reason);
                } else {
                    gui.output.append("Failed to update booking.\n");
                }

            } catch (NumberFormatException ex) {
                gui.output.append("Invalid Booking ID.\n");
            }
        });
    }
}
