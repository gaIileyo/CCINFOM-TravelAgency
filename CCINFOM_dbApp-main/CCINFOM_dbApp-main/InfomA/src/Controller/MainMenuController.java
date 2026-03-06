package Controller;

import GUI.*;
import Logic.*;

import javax.swing.*;

public class MainMenuController {

    private MainMenuGUI menu;

    public MainMenuController(MainMenuGUI menu) {
        this.menu = menu;
        initController();
    }

    private void initController() {

        // 1️⃣ OPEN GUEST MANAGEMENT
        menu.btnGuestManagement.addActionListener(e -> {

            JFrame frame = new JFrame("Guest Management");
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            GuestRecordGUI gui = new GuestRecordGUI();
            frame.add(gui);

            new GuestRecordController(gui, new GuestRecordLogic());

            frame.pack();
            frame.setVisible(true);
        });


        // 2️⃣ OPEN HOMESTAY BOOKING MODULE
        menu.btnHomestayBooking.addActionListener(e -> {

            JFrame frame = new JFrame("Homestay Booking");
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            BookingManagementGUI gui = new BookingManagementGUI();
            frame.add(gui);

            new BookingManagementController(gui,
                    new BookingManagementLogic());

            frame.pack();
            frame.setVisible(true);
        });


        // 3️⃣ OPEN GUIDE HIRING MODULE
        menu.btnGuideHiring.addActionListener(e -> {

            JFrame frame = new JFrame("Guide Hiring");
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            GuideHiringPanelGUI gui = new GuideHiringPanelGUI();
            frame.add(gui);

            new GuideHiringController(gui,
                    new GuideHiringLogic());

            frame.pack();
            frame.setVisible(true);
        });


        // 4️⃣ OPEN TOUR PACKAGE RESERVATION
        menu.btnTourReservation.addActionListener(e -> {

            JFrame frame = new JFrame("Tour Package Reservation");
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            TourReservationGUI gui = new TourReservationGUI();
            frame.add(gui);

            new TourReservationController(gui,
                    new TourReservationLogic());

            frame.pack();
            frame.setVisible(true);
        });


        // 5️⃣ OPEN TOUR PACKAGE REVENUE REPORT
        menu.btnRevenueReport.addActionListener(e -> {

            JFrame frame = new JFrame("Tour Package Revenue Report");
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            CategoryReportGUI gui = new CategoryReportGUI();
            frame.add(gui);

            new CategoryReportController(gui,
                    new CategoryReportLogic());

            frame.pack();
            frame.setVisible(true);
        });
    }
}
