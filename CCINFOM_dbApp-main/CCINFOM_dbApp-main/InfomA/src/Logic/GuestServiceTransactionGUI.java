import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class GuestServiceTransactionGUI extends JFrame {

    // Guest Fields
    private JTextField guestIDField, firstNameField, lastNameField;
    private JTextField addressField, contactField, emailField;
    private JComboBox<String> idStatusBox;
    private JTextField trustRatingField;

    // Transaction Fields
    private JTextField transactionIDField, referenceIDField;
    private JComboBox<String> serviceTypeBox;
    private JTextField startDateField, endDateField;
    private JTextField baseAmountField, addChargesField, discountField;
    private JTextField finalAmountField;
    private JComboBox<String> paymentMethodBox;
    private JComboBox<String> paymentStatusBox;

    public GuestServiceTransactionGUI() {

        setTitle("Guest Service Payment & Activity Transaction");
        setSize(700, 700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(20, 2, 8, 8));
        panel.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));

        // --- Guest Record Management ---
        panel.add(new JLabel("Guest ID:"));
        guestIDField = new JTextField();
        panel.add(guestIDField);

        panel.add(new JLabel("First Name:"));
        firstNameField = new JTextField();
        panel.add(firstNameField);

        panel.add(new JLabel("Last Name:"));
        lastNameField = new JTextField();
        panel.add(lastNameField);

        panel.add(new JLabel("Address:"));
        addressField = new JTextField();
        panel.add(addressField);

        panel.add(new JLabel("Contact Number:"));
        contactField = new JTextField();
        panel.add(contactField);

        panel.add(new JLabel("Email:"));
        emailField = new JTextField();
        panel.add(emailField);

        panel.add(new JLabel("Valid ID Status:"));
        idStatusBox = new JComboBox<>(new String[]{"Verified", "Not Verified"});
        panel.add(idStatusBox);

        panel.add(new JLabel("Trust Rating:"));
        trustRatingField = new JTextField();
        panel.add(trustRatingField);

        // --- Transaction Record ---
        panel.add(new JLabel("Activity Transaction ID:"));
        transactionIDField = new JTextField();
        panel.add(transactionIDField);

        panel.add(new JLabel("Service Type:"));
        serviceTypeBox = new JComboBox<>(new String[]{"Accommodation", "Tour", "Combined"});
        panel.add(serviceTypeBox);

        panel.add(new JLabel("Reference ID:"));
        referenceIDField = new JTextField();
        panel.add(referenceIDField);

        panel.add(new JLabel("Activity Start Date (YYYY-MM-DD):"));
        startDateField = new JTextField();
        panel.add(startDateField);

        panel.add(new JLabel("Activity End Date (YYYY-MM-DD):"));
        endDateField = new JTextField();
        panel.add(endDateField);

        panel.add(new JLabel("Base Amount:"));
        baseAmountField = new JTextField();
        panel.add(baseAmountField);

        panel.add(new JLabel("Additional Charges:"));
        addChargesField = new JTextField();
        panel.add(addChargesField);

        panel.add(new JLabel("Discount Applied:"));
        discountField = new JTextField();
        panel.add(discountField);

        panel.add(new JLabel("Final Amount:"));
        finalAmountField = new JTextField();
        finalAmountField.setEditable(false);
        panel.add(finalAmountField);

        panel.add(new JLabel("Payment Method:"));
        paymentMethodBox = new JComboBox<>(new String[]{"Cash", "GCash", "Credit Card"});
        panel.add(paymentMethodBox);

        panel.add(new JLabel("Payment Status:"));
        paymentStatusBox = new JComboBox<>(new String[]{"Paid", "Pending", "Refunded"});
        panel.add(paymentStatusBox);

        JButton validateBtn = new JButton("Validate Guest");
        JButton computeBtn = new JButton("Compute Final Amount");
        JButton saveBtn = new JButton("Save Transaction");

        validateBtn.addActionListener(e -> validateGuest());
        computeBtn.addActionListener(e -> computeFinalAmount());
        saveBtn.addActionListener(e -> saveTransaction());

        panel.add(validateBtn);
        panel.add(computeBtn);
        panel.add(saveBtn);

        add(new JScrollPane(panel));
    }

    // --- Service: Guest Eligibility Verification ---
    private void validateGuest() {
        if (idStatusBox.getSelectedItem().equals("Not Verified")) {
            JOptionPane.showMessageDialog(this,
                    "Guest cannot proceed. ID Not Verified.",
                    "Validation Failed",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        int trust = Integer.parseInt(trustRatingField.getText());
        if (trust < 2) {
            JOptionPane.showMessageDialog(this,
                    "Guest trust rating too low.",
                    "Validation Failed",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        JOptionPane.showMessageDialog(this,
                "Guest Eligible for Transaction.",
                "Validated",
                JOptionPane.INFORMATION_MESSAGE);
    }

    // --- Service: Charge Computation ---
    private void computeFinalAmount() {
        try {
            double base = Double.parseDouble(baseAmountField.getText());
            double add = Double.parseDouble(addChargesField.getText());
            double discount = Double.parseDouble(discountField.getText());

            double finalAmount = base + add - discount;
            finalAmountField.setText(String.valueOf(finalAmount));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Invalid numeric input.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    // --- Service: Payment Tracking ---
    private void saveTransaction() {
        JOptionPane.showMessageDialog(this,
                "Transaction Saved Successfully!",
                "Success",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() ->
                new GuestServiceTransactionGUI().setVisible(true));
    }
}
