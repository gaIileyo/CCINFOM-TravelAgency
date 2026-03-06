package Logic;

import java.util.HashMap;

public class GuideHiringLogic {

    // Temporary in-memory storage (can later be replaced with DB)
    private HashMap<Integer, String> hiringRecords = new HashMap<>();
    private int hireIdCounter = 1;

    // Validate YYYY-MM-DD
    public boolean validateDate(String date) {
        return date.matches("\\d{4}-\\d{2}-\\d{2}");
    }

    // Dummy availability check (always true for now)
    public boolean isGuideAvailable(int guideId, String tourDate) {
        // Later: check guide schedule in database
        return true;
    }

    // Register guide hiring transaction
    public boolean registerGuideHiring(int guestId,
                                       int guideId,
                                       String tourDate,
                                       double serviceFee,
                                       String status) {

        int hireId = hireIdCounter++;

        String record =
                "Hire ID: " + hireId +
                "\nGuest ID: " + guestId +
                "\nGuide ID: " + guideId +
                "\nTour Date: " + tourDate +
                "\nService Fee: ₱" + String.format("%.2f", serviceFee) +
                "\nStatus: " + status;

        hiringRecords.put(hireId, record);
        return true;
    }

    // Retrieve hiring details
    public String viewHiringDetails(int hireId) {
        return hiringRecords.getOrDefault(hireId, "NOT FOUND");
    }
}
