package GUI;

import javax.swing.*;
import java.awt.*;

public class BookingExtensionPanelGUI extends JPanel {

    public JTextField txtBookingId = new JTextField(10);
    public JTextField txtGuestId = new JTextField(10);
    public JTextField txtRoomId = new JTextField(10);
    public JTextField txtVendorId = new JTextField(10);
    public JTextField txtExtensionDate = new JTextField(12);
    public JTextField txtNewCheckoutDate = new JTextField(12);
    public JTextField txtStatus = new JTextField(12);

    public JTextField txtExtensionIdSearch = new JTextField(10);

    public JButton btnAddExtension = new JButton("Register Extension");
    public JButton btnViewExtension = new JButton("View Extension Details");

    public JTextArea output = new JTextArea(15, 40);

    public BookingExtensionPanelGUI() {
        setLayout(new BorderLayout());

        JPanel addPanel = new JPanel(new GridLayout(8, 2));
        addPanel.setBorder(BorderFactory.createTitledBorder("Register Booking Extension"));

        addPanel.add(new JLabel("Booking ID:"));
        addPanel.add(txtBookingId);

        addPanel.add(new JLabel("Guest ID:"));
        addPanel.add(txtGuestId);

        addPanel.add(new JLabel("Room ID:"));
        addPanel.add(txtRoomId);

        addPanel.add(new JLabel("Vendor ID:"));
        addPanel.add(txtVendorId);

        addPanel.add(new JLabel("Extension Date (YYYY-MM-DD):"));
        addPanel.add(txtExtensionDate);

        addPanel.add(new JLabel("New Checkout Date (YYYY-MM-DD):"));
        addPanel.add(txtNewCheckoutDate);

        addPanel.add(new JLabel("Status:"));
        addPanel.add(txtStatus);

        addPanel.add(btnAddExtension);

        JPanel viewPanel = new JPanel(new GridLayout(2, 2));
        viewPanel.setBorder(BorderFactory.createTitledBorder("View Extension Information"));

        viewPanel.add(new JLabel("Extension ID:"));
        viewPanel.add(txtExtensionIdSearch);
        viewPanel.add(btnViewExtension);

        output.setEditable(false);

        add(addPanel, BorderLayout.NORTH);
        add(viewPanel, BorderLayout.CENTER);
        add(new JScrollPane(output), BorderLayout.SOUTH);
    }
}

