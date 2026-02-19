public class InventoryReport implements DataExporter {

    @Override
    public void exportToCSV(String data) {
        System.out.println("[InventoryReport CSV] Writing: " + data);
    }

    @Override
    public void exportToPDF(String data) {
        System.out.println("[InventoryReport PDF] Rendering: " + data);
    }

    @Override
    public void exportToJSON(String data) {
        System.out.println("[InventoryReport JSON] Custom JSON export: {\"inventory\": \"" + data + "\"}");
    }
}
