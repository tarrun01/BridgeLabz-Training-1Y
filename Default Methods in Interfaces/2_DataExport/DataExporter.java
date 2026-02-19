public interface DataExporter {
    void exportToCSV(String data);
    void exportToPDF(String data);

    default void exportToJSON(String data) {
        System.out.println("[JSON Export] Converting data to JSON format...");
        System.out.println("{\"data\": \"" + data.replace("\"", "'") + "\"}");
        System.out.println("[JSON Export] Export complete.");
    }
}
