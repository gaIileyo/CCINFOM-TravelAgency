package GUI;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class transaction_GUI extends JFrame {

    private JLayeredPane layout = new JLayeredPane();

    public transaction_GUI() {
        super("Guest Activity Transactions");

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(1600, 900);
        this.setResizable(false);
        this.setLayout(null);

        layout.setBounds(0, 0, 1600, 900);
        this.add(layout, BorderLayout.CENTER);

        this.setVisible(true);
    }

    public void setUpTable(DefaultTableModel model){

        JTable table = new JTable(model);

        table.setRowHeight(30);
        table.setFont(new Font("Courier New", Font.BOLD, 13));

        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        for (int i = 0; i < table.getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setPreferredWidth(150);
        }

        JScrollPane scroll = new JScrollPane(table);
        scroll.setBounds(0, 0, 1570, 900);

        layout.add(scroll, Integer.valueOf(0));
    }
}

