package GUI;

import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class Main_menu extends JFrame {

    private JTabbedPane tabbedPane = new JTabbedPane();

    private Customer_record_GUI customerGUI = new Customer_record_GUI();
    private SoftwareCategoryGUI softwareCategoryGUI = new SoftwareCategoryGUI();
    private Transaction2LicenseRenewalGUI renewalGUI = new Transaction2LicenseRenewalGUI();

    public Main_menu() {
        super("Software Licensing System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1200, 700);
        setLocationRelativeTo(null);

        // Main Menu Panel
        JPanel mainPanel = new JPanel(new GridLayout(3, 1, 20, 20));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(100, 300, 100, 300));

        JButton btnCustomer = new JButton("Customer Records");
        JButton btnCategory = new JButton("Software Categories");
        JButton btnRenewal = new JButton("License Renewal");

        btnCustomer.addActionListener(e -> tabbedPane.setSelectedComponent(customerGUI));
        btnCategory.addActionListener(e -> tabbedPane.setSelectedComponent(softwareCategoryGUI));
        btnRenewal.addActionListener(e -> tabbedPane.setSelectedComponent(renewalGUI));

        mainPanel.add(btnCustomer);
        mainPanel.add(btnCategory);
        mainPanel.add(btnRenewal);

        // Tabs
        tabbedPane.addTab("Main Menu", mainPanel);
        tabbedPane.addTab("Customer Records", customerGUI);
        tabbedPane.addTab("Software Categories", softwareCategoryGUI);
        tabbedPane.addTab("License Renewal", renewalGUI);

        add(tabbedPane);
        setVisible(true);
    }
}
