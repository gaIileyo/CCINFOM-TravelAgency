package GUI;

import javax.swing.*;
import java.awt.*;

public class GuestBookingTransactionGUI extends JFrame {

    JButton viewTransaction = new JButton("View All Bookings");
    JButton addTransaction = new JButton("Create Booking");

    JTextField vendorId = new JTextField();
    JTextField roomTypeId = new JTextField();
    JTextField roomId = new JTextField();
    JTextField guestId = new JTextField();
    JTextField stayDuration = new JTextField();

    JLayeredPane layout = new JLayeredPane();

    public GuestBookingTransactionGUI() {
        super("Guest Booking Transaction");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(600, 480);
        setResizable(false);
        setLayout(null);

        layout.setBounds(0, 0, 600, 480);
        layout.setBackground(Color.LIGHT_GRAY);
        layout.setOpaque(true);

        textFields();
        addBookingBtn();
        viewBookingBtn();

        add(layout);
        setVisible(true);
    }

    private void textFields() {
        JLabel vendorLabel = new JLabel("Vendor ID:");
        JLabel roomTypeLabel = new JLabel("Room Type ID:");
        JLabel durationLabel = new JLabel("Stay Duration (Days):");
        JLabel roomLabel = new JLabel("Room ID:");
        JLabel guestLabel = new JLabel("Guest ID:");

        Font f = new Font("SansSerif", Font.BOLD, 14);
        vendorLabel.setFont(f);
        roomTypeLabel.setFont(f);
        durationLabel.setFont(f);
        roomLabel.setFont(f);
        guestLabel.setFont(f);

        vendorLabel.setBounds(10, 10, 150, 50);
        roomTypeLabel.setBounds(10, 80, 150, 50);
        durationLabel.setBounds(10, 150, 180, 50);
        roomLabel.setBounds(10, 220, 150, 50);
        guestLabel.setBounds(10, 290, 150, 50);

        vendorId.setBounds(190, 10, 350, 50);
        roomTypeId.setBounds(190, 80, 350, 50);
        stayDuration.setBounds(190, 150, 350, 50);
        roomId.setBounds(190, 220, 350, 50);
        guestId.setBounds(190, 290, 350, 50);

        layout.add(vendorLabel);
        layout.add(roomTypeLabel);
        layout.add(durationLabel);
        layout.add(roomLabel);
        layout.add(guestLabel);

        layout.add(vendorId);
        layout.add(roomTypeId);
        layout.add(stayDuration);
        layout.add(roomId);
        layout.add(guestId);
    }

    private void addBookingBtn() {
        addTransaction.setBounds(190, 350, 350, 30);
        layout.add(addTransaction);
    }

    private void viewBookingBtn() {
        viewTransaction.setBounds(190, 390, 350, 30);
        layout.add(viewTransaction);
    }
}
