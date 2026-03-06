package Controller;

import GUI.GuideHiringPanelGUI;
import Logic.GuideHiringLogic;

public class GuideHiringController {

    private GuideHiringPanelGUI gui;
    private GuideHiringLogic logic;

    public GuideHiringController(GuideHiringPanelGUI gui,
                                  GuideHiringLogic logic) {

        this.gui = gui;
        this.logic = logic;

        initController();
    }

    private void initController() {

        // ADD GUIDE HIRING
        gui.btnHireGuide.addActionListener(e -> {

            gui.output.setText("");

            try {
                int guestId = Integer.parseInt(gui.txtGuestId.getText().trim());
                int guideId = Integer.parseInt(gui.txtGuideId.getText().trim());

                String tourDate = gui.txtTourDate.getText().trim();
                double serviceFee = Double.parseDouble(gui.txtServiceFee.getText().trim());
                String status = gui.txtStatus.getText().trim();

                // Validate Date
                if (!logic.validateDate(tourDate)) {
                    gui.output.append("Invalid date format. Use YYYY-MM-DD.\n");
                    return;
                }

                // Check Guide Availability
                if (!logic.isGuideAvailable(guideId, tourDate)) {
                    gui.output.append("Guide is not available on selected date.\n");
                    return;
                }

                boolean success = logic.registerGuideHiring(
                        guestId,
                        guideId,
                        tourDate,
                        serviceFee,
                        status
                );

                if (success) {
                    gui.output.append("Guide hired successfully.\n");
                } else {
                    gui.output.append("Failed to hire guide.\n");
                }

            } catch (NumberFormatException ex) {
                gui.output.append("Invalid numeric input.\n");
            }
        });


        // VIEW GUIDE HIRING DETAILS
        gui.btnViewHiring.addActionListener(e -> {

            gui.output.setText("");

            try {
                int hireId = Integer.parseInt(gui.txtHireIdSearch.getText().trim());

                String details = logic.viewHiringDetails(hireId);

                if (details.equals("NOT FOUND")) {
                    gui.output.append("Guide hiring record not found.\n");
                } else {
                    gui.output.append("Guide Hiring Details:\n" + details + "\n");
                }

            } catch (NumberFormatException ex) {
                gui.output.append("Invalid Hiring ID.\n");
            }
        });
    }
}
