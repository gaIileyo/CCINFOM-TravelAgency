package GUI;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JTextField;

public class Add_guest extends JFrame {

    private JLayeredPane add_guest_layout = new JLayeredPane();

    private JTextField firstName = new JTextField();
    private JTextField lastName = new JTextField();
    private JTextField address = new JTextField();
    private JTextField contactNumber = new JTextField();
    private JTextField email = new JTextField();

    private JButton submitBtn = new JButton("Add Guest");

    // constructor
    public Add_guest() {
        super("Add Guest");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(650, 380);
        this.setResizable(false);
        this.setLayout(null);

        add_guest_layout.setBounds(0, 0, 650, 380);
        add_guest_layout.setBackground(Color.LIGHT_GRAY);
        add_guest_layout.setOpaque(true);

        inputFields();
        submitBtn();

        this.add(add_guest_layout);
        this.setVisible(true);
    }

    // setting input fields
    private void inputFields() {

        JLabel firstNameLabel = new JLabel("First Name:");
        JLabel lastNameLabel = new JLabel("Last Name:");
        JLabel addressLabel = new JLabel("Address:");
        JLabel contactNumberLabel = new JLabel("Contact Number:");
        JLabel emailLabel = new JLabel("Email Address:");

        firstNameLabel.setBounds(20, 10, 150, 40);
        lastNameLabel.setBounds(20, 55, 150, 40);
        addressLabel.setBounds(20, 100, 150, 40);
        contactNumberLabel.setBounds(20, 145, 150, 40);
        emailLabel.setBounds(20, 190, 150, 40);

        Font labelFont = new Font("SansSerif", Font.BOLD, 13);
        firstNameLabel.setFont(labelFont);
        lastNameLabel.setFont(labelFont);
        addressLabel.setFont(labelFont);
        contactNumberLabel.setFont(labelFont);
        emailLabel.setFont(labelFont);

        firstName.setBounds(170, 10, 430, 35);
        lastName.setBounds(170, 55, 430, 35);
        address.setBounds(170, 100, 430, 35);
        contactNumber.setBounds(170, 145, 430, 35);
        email.setBounds(170, 190, 430, 35);

        add_guest_layout.add(firstNameLabel, Integer.valueOf(0));
        add_guest_layout.add(lastNameLabel, Integer.valueOf(0));
        add_guest_layout.add(addressLabel, Integer.valueOf(0));
        add_guest_layout.add(contactNumberLabel, Integer.valueOf(0));
        add_guest_layout.add(emailLabel, Integer.valueOf(0));

        add_guest_layout.add(firstName, Integer.valueOf(0));
        add_guest_layout.add(lastName, Integer.valueOf(0));
        add_guest_layout.add(address, Integer.valueOf(0));
        add_guest_layout.add(contactNumber, Integer.valueOf(0));
        add_guest_layout.add(email, Integer.valueOf(0));
    }

    private void submitBtn() {
        submitBtn.setBounds(170, 260, 430, 35);
        submitBtn.setOpaque(true);
        add_guest_layout.add(submitBtn, Integer.valueOf(0));
    }

    /* =========================
       GETTERS
       ========================= */
    public JTextField getFirstName() {
        return firstName;
    }

    public JTextField getLastName() {
        return lastName;
    }

    public JTextField getAddress() {
        return address;
    }

    public JTextField getContactNumber() {
        return contactNumber;
    }

    public JTextField getEmail() {
        return email;
    }

    public JButton getSubmitBtn() {
        return submitBtn;
    }
}
