package Controller;

import GUI.CategoryReportGUI;
import Logic.CategoryReportLogic;

import javax.swing.*;
import java.util.ArrayList;

public class CategoryReportController {

    private CategoryReportGUI gui;
    private CategoryReportLogic logic;

    public CategoryReportController(CategoryReportGUI gui, CategoryReportLogic logic) {
        this.gui = gui;
        this.logic = logic;

        initController();
    }

    private void initController() {

        gui.btnGenerate.addActionListener(e -> {

            gui.output.setText("");

            try {
                int month = Integer.parseInt(gui.txtMonth.getText().trim());
                int year  = Integer.parseInt(gui.txtYear.getText().trim());

                // Validate month
                if (month < 1 || month > 12) {
                    gui.output.append("Invalid month. Please enter 1–12.\n");
                    return;
                }

                // Validate year
                if (year < 2000 || year > 2100) {
                    gui.output.append("Invalid year.\n");
                    return;
                }

                // Call logic
                ArrayList<String> report =
                        logic.generateTourPackageRevenueReport(month, year);

                if (report.isEmpty()) {
                    gui.output.append(
                            "No tour package reservations found for "
                                    + month + "/" + year + ".\n");
                } else {

                    gui.output.append(
                            "TOUR PACKAGE PERFORMANCE REPORT\n");
                    gui.output.append(
                            "Month: " + month + "  Year: " + year + "\n");
                    gui.output.append(
                            "--------------------------------------------\n");

                    for (String r : report) {
                        gui.output.append(r + "\n");
                    }
                }

            } catch (NumberFormatException ex) {
                gui.output.append("Please enter valid numeric month and year.\n");
            }
        });
    }
}
