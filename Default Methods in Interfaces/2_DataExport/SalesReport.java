public class SalesReport implements DataExporter {

    @Override
    public void exportToCSV(String data) {
        System.out.println("[SalesReport CSV] Writing: " + data);
    }

    @Override
    public void exportToPDF(String data) {
        System.out.println("[SalesReport PDF] Rendering: " + data);
    }
}
