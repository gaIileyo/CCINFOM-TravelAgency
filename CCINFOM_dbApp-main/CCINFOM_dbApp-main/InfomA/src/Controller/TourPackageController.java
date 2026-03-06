package Controller;

import GUI.TourPackageGUI;
import Logic.TourPackageLogic;

import javax.swing.*;
import java.util.ArrayList;

public class TourPackageController {

    private TourPackageGUI gui;
    private TourPackageLogic logic;

    public TourPackageController(TourPackageGUI gui,
                                 TourPackageLogic logic) {

        this.gui = gui;
        this.logic = logic;

        initController();
    }

    private void initController() {

        // 1️⃣ ADD TOUR PACKAGE
        gui.btnAddPackage.addActionListener(e -> {

            String name = gui.txtPackageName.getText().trim();
            String category = gui.txtCategory.getText().trim();
            String duration = gui.txtDuration.getText().trim();
            String priceText = gui.txtPrice.getText().trim();
            String maxPaxText = gui.txtMaxPax.getText().trim();
            String inclusions = gui.txtInclusions.getText().trim();

            if (name.isEmpty() || category.isEmpty() ||
                duration.isEmpty() || priceText.isEmpty() ||
                maxPaxText.isEmpty() || inclusions.isEmpty()) {

                JOptionPane.showMessageDialog(null,
                        "All fields are required!");
                return;
            }

            try {
                double price = Double.parseDouble(priceText);
                int maxPax = Integer.parseInt(maxPaxText);

                boolean added = logic.addTourPackage(
                        name, category, duration,
                        price, maxPax, inclusions
                );

                if (added) {
                    gui.output.append("Tour package added successfully!\n");

                    gui.txtPackageName.setText("");
                    gui.txtCategory.setText("");
                    gui.txtDuration.setText("");
                    gui.txtPrice.setText("");
                    gui.txtMaxPax.setText("");
                    gui.txtInclusions.setText("");
                } else {
                    gui.output.append("Failed to add tour package.\n");
                }

            } catch (NumberFormatException ex) {
                gui.output.append("Invalid numeric input (Price / Pax).\n");
            }
        });


        // 2️⃣ VIEW TOUR PACKAGE DETAILS
        gui.btnViewPackage.addActionListener(e -> {

            gui.output.setText("");

            try {
                int packageId =
                        Integer.parseInt(gui.txtPackageIdSearch
                                .getText().trim());

                ArrayList<String> details =
                        logic.viewPackageDetails(packageId);

                if (details.isEmpty()) {
                    gui.output.append("No data found for this package.\n");
                } else {
                    for (String d : details) {
                        gui.output.append(d + "\n");
                    }
                }

            } catch (NumberFormatException ex) {
                gui.output.append("Invalid Package ID.\n");
            }
        });
    }
}
