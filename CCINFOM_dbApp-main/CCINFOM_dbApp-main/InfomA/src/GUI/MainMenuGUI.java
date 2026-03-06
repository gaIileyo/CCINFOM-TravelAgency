package GUI;

import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

public class MainMenuGUI extends JPanel {

    public JButton btnCategoryReport = new JButton("Category Report");
    public JButton btnLicenseRenewal = new JButton("License Renewal");
    public JButton btnSoftwareCategory = new JButton("Software Category");

    public MainMenuGUI() {

        setLayout(new GridLayout(3, 1, 20, 20));
        setBorder(BorderFactory.createEmptyBorder(80, 200, 80, 200));

        add(btnCategoryReport);
        add(btnLicenseRenewal);
        add(btnSoftwareCategory);
    }
}
