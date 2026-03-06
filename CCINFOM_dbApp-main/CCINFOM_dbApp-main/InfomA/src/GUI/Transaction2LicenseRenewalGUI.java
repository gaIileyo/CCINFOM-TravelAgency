package GUI;

import javax.swing.*;
import java.awt.*;

public class Transaction2LicenseRenewalGUI extends JPanel {

    // INPUT FIELDS
    public JTextField txtLicenseId = new JTextField(10);
    public JTextField txtMonths = new JTextField(10);
    public JTextField txtFee = new JTextField(10);
    public JTextField txtReportMonth = new JTextField(5);
    public JTextField txtReportYear = new JTextField(5);

    // BUTTONS
    public JButton btnLookup = new JButton("Lookup License");
    public JButton btnValidate = new JButton("Validate Renewal");
    public JButton btnRenew = new JButton("Apply Renewal");
    public JButton btnGenerateReport = new JButton("Generate Renewal Report");

    // OUTPUT
    public JTextArea output = new JTextArea(18, 45);

    public Transaction2LicenseRenewalGUI() {

        setLayout(new BorderLayout());

        // ============================================================
        // TOP INPUT PANEL – License Renewal Form
        // ============================================================
        JPanel inputPanel = new JPanel(new GridLayout(6, 2, 5, 5));
        inputPanel.setBorder(BorderFactory.createTitledBorder("Software License Renewal"));

        inputPanel.add(new JLabel("License ID:"));
        inputPanel.add(txtLicenseId);

        inputPanel.add(new JLabel("Renewal Duration (Months):"));
        inputPanel.add(txtMonths);

        inputPanel.add(new JLabel("Renewal Fee (₱):"));
        inputPanel.add(txtFee);

        inputPanel.add(btnLookup);
        inputPanel.add(btnValidate);

        inputPanel.add(btnRenew);

        // ============================================================
        // REPORT PANEL – For generating monthly/yearly renewal reports
        // ============================================================
        JPanel reportPanel = new JPanel(new GridLayout(3, 2, 5, 5));
        reportPanel.setBorder(BorderFactory.createTitledBorder("Renewal Report"));

        reportPanel.add(new JLabel("Month (1-12):"));
        reportPanel.add(txtReportMonth);

        reportPanel.add(new JLabel("Year (YYYY):"));
        reportPanel.add(txtReportYear);

        reportPanel.add(btnGenerateReport);

        // ============================================================
        // OUTPUT AREA
        // ============================================================
        output.setEditable(false);
        JScrollPane scroll = new JScrollPane(output);

        // ============================================================
        // ADD PANELS TO MAIN LAYOUT
        // ============================================================
        JPanel topContainer = new JPanel(new GridLayout(2, 1));
        topContainer.add(inputPanel);
        topContainer.add(reportPanel);

        add(topContainer, BorderLayout.NORTH);
        add(scroll, BorderLayout.CENTER);
    }
}

