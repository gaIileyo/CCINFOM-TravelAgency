package GUI;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Modify_customer extends JPanel {

    public JTextField colName = new JTextField(15);
    public JTextField value = new JTextField(15);
    public JTextField id = new JTextField(15);
    public JButton submit = new JButton("Submit Modification");

    public Modify_customer() {

        setLayout(new BorderLayout());

        JPanel panel = new JPanel(new GridLayout(4, 2, 10, 10));
        panel.setBorder(BorderFactory.createTitledBorder("Modify Customer Record"));

        panel.add(new JLabel("Column Name:"));
        panel.add(colName);

        panel.add(new JLabel("New Value:"));
        panel.add(value);

        panel.add(new JLabel("Customer ID:"));
        panel.add(id);

        panel.add(new JLabel(""));
        panel.add(submit);

        add(panel, BorderLayout.CENTER);
    }

    public JTextField getColName() { return colName; }
    public JTextField getValue() { return value; }
    public JTextField getId() { return id; }
    public JButton getSubmitBtn() { return submit; }
}

