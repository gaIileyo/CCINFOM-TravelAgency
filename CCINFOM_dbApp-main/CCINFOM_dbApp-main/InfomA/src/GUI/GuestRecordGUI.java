package GUI;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class GuestRecordGUI extends JPanel {

    private JLayeredPane guestRecordLayout = new JLayeredPane();
    private JTable table;

    private JTextField searchBar = new JTextField("Search guest...");
    private JButton addBtn = new JButton("Add Guest");
    private JButton modifyBtn = new JButton("Modify Guest");
    private JButton filterBtn = new JButton("Sort Guests");
    private JButton activityBtn = new JButton("Record Activity");
    private JButton reportBtn = new JButton("View Reports");
    private JButton resetBtn = new JButton("Reset Table");

    public GuestRecordGUI() {
        this.setSize(1600, 900);
        this.setLayout(null);

        guestRecordLayout.setBounds(0, 0, 1600, 900);
        guestRecordLayout.setBackground(Color.BLACK);
        guestRecordLayout.setOpaque(true);

        searchField();
        addBtn();
        resetBtn();
        modifyBtn();
        filterBtn();
        activityBtn();
        reportBtn();

        this.add(guestRecordLayout);
    }

    /* =========================
       TABLE SETUP
       ========================= */
    public void setUpTable(DefaultTableModel model) {
        if (table == null) {
            table = new JTable(model);
            table.setRowHeight(30);
            table.setIntercellSpacing(new Dimension(1, 1));
            table.setOpaque(true);
            table.setBackground(Color.GRAY);
            table.setGridColor(Color.BLACK);
            table.setShowGrid(true);
            table.setForeground(Color.WHITE);

            JScrollPane scroll = new JScrollPane(table);
            scroll.setBounds(5, 40, 1570, 855);

            Font font = new Font("SansSerif", Font.BOLD, 13);
            table.setFont(font);

            table.getTableHeader().setFont(font);
            table.getTableHeader().setForeground(Color.WHITE);
            table.getTableHeader().setOpaque(true);
            table.getTableHeader().setBackground(Color.DARK_GRAY);

            guestRecordLayout.add(scroll, Integer.valueOf(0));
        } else {
            table.setModel(model);
        }

        guestRecordLayout.revalidate();
        guestRecordLayout.repaint();
    }

    /* =========================
       COMPONENTS
       ========================= */
    private void searchField() {
        searchBar.setBackground(Color.GRAY);
        searchBar.setFont(new Font("SansSerif", Font.BOLD, 13));
        searchBar.setBounds(5, 5, 315, 35);
        guestRecordLayout.add(searchBar, Integer.valueOf(1));
    }

    private void addBtn() {
        addBtn.setBounds(947, 5, 157, 35);
        addBtn.setFont(new Font("SansSerif", Font.BOLD, 13));
        guestRecordLayout.add(addBtn, Integer.valueOf(0));
    }

    private void resetBtn() {
        resetBtn.setBounds(1104, 5, 156, 35);
        resetBtn.setFont(new Font("SansSerif", Font.BOLD, 13));
        guestRecordLayout.add(resetBtn, Integer.valueOf(0));
    }

    private void modifyBtn() {
        modifyBtn.setBounds(1260, 5, 160, 35);
        modifyBtn.setFont(new Font("SansSerif", Font.BOLD, 13));
        guestRecordLayout.add(modifyBtn, Integer.valueOf(0));
    }

    private void filterBtn() {
        filterBtn.setBounds(1415, 5, 160, 35);
        filterBtn.setFont(new Font("SansSerif", Font.BOLD, 13));
        guestRecordLayout.add(filterBtn, Integer.valueOf(0));
    }

    private void activityBtn() {
        activityBtn.setBounds(633, 5, 314, 35);
        activityBtn.setFont(new Font("SansSerif", Font.BOLD, 13));
        guestRecordLayout.add(activityBtn, Integer.valueOf(0));
    }

    private void reportBtn() {
        reportBtn.setBounds(318, 5, 315, 35);
        reportBtn.setFont(new Font("SansSerif", Font.BOLD, 13));
        guestRecordLayout.add(reportBtn, Integer.valueOf(0));
    }

    /* =========================
       GETTERS
       ========================= */
    public JButton getAddBtn() { return addBtn; }
    public JButton getModifyBtn() { return modifyBtn; }
    public JButton getFilterBtn() { return filterBtn; }
    public JButton getActivityBtn() { return activityBtn; }
    public JButton getReportBtn() { return reportBtn; }
    public JButton getResetBtn() { return resetBtn; }
    public JTextField getSearchField() { return searchBar; }
    public JTable getTable() { return table; }
}
