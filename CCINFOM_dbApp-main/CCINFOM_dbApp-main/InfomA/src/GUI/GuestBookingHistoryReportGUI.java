package GUI;

import javax.swing.*;
import java.awt.*;

public class GuestBookingHistoryReportGUI extends JFrame {

    private JLayeredPane layout = new JLayeredPane();
    private JTextField month = new JTextField();
    private JTextField year = new JTextField();

    private JButton submitBtn = new JButton("Generate Report");
    private JButton exportBtn = new JButton("Export to PDF");

    public GuestBookingHistoryReportGUI() {
        super("Guest Booking History Report");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(600, 300);
        this.setResizable(false);
        this.setLayout(null);

        layout.setBounds(0, 0, 600, 300);
        layout.setBackground(Color.LIGHT_GRAY);
        layout.setOpaque(true);

        textFields();
        createSubmitBtn();
        createExportBtn();

        this.add(layout);
        this.setVisible(true);
    }

    private void textFields() {
        JLabel monthLabel = new JLabel("Month (MM):");
        JLabel yearLabel = new JLabel("Year (YYYY):");

        monthLabel.setBounds(10, 20, 120, 50);
        yearLabel.setBounds(10, 80, 120, 50);

        Font font = new Font("SansSerif", Font.BOLD, 14);
        monthLabel.setFont(font);
        yearLabel.setFont(font);

        month.setBounds(140, 20, 400, 50);
        year.setBounds(140, 80, 400, 50);

        layout.add(monthLabel, Integer.valueOf(0));
        layout.add(yearLabel, Integer.valueOf(0));
        layout.add(month, Integer.valueOf(0));
        layout.add(year, Integer.valueOf(0));
    }

    private void createSubmitBtn() {
        submitBtn.setBounds(140, 150, 400, 30);
        layout.add(submitBtn, Integer.valueOf(0));
    }

    private void createExportBtn() {
        exportBtn.setBounds(140, 190, 400, 30);
        layout.add(exportBtn, Integer.valueOf(0));
    }

    /* =========================
       GETTERS
       ========================= */
    public JButton getSubmitBtn() { return submitBtn; }
    public JButton getExportBtn() { return exportBtn; }
    public JTextField getMonth() { return month; }
    public JTextField getYear() { return year; }
}
