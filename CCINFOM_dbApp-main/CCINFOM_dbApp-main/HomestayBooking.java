import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;

public class HomestayBooking extends JFrame {

    private static class SelectionItem {
        private final String id;
        private final String label;

        SelectionItem(String id, String label) {
            this.id = id;
            this.label = label;
        }

        @Override
        public String toString() {
            return id + " - " + label;
        }
    }

    private Connection conn;
    private static final String DEFAULT_DB_NAME = "homestay_tour_system";
    private static final String DEFAULT_DB_HOST = "localhost";
    private static final String DEFAULT_DB_PORT = "3306";
    private static final String DEFAULT_DB_USER = "root";
    private static final String DEFAULT_DB_PASSWORD = "";
    private static final String MYSQL_DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";

    private JTable guideTable;
    private DefaultTableModel guideModel;

    private JTextField guideIdField;
    private JTextField guideLastNameField;
    private JTextField guideFirstNameField;
    private JTextField guideContactField;
    private JTextField guideLanguagesField;
    private JTextField guideDailyRateField;
    private JTextField guideDotField;
    private JTextField guideSearchField;

    private JComboBox<String> guideSpecializationCombo;

    public HomestayBooking() {
        connectDatabase();

        setTitle("Homestay Booking & Tour Management");
        setSize(1000, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JTabbedPane tabs = new JTabbedPane();

        // Functional tabs
        tabs.add("Homestay", homestayPanel());
        tabs.add("Guide", guidePanel());
        tabs.add("Tour Packages", tourPackagePanel());
        tabs.add("Guest Management", guestPanel());
        tabs.add("Guest Transaction", transactionPanel());
        tabs.add("Booking History Report", reportPanel());

        add(tabs);
        setVisible(true);
    }

    private void connectDatabase() {
        String dbHost = resolveConfig("db.host", "DB_HOST", DEFAULT_DB_HOST);
        String dbPort = resolveConfig("db.port", "DB_PORT", DEFAULT_DB_PORT);
        String dbName = resolveConfig("db.name", "DB_NAME", DEFAULT_DB_NAME);
        String dbUser = resolveConfig("db.user", "DB_USER", DEFAULT_DB_USER);
        String dbPassword = resolveConfig("db.password", "DB_PASSWORD", DEFAULT_DB_PASSWORD);
        String jdbcUrl = "jdbc:mysql://" + dbHost + ":" + dbPort + "/" + dbName
                + "?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";

        try {
            System.out.println("Trying DB connection to: " + jdbcUrl + " as user " + dbUser);
            Class.forName(MYSQL_DRIVER_CLASS);
            conn = DriverManager.getConnection(jdbcUrl, dbUser, dbPassword);
            System.out.println("Database connected successfully at " + dbHost + ":" + dbPort + "/" + dbName + ".");
        } catch (SQLException e) {
            conn = null;
            e.printStackTrace();
            JOptionPane.showMessageDialog(this,
                    "Database connection failed:\n" + e.getMessage() +
                            "\n\nCurrent DB settings:" +
                            "\nHost=" + dbHost +
                            "\nPort=" + dbPort +
                            "\nDatabase=" + dbName +
                            "\nUser=" + dbUser +
                            "\n\nTip: set DB_PASSWORD (or -Ddb.password) if your MySQL root account has a password.",
                    "Database Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            conn = null;
            JOptionPane.showMessageDialog(this,
                    "Database connection failed:\n" + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private String resolveConfig(String propertyKey, String envKey, String fallbackValue) {
        String propertyValue = System.getProperty(propertyKey);
        if (propertyValue != null && !propertyValue.isBlank()) {
            return propertyValue.trim();
        }
        String envValue = System.getenv(envKey);
        if (envValue != null && !envValue.isBlank()) {
            return envValue.trim();
        }
        return fallbackValue;
    }

    private JPanel guestPanel() {
        JPanel panel = new JPanel(new BorderLayout());
        DefaultTableModel model = new DefaultTableModel();
        JTable table = new JTable(model);

        model.setColumnIdentifiers(new String[]{
                "ID", "First Name", "Last Name", "Address",
                "Contact", "Email", "ID Status", "Trust Rating"
        });

        JButton loadBtn = new JButton("Load Guests");
        loadBtn.addActionListener(e -> {
            if (conn == null) {
                JOptionPane.showMessageDialog(this, "No database connection.");
                return;
            }
            String emailColumn = tableHasColumn("guest", "email")
                    ? "email"
                    : (tableHasColumn("guest", "email_address") ? "email_address" : null);
            try (Statement st = conn.createStatement();
                 ResultSet rs = st.executeQuery("SELECT * FROM guest")) {
                model.setRowCount(0);
                while (rs.next()) {
                    model.addRow(new Object[]{
                            rs.getString("guest_id"),
                            rs.getString("first_name"),
                            rs.getString("last_name"),
                            rs.getString("address"),
                            rs.getString("contact_number"),
                            emailColumn == null ? "" : rs.getString(emailColumn),
                            rs.getString("valid_id_status"),
                            rs.getDouble("trust_rating")
                    });
                }
                if (model.getRowCount() == 0) {
                    JOptionPane.showMessageDialog(this, "No guests found.");
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error loading guests: " + ex.getMessage());
            }
        });

        panel.add(new JScrollPane(table), BorderLayout.CENTER);
        panel.add(loadBtn, BorderLayout.SOUTH);

        return panel;
    }

    private JPanel homestayPanel() {
        JPanel panel = new JPanel(new BorderLayout());
        DefaultTableModel model = new DefaultTableModel();
        JTable table = new JTable(model);

        model.setColumnIdentifiers(new String[]{
                "Property ID", "Property Name", "Host Name", "Room Type",
                "Address", "Capacity", "Price/Night", "Amenities", "Availability"
        });

        JButton loadBtn = new JButton("Load Homestays");
        JButton seedBtn = new JButton("Add Sample Homestays");

        loadBtn.addActionListener(e -> loadHomestays(model));
        seedBtn.addActionListener(e -> {
            insertSampleHomestays();
            loadHomestays(model);
        });

        JPanel actions = new JPanel();
        actions.add(loadBtn);
        actions.add(seedBtn);

        panel.add(new JScrollPane(table), BorderLayout.CENTER);
        panel.add(actions, BorderLayout.SOUTH);
        return panel;
    }

    private void loadHomestays(DefaultTableModel model) {
        if (conn == null) {
            JOptionPane.showMessageDialog(this, "No database connection.");
            return;
        }

        try (Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery("SELECT * FROM homestay ORDER BY property_id")) {
            model.setRowCount(0);
            while (rs.next()) {
                model.addRow(new Object[]{
                        rs.getInt("property_id"),
                        rs.getString("property_name"),
                        rs.getString("host_name"),
                        rs.getString("room_type"),
                        rs.getString("address"),
                        rs.getInt("room_capacity"),
                        rs.getDouble("price_per_night"),
                        rs.getString("amenities"),
                        rs.getString("availability_status")
                });
            }
            if (model.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "No homestays found. Click 'Add Sample Homestays'.");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error loading homestays: " + ex.getMessage());
        }
    }

    private void insertSampleHomestays() {
        if (conn == null) {
            JOptionPane.showMessageDialog(this, "No database connection.");
            return;
        }

        String[] inserts = new String[]{
                "INSERT INTO homestay (property_name, host_name, room_type, address, room_capacity, price_per_night, amenities, availability_status) " +
                        "SELECT 'Baguio Pine Stay','Ana Dela Cruz','Solo','Baguio City',2,1800.00,'WiFi, Heater, Breakfast','Available' " +
                        "WHERE NOT EXISTS (SELECT 1 FROM homestay WHERE property_name='Baguio Pine Stay')",
                "INSERT INTO homestay (property_name, host_name, room_type, address, room_capacity, price_per_night, amenities, availability_status) " +
                        "SELECT 'Cebu Family Villa','Mark Reyes','Family','Cebu City',6,4200.00,'Pool, Kitchen, Parking','Available' " +
                        "WHERE NOT EXISTS (SELECT 1 FROM homestay WHERE property_name='Cebu Family Villa')",
                "INSERT INTO homestay (property_name, host_name, room_type, address, room_capacity, price_per_night, amenities, availability_status) " +
                        "SELECT 'Vigan Heritage House','Liza Santos','Family','Vigan, Ilocos Sur',4,3500.00,'WiFi, Breakfast, AC','Booked' " +
                        "WHERE NOT EXISTS (SELECT 1 FROM homestay WHERE property_name='Vigan Heritage House')"
        };

        try (Statement st = conn.createStatement()) {
            int affectedRows = 0;
            for (String sql : inserts) {
                affectedRows += st.executeUpdate(sql);
            }
            JOptionPane.showMessageDialog(this, "Sample homestays processed. New rows added: " + affectedRows);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error adding sample homestays: " + ex.getMessage());
        }
    }


    private JPanel guidePanel() {
        JPanel panel = new JPanel(new BorderLayout(10, 10));
    
        JPanel formPanel = new JPanel(new GridLayout(9, 2, 8, 8));
    
        guideIdField = new JTextField();
        guideIdField.setEditable(false);
    
        guideLastNameField = new JTextField();
        guideFirstNameField = new JTextField();
        guideContactField = new JTextField();
        guideLanguagesField = new JTextField();
        guideDailyRateField = new JTextField();
        guideDotField = new JTextField();
        guideSearchField = new JTextField();
    
        guideSpecializationCombo = new JComboBox<>(new String[]{
                "City Tour", "Heritage", "Food"
        });
    
        formPanel.add(new JLabel("Guide ID:"));
        formPanel.add(guideIdField);
    
        formPanel.add(new JLabel("Last Name:"));
        formPanel.add(guideLastNameField);
    
        formPanel.add(new JLabel("First Name:"));
        formPanel.add(guideFirstNameField);
    
        formPanel.add(new JLabel("Contact Number:"));
        formPanel.add(guideContactField);
    
        formPanel.add(new JLabel("Specialization:"));
        formPanel.add(guideSpecializationCombo);
    
        formPanel.add(new JLabel("Languages Spoken:"));
        formPanel.add(guideLanguagesField);
    
        formPanel.add(new JLabel("Daily Service Rate:"));
        formPanel.add(guideDailyRateField);
    
        formPanel.add(new JLabel("DOT Accreditation No.:"));
        formPanel.add(guideDotField);
    
        formPanel.add(new JLabel("Search:"));
        formPanel.add(guideSearchField);
    
        guideModel = new DefaultTableModel();
        guideModel.setColumnIdentifiers(new String[]{
                "Guide ID", "Last Name", "First Name", "Contact", "Specialization",
                "Languages", "Daily Rate", "DOT Accreditation"
        });
    
        guideTable = new JTable(guideModel);
        guideTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
    
        JButton loadBtn = new JButton("Load Guides");
        JButton seedBtn = new JButton("Add Sample Guides");
        JButton addBtn = new JButton("Add Guide");
        JButton updateBtn = new JButton("Update Guide");
        JButton deleteBtn = new JButton("Delete Guide");
        JButton clearBtn = new JButton("Clear");
    
        loadBtn.addActionListener(e -> loadGuides(guideModel));
        seedBtn.addActionListener(e -> {
            insertSampleGuides();
            loadGuides(guideModel);
        });
        addBtn.addActionListener(e -> addGuide());
        updateBtn.addActionListener(e -> updateGuide());
        deleteBtn.addActionListener(e -> deleteGuide());
        clearBtn.addActionListener(e -> clearGuideFields());
    
        guideTable.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                populateGuideFieldsFromTable();
            }
        });
    
        guideSearchField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                searchGuides();
            }
    
            @Override
            public void removeUpdate(DocumentEvent e) {
                searchGuides();
            }
    
            @Override
            public void changedUpdate(DocumentEvent e) {
                searchGuides();
            }
        });
    
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(loadBtn);
        buttonPanel.add(seedBtn);
        buttonPanel.add(addBtn);
        buttonPanel.add(updateBtn);
        buttonPanel.add(deleteBtn);
        buttonPanel.add(clearBtn);
    
        JPanel topPanel = new JPanel(new BorderLayout(10, 10));
        topPanel.add(formPanel, BorderLayout.CENTER);
        topPanel.add(buttonPanel, BorderLayout.SOUTH);
    
        panel.add(topPanel, BorderLayout.NORTH);
        panel.add(new JScrollPane(guideTable), BorderLayout.CENTER);
    
        return panel;
    }

    private void loadGuides(DefaultTableModel model) {
        if (conn == null) {
            JOptionPane.showMessageDialog(this, "No database connection.");
            return;
        }

        try (Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery("SELECT * FROM guide ORDER BY guide_id")) {
            model.setRowCount(0);
            while (rs.next()) {
                model.addRow(new Object[]{
                        rs.getInt("guide_id"),
                        rs.getString("last_name"),
                        rs.getString("first_name"),
                        rs.getString("contact_number"),
                        rs.getString("specialization"),
                        rs.getString("languages_spoken"),
                        rs.getDouble("daily_service_rate"),
                        rs.getString("dot_accreditation_number")
                });
            }
            if (model.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "No guides found. Click 'Add Sample Guides'.");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error loading guides: " + ex.getMessage());
        }
    }

    private void populateGuideFieldsFromTable() {
        int row = guideTable.getSelectedRow();
        if (row == -1) {
            return;
        }
    
        guideIdField.setText(guideModel.getValueAt(row, 0).toString());
        guideLastNameField.setText(guideModel.getValueAt(row, 1).toString());
        guideFirstNameField.setText(guideModel.getValueAt(row, 2).toString());
        guideContactField.setText(guideModel.getValueAt(row, 3).toString());
        guideSpecializationCombo.setSelectedItem(guideModel.getValueAt(row, 4).toString());
        guideLanguagesField.setText(guideModel.getValueAt(row, 5) == null ? "" : guideModel.getValueAt(row, 5).toString());
        guideDailyRateField.setText(guideModel.getValueAt(row, 6).toString());
        guideDotField.setText(guideModel.getValueAt(row, 7).toString());
    }

    private void clearGuideFields() {
        guideIdField.setText("");
        guideLastNameField.setText("");
        guideFirstNameField.setText("");
        guideContactField.setText("");
        guideSpecializationCombo.setSelectedIndex(0);
        guideLanguagesField.setText("");
        guideDailyRateField.setText("");
        guideDotField.setText("");
        guideTable.clearSelection();
    }

    private void addGuide() {
        if (conn == null) {
            JOptionPane.showMessageDialog(this, "No database connection.");
            return;
        }
    
        String lastName = guideLastNameField.getText().trim();
        String firstName = guideFirstNameField.getText().trim();
        String contact = guideContactField.getText().trim();
        String specialization = (String) guideSpecializationCombo.getSelectedItem();
        String languages = guideLanguagesField.getText().trim();
        String rateText = guideDailyRateField.getText().trim();
        String dot = guideDotField.getText().trim();
    
        if (lastName.isEmpty() || firstName.isEmpty() || contact.isEmpty() || rateText.isEmpty() || dot.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all required guide fields.");
            return;
        }
    
        double rate;
        try {
            rate = Double.parseDouble(rateText);
            if (rate < 0) {
                JOptionPane.showMessageDialog(this, "Daily service rate cannot be negative.");
                return;
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Daily service rate must be a valid number.");
            return;
        }
    
        String sql = """
            INSERT INTO guide
            (last_name, first_name, contact_number, specialization, languages_spoken, daily_service_rate, dot_accreditation_number)
            VALUES (?, ?, ?, ?, ?, ?, ?)
        """;
    
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, lastName);
            ps.setString(2, firstName);
            ps.setString(3, contact);
            ps.setString(4, specialization);
            ps.setString(5, languages);
            ps.setDouble(6, rate);
            ps.setString(7, dot);
    
            ps.executeUpdate();
    
            JOptionPane.showMessageDialog(this, "Guide added successfully.");
            clearGuideFields();
            loadGuides(guideModel);
    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error adding guide: " + ex.getMessage());
        }
    }

    private void updateGuide() {
        if (conn == null) {
            JOptionPane.showMessageDialog(this, "No database connection.");
            return;
        }
    
        String idText = guideIdField.getText().trim();
        if (idText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please select a guide to update.");
            return;
        }
    
        String lastName = guideLastNameField.getText().trim();
        String firstName = guideFirstNameField.getText().trim();
        String contact = guideContactField.getText().trim();
        String specialization = (String) guideSpecializationCombo.getSelectedItem();
        String languages = guideLanguagesField.getText().trim();
        String rateText = guideDailyRateField.getText().trim();
        String dot = guideDotField.getText().trim();
    
        if (lastName.isEmpty() || firstName.isEmpty() || contact.isEmpty() || rateText.isEmpty() || dot.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all required guide fields.");
            return;
        }
    
        double rate;
        try {
            rate = Double.parseDouble(rateText);
            if (rate < 0) {
                JOptionPane.showMessageDialog(this, "Daily service rate cannot be negative.");
                return;
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Daily service rate must be a valid number.");
            return;
        }
    
        String sql = """
            UPDATE guide
            SET last_name = ?, first_name = ?, contact_number = ?, specialization = ?,
                languages_spoken = ?, daily_service_rate = ?, dot_accreditation_number = ?
            WHERE guide_id = ?
        """;
    
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, lastName);
            ps.setString(2, firstName);
            ps.setString(3, contact);
            ps.setString(4, specialization);
            ps.setString(5, languages);
            ps.setDouble(6, rate);
            ps.setString(7, dot);
            ps.setInt(8, Integer.parseInt(idText));
    
            int updated = ps.executeUpdate();
    
            if (updated > 0) {
                JOptionPane.showMessageDialog(this, "Guide updated successfully.");
                clearGuideFields();
                loadGuides(guideModel);
            } else {
                JOptionPane.showMessageDialog(this, "No guide record was updated.");
            }
    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error updating guide: " + ex.getMessage());
        }
    }

    private void deleteGuide() {
        if (conn == null) {
            JOptionPane.showMessageDialog(this, "No database connection.");
            return;
        }
    
        String idText = guideIdField.getText().trim();
        if (idText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please select a guide to delete.");
            return;
        }
    
        int confirm = JOptionPane.showConfirmDialog(
                this,
                "Are you sure you want to delete this guide?",
                "Confirm Delete",
                JOptionPane.YES_NO_OPTION
        );
    
        if (confirm != JOptionPane.YES_OPTION) {
            return;
        }
    
        String sql = "DELETE FROM guide WHERE guide_id = ?";
    
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, Integer.parseInt(idText));
    
            int deleted = ps.executeUpdate();
    
            if (deleted > 0) {
                JOptionPane.showMessageDialog(this, "Guide deleted successfully.");
                clearGuideFields();
                loadGuides(guideModel);
            } else {
                JOptionPane.showMessageDialog(this, "No guide record was deleted.");
            }
    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error deleting guide: " + ex.getMessage());
        }
    }

    private void searchGuides() {
        if (conn == null) {
            JOptionPane.showMessageDialog(this, "No database connection.");
            return;
        }
    
        String keyword = guideSearchField.getText().trim();
    
        if (keyword.isEmpty()) {
            loadGuides(guideModel);
            return;
        }
    
        String sql = """
            SELECT * FROM guide
            WHERE CAST(guide_id AS CHAR) LIKE ?
               OR last_name LIKE ?
               OR first_name LIKE ?
               OR contact_number LIKE ?
               OR specialization LIKE ?
               OR languages_spoken LIKE ?
               OR CAST(daily_service_rate AS CHAR) LIKE ?
               OR dot_accreditation_number LIKE ?
            ORDER BY guide_id
        """;
    
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            String searchText = "%" + keyword + "%";
    
            ps.setString(1, searchText);
            ps.setString(2, searchText);
            ps.setString(3, searchText);
            ps.setString(4, searchText);
            ps.setString(5, searchText);
            ps.setString(6, searchText);
            ps.setString(7, searchText);
            ps.setString(8, searchText);
    
            try (ResultSet rs = ps.executeQuery()) {
                guideModel.setRowCount(0);
    
                while (rs.next()) {
                    guideModel.addRow(new Object[]{
                            rs.getInt("guide_id"),
                            rs.getString("last_name"),
                            rs.getString("first_name"),
                            rs.getString("contact_number"),
                            rs.getString("specialization"),
                            rs.getString("languages_spoken"),
                            rs.getDouble("daily_service_rate"),
                            rs.getString("dot_accreditation_number")
                    });
                }
            }
    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error searching guides: " + ex.getMessage());
        }
    }

    private void insertSampleGuides() {
        if (conn == null) {
            JOptionPane.showMessageDialog(this, "No database connection.");
            return;
        }

        String[] inserts = new String[]{
                "INSERT INTO guide (last_name, first_name, contact_number, specialization, languages_spoken, daily_service_rate, dot_accreditation_number) " +
                        "SELECT 'Garcia','Juan','09170000001','City Tour','English, Filipino',1500.00,'DOT-CT-1001' " +
                        "WHERE NOT EXISTS (SELECT 1 FROM guide WHERE last_name='Garcia' AND first_name='Juan')",
                "INSERT INTO guide (last_name, first_name, contact_number, specialization, languages_spoken, daily_service_rate, dot_accreditation_number) " +
                        "SELECT 'Santos','Ana','09170000002','Heritage','English, Filipino',1700.00,'DOT-HG-1002' " +
                        "WHERE NOT EXISTS (SELECT 1 FROM guide WHERE last_name='Santos' AND first_name='Ana')",
                "INSERT INTO guide (last_name, first_name, contact_number, specialization, languages_spoken, daily_service_rate, dot_accreditation_number) " +
                        "SELECT 'Reyes','Pedro','09170000003','Food','English, Filipino',1600.00,'DOT-FD-1003' " +
                        "WHERE NOT EXISTS (SELECT 1 FROM guide WHERE last_name='Reyes' AND first_name='Pedro')"
        };

        try (Statement st = conn.createStatement()) {
            int affectedRows = 0;
            for (String sql : inserts) {
                affectedRows += st.executeUpdate(sql);
            }
            JOptionPane.showMessageDialog(this, "Sample guides processed. New rows added: " + affectedRows);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error adding sample guides: " + ex.getMessage());
        }
    }

    private JPanel tourPackagePanel() {
        JPanel panel = new JPanel(new BorderLayout());
        DefaultTableModel model = new DefaultTableModel();
        JTable table = new JTable(model);

        model.setColumnIdentifiers(new String[]{
                "Package ID", "Package Name", "Category", "Duration",
                "Price", "Max Guests", "Inclusions"
        });

        JButton loadBtn = new JButton("Load Tour Packages");
        JButton seedBtn = new JButton("Add Sample Tour Packages");

        loadBtn.addActionListener(e -> loadTourPackages(model));
        seedBtn.addActionListener(e -> {
            insertSampleTourPackages();
            loadTourPackages(model);
        });

        JPanel actions = new JPanel();
        actions.add(loadBtn);
        actions.add(seedBtn);

        panel.add(new JScrollPane(table), BorderLayout.CENTER);
        panel.add(actions, BorderLayout.SOUTH);
        return panel;
    }

    private void loadTourPackages(DefaultTableModel model) {
        if (conn == null) {
            JOptionPane.showMessageDialog(this, "No database connection.");
            return;
        }

        try (Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery("SELECT * FROM tour_package ORDER BY package_id")) {
            model.setRowCount(0);
            while (rs.next()) {
                model.addRow(new Object[]{
                        rs.getInt("package_id"),
                        rs.getString("package_name"),
                        rs.getString("category"),
                        rs.getString("duration"),
                        rs.getDouble("price"),
                        rs.getInt("max_guests"),
                        rs.getString("inclusions")
                });
            }
            if (model.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "No tour packages found. Click 'Add Sample Tour Packages'.");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error loading tour packages: " + ex.getMessage());
        }
    }

    private void insertSampleTourPackages() {
        if (conn == null) {
            JOptionPane.showMessageDialog(this, "No database connection.");
            return;
        }

        String[] inserts = new String[]{
                "INSERT INTO tour_package (package_name, category, duration, price, max_guests, inclusions) " +
                        "SELECT 'Intramuros City Highlights','City Tour','1 Day',1800.00,20,'Transport, guide, lunch' " +
                        "WHERE NOT EXISTS (SELECT 1 FROM tour_package WHERE package_name='Intramuros City Highlights')",
                "INSERT INTO tour_package (package_name, category, duration, price, max_guests, inclusions) " +
                        "SELECT 'Manila Heritage Walk','Heritage','Half Day',1200.00,15,'Licensed guide, museum entry, bottled water' " +
                        "WHERE NOT EXISTS (SELECT 1 FROM tour_package WHERE package_name='Manila Heritage Walk')",
                "INSERT INTO tour_package (package_name, category, duration, price, max_guests, inclusions) " +
                        "SELECT 'Binondo Food Adventure','Food','Evening',1500.00,12,'Food tastings, guide, local maps' " +
                        "WHERE NOT EXISTS (SELECT 1 FROM tour_package WHERE package_name='Binondo Food Adventure')"
        };

        try (Statement st = conn.createStatement()) {
            int affectedRows = 0;
            for (String sql : inserts) {
                affectedRows += st.executeUpdate(sql);
            }
            JOptionPane.showMessageDialog(this, "Sample tour packages processed. New rows added: " + affectedRows);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error adding sample tour packages: " + ex.getMessage());
        }
    }

    private JPanel transactionPanel() {
        JPanel panel = new JPanel(new BorderLayout(8, 8));
        JPanel formPanel = new JPanel(new GridLayout(16, 2, 5, 5));

        JComboBox<SelectionItem> guestCombo = new JComboBox<>();
        JComboBox<SelectionItem> homestayCombo = new JComboBox<>();
        JComboBox<SelectionItem> guideCombo = new JComboBox<>();
        JComboBox<SelectionItem> tourCombo = new JComboBox<>();
        JComboBox<String> serviceType = new JComboBox<>(new String[]{"Accommodation", "Tour", "Combined"});
        JTextField startDate = new JTextField("2025-05-01");
        JTextField endDate = new JTextField("2025-05-02");
        JTextField baseAmount = new JTextField();
        JTextField additional = new JTextField("0");
        JTextField discount = new JTextField("0");
        JTextField finalAmount = new JTextField();
        finalAmount.setEditable(false);
        JComboBox<String> paymentMethod = new JComboBox<>(new String[]{"Cash", "GCash", "Credit Card", "Bank Transfer"});
        JComboBox<String> paymentStatus = new JComboBox<>(new String[]{"Paid", "Pending", "Refunded"});

        JButton refreshBtn = new JButton("Refresh Dropdown Values");
        JButton computeBtn = new JButton("Compute Final Amount");
        JButton saveBtn = new JButton("Save Transaction");
    JButton viewHistoryBtn = new JButton("Refresh Transaction History");

    DefaultTableModel historyModel = new DefaultTableModel();
    JTable historyTable = new JTable(historyModel);
    historyModel.setColumnIdentifiers(new String[]{
        "Transaction ID", "Guest", "Service", "Reference", "Start Date", "End Date", "Final Amount", "Payment Status"
    });

    formPanel.add(new JLabel("Guest:")); formPanel.add(guestCombo);
    formPanel.add(new JLabel("Homestay (for Accommodation/Combined):")); formPanel.add(homestayCombo);
    formPanel.add(new JLabel("Guide (for Tour/Combined):")); formPanel.add(guideCombo);
    formPanel.add(new JLabel("Tour Package (for Tour/Combined):")); formPanel.add(tourCombo);
    formPanel.add(new JLabel("Service Type:")); formPanel.add(serviceType);
    formPanel.add(new JLabel("Start Date (YYYY-MM-DD):")); formPanel.add(startDate);
    formPanel.add(new JLabel("End Date:")); formPanel.add(endDate);
    formPanel.add(new JLabel("Base Amount:")); formPanel.add(baseAmount);
    formPanel.add(new JLabel("Additional Charges:")); formPanel.add(additional);
    formPanel.add(new JLabel("Discount:")); formPanel.add(discount);
    formPanel.add(new JLabel("Final Amount:")); formPanel.add(finalAmount);
    formPanel.add(new JLabel("Payment Method:")); formPanel.add(paymentMethod);
    formPanel.add(new JLabel("Payment Status:")); formPanel.add(paymentStatus);
    formPanel.add(refreshBtn); formPanel.add(viewHistoryBtn);
    formPanel.add(computeBtn); formPanel.add(saveBtn);

        loadTransactionDropdowns(guestCombo, homestayCombo, guideCombo, tourCombo);
        loadTransactionHistory(historyModel);
        updateTransactionReferenceFieldState(serviceType, homestayCombo, guideCombo, tourCombo);
        autoFillBaseAmount(serviceType, homestayCombo, tourCombo, baseAmount, additional, discount, finalAmount);

        refreshBtn.addActionListener(e -> {
            loadTransactionDropdowns(guestCombo, homestayCombo, guideCombo, tourCombo);
            loadTransactionHistory(historyModel);
            updateTransactionReferenceFieldState(serviceType, homestayCombo, guideCombo, tourCombo);
            autoFillBaseAmount(serviceType, homestayCombo, tourCombo, baseAmount, additional, discount, finalAmount);
        });
        viewHistoryBtn.addActionListener(e -> loadTransactionHistory(historyModel));
        serviceType.addActionListener(e -> {
            updateTransactionReferenceFieldState(serviceType, homestayCombo, guideCombo, tourCombo);
            autoFillBaseAmount(serviceType, homestayCombo, tourCombo, baseAmount, additional, discount, finalAmount);
        });
        homestayCombo.addActionListener(e -> autoFillBaseAmount(serviceType, homestayCombo, tourCombo, baseAmount, additional, discount, finalAmount));
        tourCombo.addActionListener(e -> autoFillBaseAmount(serviceType, homestayCombo, tourCombo, baseAmount, additional, discount, finalAmount));
        addLiveFinalAmountListener(additional, baseAmount, additional, discount, finalAmount);
        addLiveFinalAmountListener(discount, baseAmount, additional, discount, finalAmount);
        additional.addActionListener(e -> updateFinalAmount(baseAmount, additional, discount, finalAmount));
        discount.addActionListener(e -> updateFinalAmount(baseAmount, additional, discount, finalAmount));

        computeBtn.addActionListener(e -> {
            try {
                double base = Double.parseDouble(baseAmount.getText());
                double add = Double.parseDouble(additional.getText());
                double dis = Double.parseDouble(discount.getText());
                finalAmount.setText(String.valueOf(base + add - dis));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Invalid amount values.");
            }
        });

        saveBtn.addActionListener(e -> {
            if (conn == null) {
                JOptionPane.showMessageDialog(this, "No database connection.");
                return;
            }
            try {
                SelectionItem selectedGuest = (SelectionItem) guestCombo.getSelectedItem();
                SelectionItem selectedHomestay = (SelectionItem) homestayCombo.getSelectedItem();
                SelectionItem selectedGuide = (SelectionItem) guideCombo.getSelectedItem();
                SelectionItem selectedTour = (SelectionItem) tourCombo.getSelectedItem();

                if (selectedGuest == null) {
                    JOptionPane.showMessageDialog(this, "Guest is required.");
                    return;
                }

                String selectedServiceType = serviceType.getSelectedItem().toString();
                int referenceId;

                if ("Accommodation".equals(selectedServiceType)) {
                    if (selectedHomestay == null) {
                        JOptionPane.showMessageDialog(this, "Please select a homestay for Accommodation service.");
                        return;
                    }
                    referenceId = parseReferenceId(selectedHomestay.id);
                } else if ("Tour".equals(selectedServiceType)) {
                    if (selectedTour == null) {
                        JOptionPane.showMessageDialog(this, "Please select a tour package for Tour service.");
                        return;
                    }
                    referenceId = parseReferenceId(selectedTour.id);
                } else {
                    if (selectedHomestay == null || selectedTour == null) {
                        JOptionPane.showMessageDialog(this, "Please select both homestay and tour package for Combined service.");
                        return;
                    }
                    referenceId = parseReferenceId(selectedTour.id);
                }

                if (finalAmount.getText().trim().isEmpty()) {
                    double base = Double.parseDouble(baseAmount.getText());
                    double add = Double.parseDouble(additional.getText());
                    double dis = Double.parseDouble(discount.getText());
                    finalAmount.setText(String.valueOf(base + add - dis));
                }

                boolean hasPropertyIdColumn = tableHasColumn("guest_activity_transaction", "property_id");
                boolean hasGuideIdColumn = tableHasColumn("guest_activity_transaction", "guide_id");

                StringBuilder columns = new StringBuilder("(guest_id, service_type, reference_id, activity_start_date, activity_end_date, base_amount, additional_charges, discount_applied, final_amount, payment_method, payment_confirmation_status");
                StringBuilder placeholders = new StringBuilder("(?,?,?,?,?,?,?,?,?,?,?");
                List<Object> params = new ArrayList<>();

                params.add(selectedGuest.id);
                params.add(selectedServiceType);
                params.add(referenceId);
                params.add(Date.valueOf(startDate.getText()));
                params.add(Date.valueOf(endDate.getText()));
                params.add(Double.parseDouble(baseAmount.getText()));
                params.add(Double.parseDouble(additional.getText()));
                params.add(Double.parseDouble(discount.getText()));
                params.add(Double.parseDouble(finalAmount.getText()));
                params.add(paymentMethod.getSelectedItem().toString());
                params.add(paymentStatus.getSelectedItem().toString());

                if (hasPropertyIdColumn) {
                    columns.append(", property_id");
                    placeholders.append(",?");
                    params.add(selectedHomestay != null ? selectedHomestay.id : null);
                }

                if (hasGuideIdColumn) {
                    columns.append(", guide_id");
                    placeholders.append(",?");
                    params.add(selectedGuide != null ? selectedGuide.id : null);
                }

                columns.append(")");
                placeholders.append(")");

                String insertSQL = "INSERT INTO guest_activity_transaction " + columns + " VALUES " + placeholders;

                try (PreparedStatement ps = conn.prepareStatement(insertSQL)) {
                    for (int i = 0; i < params.size(); i++) {
                        ps.setObject(i + 1, params.get(i));
                    }
                    ps.executeUpdate();
                }

                JOptionPane.showMessageDialog(this, "Transaction saved successfully!");
                loadTransactionHistory(historyModel);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error saving transaction:\n" + ex.getMessage());
            }
        });

        panel.add(formPanel, BorderLayout.NORTH);
        panel.add(new JScrollPane(historyTable), BorderLayout.CENTER);

        return panel;
    }

    private void loadTransactionHistory(DefaultTableModel model) {
        model.setRowCount(0);

        if (conn == null) {
            return;
        }

        String idColumn = tableHasColumn("guest_activity_transaction", "activity_transaction_id")
            ? "activity_transaction_id"
            : (tableHasColumn("guest_activity_transaction", "transaction_id") ? "transaction_id" : null);

        if (idColumn == null) {
            JOptionPane.showMessageDialog(this, "Transaction history could not be loaded: no transaction ID column found.");
            return;
        }

        String sql = "SELECT gat." + idColumn + " AS txn_id, " +
                "COALESCE(CONCAT(g.first_name, ' ', g.last_name), gat.guest_id) AS guest_name, " +
                "gat.service_type, gat.reference_id, gat.activity_start_date, gat.activity_end_date, " +
                "gat.final_amount, gat.payment_confirmation_status " +
                "FROM guest_activity_transaction gat " +
                "LEFT JOIN guest g ON g.guest_id = gat.guest_id " +
            "ORDER BY gat.activity_start_date DESC, gat." + idColumn + " DESC";

        try (Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                model.addRow(new Object[]{
                rs.getObject("txn_id"),
                        rs.getString("guest_name"),
                        rs.getString("service_type"),
                        rs.getObject("reference_id"),
                        rs.getDate("activity_start_date"),
                        rs.getDate("activity_end_date"),
                        rs.getDouble("final_amount"),
                        rs.getString("payment_confirmation_status")
                });
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error loading transaction history: " + ex.getMessage());
        }
    }

    private void autoFillBaseAmount(JComboBox<String> serviceType,
                                    JComboBox<SelectionItem> homestayCombo,
                                    JComboBox<SelectionItem> tourCombo,
                                    JTextField baseAmount,
                                    JTextField additional,
                                    JTextField discount,
                                    JTextField finalAmount) {
        String selectedService = serviceType.getSelectedItem().toString();
        SelectionItem selectedHomestay = (SelectionItem) homestayCombo.getSelectedItem();
        SelectionItem selectedTour = (SelectionItem) tourCombo.getSelectedItem();

        double baseValue = 0;

        if ("Accommodation".equals(selectedService)) {
            if (selectedHomestay != null) {
                baseValue = getPriceById("homestay", "property_id", "price_per_night", selectedHomestay.id);
            }
        } else if ("Tour".equals(selectedService)) {
            if (selectedTour != null) {
                baseValue = getPriceById("tour_package", "package_id", "price", selectedTour.id);
            }
        } else {
            if (selectedHomestay != null) {
                baseValue += getPriceById("homestay", "property_id", "price_per_night", selectedHomestay.id);
            }
            if (selectedTour != null) {
                baseValue += getPriceById("tour_package", "package_id", "price", selectedTour.id);
            }
        }

        baseAmount.setText(String.format("%.2f", baseValue));
        updateFinalAmount(baseAmount, additional, discount, finalAmount);
    }

    private double getPriceById(String tableName, String idColumn, String priceColumn, String idValue) {
        if (conn == null || idValue == null || idValue.trim().isEmpty()) {
            return 0;
        }

        String sql = "SELECT " + priceColumn + " FROM " + tableName + " WHERE " + idColumn + " = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, idValue);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return rs.getDouble(1);
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error loading base amount: " + ex.getMessage());
        }
        return 0;
    }

    private void updateFinalAmount(JTextField baseAmount, JTextField additional, JTextField discount, JTextField finalAmount) {
        try {
            double base = Double.parseDouble(baseAmount.getText().trim());
            double add = Double.parseDouble(additional.getText().trim());
            double dis = Double.parseDouble(discount.getText().trim());
            finalAmount.setText(String.format("%.2f", base + add - dis));
        } catch (Exception ignored) {
        }
    }

    private void addLiveFinalAmountListener(JTextField sourceField,
                                            JTextField baseAmount,
                                            JTextField additional,
                                            JTextField discount,
                                            JTextField finalAmount) {
        sourceField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateFinalAmount(baseAmount, additional, discount, finalAmount);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateFinalAmount(baseAmount, additional, discount, finalAmount);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                updateFinalAmount(baseAmount, additional, discount, finalAmount);
            }
        });
    }

    private void loadTransactionDropdowns(JComboBox<SelectionItem> guestCombo,
                                          JComboBox<SelectionItem> homestayCombo,
                                          JComboBox<SelectionItem> guideCombo,
                                          JComboBox<SelectionItem> tourCombo) {
        if (conn == null) {
            JOptionPane.showMessageDialog(this, "No database connection.");
            return;
        }

        loadSelectionItems(guestCombo,
                "SELECT guest_id AS item_id, CONCAT(first_name, ' ', last_name) AS item_label FROM guest ORDER BY guest_id");
        loadSelectionItems(homestayCombo,
                "SELECT property_id AS item_id, property_name AS item_label FROM homestay ORDER BY property_id");
        loadSelectionItems(guideCombo,
                "SELECT guide_id AS item_id, CONCAT(first_name, ' ', last_name) AS item_label FROM guide ORDER BY guide_id");
        loadSelectionItems(tourCombo,
                "SELECT package_id AS item_id, package_name AS item_label FROM tour_package ORDER BY package_id");
    }

    private void loadSelectionItems(JComboBox<SelectionItem> combo, String sql) {
        combo.removeAllItems();
        try (Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                combo.addItem(new SelectionItem(rs.getString("item_id"), rs.getString("item_label")));
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error loading dropdown values: " + ex.getMessage());
        }
    }

    private void updateTransactionReferenceFieldState(JComboBox<String> serviceType,
                                                      JComboBox<SelectionItem> homestayCombo,
                                                      JComboBox<SelectionItem> guideCombo,
                                                      JComboBox<SelectionItem> tourCombo) {
        String selectedService = serviceType.getSelectedItem().toString();

        if ("Accommodation".equals(selectedService)) {
            homestayCombo.setEnabled(true);
            guideCombo.setEnabled(false);
            tourCombo.setEnabled(false);
        } else if ("Tour".equals(selectedService)) {
            homestayCombo.setEnabled(false);
            guideCombo.setEnabled(true);
            tourCombo.setEnabled(true);
        } else {
            homestayCombo.setEnabled(true);
            guideCombo.setEnabled(true);
            tourCombo.setEnabled(true);
        }
    }

    private int parseReferenceId(String rawId) {
        String digitsOnly = rawId == null ? "" : rawId.replaceAll("[^0-9]", "");
        if (digitsOnly.isEmpty()) {
            throw new IllegalArgumentException("Selected value does not contain a numeric reference ID.");
        }
        return Integer.parseInt(digitsOnly);
    }

    private boolean tableHasColumn(String tableName, String columnName) {
        if (conn == null) {
            return false;
        }

        try (ResultSet rs = conn.getMetaData().getColumns(conn.getCatalog(), null, tableName, columnName)) {
            return rs.next();
        } catch (Exception ex) {
            return false;
        }
    }

    // -------------------------
    // REPORT PANEL
    // -------------------------
    private JPanel reportPanel() {
        JPanel panel = new JPanel(new BorderLayout());
        JPanel top = new JPanel();
        JTextField monthField = new JTextField(5);
        JTextField yearField = new JTextField(5);
        JButton generateBtn = new JButton("Generate Report");
        top.add(new JLabel("Month:")); top.add(monthField);
        top.add(new JLabel("Year:")); top.add(yearField);
        top.add(generateBtn);

        DefaultTableModel model = new DefaultTableModel();
        JTable table = new JTable(model);
        model.setColumnIdentifiers(new String[]{"Guest Name", "Service Type", "Start", "End", "Status", "Amount"});

        generateBtn.addActionListener(e -> {
            if (conn == null) { JOptionPane.showMessageDialog(this, "No DB connection."); return; }
            try {
                String monthText = monthField.getText().trim();
                String yearText = yearField.getText().trim();

                if (!monthText.matches("\\d+") || !yearText.matches("\\d+")) {
                    JOptionPane.showMessageDialog(this, "Month and year must be numeric values.");
                    return;
                }

                int month = Integer.parseInt(monthText);
                int year = Integer.parseInt(yearText);

                if (month < 1 || month > 12) {
                    JOptionPane.showMessageDialog(this, "Month must be between 1 and 12.");
                    return;
                }

                model.setRowCount(0);
                String sql = "SELECT CONCAT(g.first_name,' ',g.last_name) as guest_name, " +
                        "gat.service_type, gat.activity_start_date, gat.activity_end_date, " +
                        "gat.payment_confirmation_status, gat.final_amount " +
                        "FROM guest g JOIN guest_activity_transaction gat ON g.guest_id=gat.guest_id " +
                        "WHERE MONTH(gat.activity_start_date)=? AND YEAR(gat.activity_start_date)=?";
                try (PreparedStatement ps = conn.prepareStatement(sql)) {
                    ps.setInt(1, month);
                    ps.setInt(2, year);
                    ResultSet rs = ps.executeQuery();
                    while (rs.next()) {
                        model.addRow(new Object[]{
                                rs.getString("guest_name"),
                                rs.getString("service_type"),
                                rs.getDate("activity_start_date"),
                                rs.getDate("activity_end_date"),
                                rs.getString("payment_confirmation_status"),
                                rs.getDouble("final_amount")
                        });
                    }
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Invalid month/year format.");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error generating report:\n" + ex.getMessage());
            }
        });

        panel.add(top, BorderLayout.NORTH);
        panel.add(new JScrollPane(table), BorderLayout.CENTER);
        return panel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(HomestayBooking::new);
    }
}





