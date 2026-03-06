package GUI;

import javax.swing.*;
import java.awt.*;

public class BookingCorrectionGUI extends JPanel {

    public JTextField txtBookingId = new JTextField(10);
    public JTextField txtReason = new JTextField(15);

    public JButton btnLookup = new JButton("Lookup Booking");
    public JButton btnVerify = new JButton("Verify Issue");
    public JButton btnCorrect = new JButton("Apply Correction");

    public JComboBox<String> cmbAction = new JComboBox<>(
            new String[] {
                    "Reinstate Booking",
                    "Fix Incorrect Date",
                    "Undo Cancellation"
            }
    );

    public JTextArea output = new JTextArea(15, 40);

    public BookingCorrectionGUI() {
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel(new GridLayout(4, 2));
        inputPanel.setBorder(BorderFactory.createTitledBorder("Booking Correction Transaction"));

        inputPanel.add(new JLabel("Booking ID:"));
        inputPanel.add(txtBookingId);

        inputPanel.add(new JLabel("Correction Action:"));
        inputPanel.add(cmbAction);

        inputPanel.add(new JLabel("Reason:"));
        inputPanel.add(txtReason);

        inputPanel.add(btnLookup);
        inputPanel.add(btnVerify);

        output.setEditable(false);

        JPanel bottomPanel = new JPanel();
        bottomPanel.add(btnCorrect);

        add(inputPanel, BorderLayout.NORTH);
        add(new JScrollPane(output), BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);
    }
}

