package GUI;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SoftwareCategoryGUI extends JPanel {

    public JTextField txtCategoryName = new JTextField(15);
    public JTextField txtCategoryDesc = new JTextField(15);
    public JTextField txtCategoryIdSearch = new JTextField(10);

    public JButton btnAddCategory = new JButton("Add Category");
    public JButton btnViewCategory = new JButton("View Category Details");

    public JTextArea output = new JTextArea(15, 40);

    public SoftwareCategoryGUI() {

        setLayout(new BorderLayout(10,10));

        // ADD PANEL
        JPanel addPanel = new JPanel(new GridLayout(3, 2, 10, 10));
        addPanel.setBorder(BorderFactory.createTitledBorder("Add Software Category"));

        addPanel.add(new JLabel("Category Name:"));
        addPanel.add(txtCategoryName);

        addPanel.add(new JLabel("Description:"));
        addPanel.add(txtCategoryDesc);

        addPanel.add(new JLabel(""));
        addPanel.add(btnAddCategory);

        // VIEW PANEL
        JPanel viewPanel = new JPanel(new GridLayout(2, 2, 10, 10));
        viewPanel.setBorder(BorderFactory.createTitledBorder("View Category"));

        viewPanel.add(new JLabel("Category ID:"));
        viewPanel.add(txtCategoryIdSearch);
        viewPanel.add(new JLabel(""));
        viewPanel.add(btnViewCategory);

        // OUTPUT
        output.setEditable(false);
        JScrollPane scroll = new JScrollPane(output);
        scroll.setBorder(BorderFactory.createTitledBorder("Output"));

        JPanel topPanel = new JPanel(new GridLayout(2,1,10,10));
        topPanel.add(addPanel);
        topPanel.add(viewPanel);

        add(topPanel, BorderLayout.NORTH);
        add(scroll, BorderLayout.CENTER);
    }
}

