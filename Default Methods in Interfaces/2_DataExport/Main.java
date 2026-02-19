public class Main {
    public static void main(String[] args) {
        System.out.println("========= Data Export Feature =========\n");

        String sampleData = "Q1 Sales: 1,20,000 | Q2 Sales: 1,45,000 | Q3 Sales: 98,000";

        DataExporter sales = new SalesReport();
        DataExporter inventory = new InventoryReport();

        System.out.println("--- Sales Report (uses default exportToJSON) ---");
        sales.exportToCSV(sampleData);
        sales.exportToPDF(sampleData);
        sales.exportToJSON(sampleData);

        System.out.println("\n--- Inventory Report (overrides exportToJSON) ---");
        inventory.exportToCSV("Item A: 500 units, Item B: 300 units");
        inventory.exportToPDF("Item A: 500 units, Item B: 300 units");
        inventory.exportToJSON("Item A: 500 units, Item B: 300 units");
    }
}
