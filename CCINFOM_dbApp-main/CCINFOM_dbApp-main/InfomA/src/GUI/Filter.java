package GUI;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Filter extends JFrame implements ActionListener {

    // =========================
    // FILTER COMPONENTS
    // =========================
    private JTextField columnName = new JTextField(15);
    private JTextField orderBy = new JTextField(15);
    private JButton submitBtn = new JButton("Apply Filter");
    private JButton viewLicenseBtn = new JButton("View Customer's Owned Licenses");

    // =========================
    // VIEW LICENSE COMPONENTS
    // =========================
    private JFrame viewLicenseFrame;
    private JTextField id = new JTextField(15);
    private JButton viewSubmitBtn = new JButton("Submit");

    public Filter() {
        super("Filters");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(500, 300);
        setResizable(false);
        setLayout(new BorderLayout());

        // =========================
        // FILTER PANEL
        // =========================
        JPanel filterPanel = new JPanel(new GridLayout(3, 2, 10, 10));
        filterPanel.setBorder(BorderFactory.createTitledBorder("Filter Records"));

        filterPanel.add(new JLabel("Column Name:"));
        filterPanel.add(columnName);

        filterPanel.add(new JLabel("Order By (ASC/DESC):"));
        filterPanel.add(orderBy);

        filterPanel.add(submitBtn);
        filterPanel.add(viewLicenseBtn);

        add(filterPanel, BorderLayout.CENTER);

        // Button listener
        viewLicenseBtn.addActionListener(this);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    // =========================
    // VIEW LICENSE WINDOW
    // =========================
    private void openViewLicenseFrame() {

        viewLicenseFrame = new JFrame("View Customer Licenses");
        viewLicenseFrame.setSize(400, 200);
        viewLicenseFrame.setLayout(new BorderLayout());
        viewLicenseFrame.setResizable(false);

        JPanel panel = new JPanel(new GridLayout(2, 2, 10, 10));
        panel.setBorder(BorderFactory.createTitledBorder("Search Customer Licenses"));

        panel.add(new JLabel("Customer ID:"));
        panel.add(id);
        panel.add(new JLabel(""));
        panel.add(viewSubmitBtn);

        viewLicenseFrame.add(panel, BorderLayout.CENTER);
        viewLicenseFrame.setLocationRelativeTo(this);
        viewLicenseFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == viewLicenseBtn) {
            openViewLicenseFrame();
        }
    }

    // =========================
    // GETTERS
    // =========================
    public JTextField getColumnName() {
        return columnName;
    }

    public JTextField getOrderBy() {
        return orderBy;
    }

    public JButton getSubmitBtn() {
        return submitBtn;
    }

    public JButton getViewSubmitBtn() {
        return viewSubmitBtn;
    }

    public JButton getViewLicenseBtn() {
        return viewLicenseBtn;
    }

    public JTextField getId() {
        return id;
    }

    public JFrame getViewLicenseFrame() {
        return viewLicenseFrame;
    }
}
