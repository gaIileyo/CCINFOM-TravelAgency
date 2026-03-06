package GUI;

import javax.swing.*;
import java.awt.*;

public class TourPackagePerformanceReportGUI extends JPanel {

    // INPUTS
    public JTextField txtMonth = new JTextField(5);
    public JTextField txtYear = new JTextField(5);

    // BUTTON
    public JButton btnGenerate = new JButton("Generate Report");

    // OUTPUT
    public JTextArea output = new JTextArea(15, 40);

    public TourPackagePerformanceReportGUI() {
        setLayout(new BorderLayout());

        /* =========================
           INPUT PANEL
           ========================= */
        JPanel inputPanel = new JPanel(new GridLayout(3, 2, 10, 10));
        inputPanel.setBorder(
                BorderFactory.createTitledBorder("Tour Package Performance & Revenue Report")
        );

        inputPanel.add(new JLabel("Month (1–12):"));
        inputPanel.add(txtMonth);

        inputPanel.add(new JLabel("Year (YYYY):"));
        inputPanel.add(txtYear);

        inputPanel.add(new JLabel()); // spacer
        inputPanel.add(btnGenerate);

        /* =========================
           OUTPUT
           ========================= */
        output.setEditable(false);
        output.setFont(new Font("Monospaced", Font.PLAIN, 12));
        JScrollPane scroll = new JScrollPane(output);

        /* =========================
           ADD COMPONENTS
           ========================= */
        add(inputPanel, BorderLayout.NORTH);
        add(scroll, BorderLayout.CENTER);
    }
}

