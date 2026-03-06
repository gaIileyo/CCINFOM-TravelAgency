package GUI;

import javax.swing.*;
import java.awt.*;

public class BookingExtensionMenuGUI extends JFrame {

    public JButton btnRegisterExtension = new JButton("Register Booking Extension");
    public JButton btnViewExtensions = new JButton("View Extended Bookings");
    public JButton btnUpdateExtension = new JButton("Update Extension Info");

    public BookingExtensionMenuGUI() {
        setTitle("Booking Extension Management");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(3, 1, 15, 15));
        panel.setBorder(BorderFactory.createEmptyBorder(30, 40, 30, 40));

        panel.add(btnRegisterExtension);
        panel.add(btnViewExtensions);
        panel.add(btnUpdateExtension);

        add(panel);
    }
}

