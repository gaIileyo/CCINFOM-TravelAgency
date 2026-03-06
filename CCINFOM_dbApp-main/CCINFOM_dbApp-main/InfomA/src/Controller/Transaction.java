public void saveTransaction(Transaction t) {
    logic.validateGuest(t);
    logic.computeFinalAmount(t);
    logic.saveToDatabase(t);
}
