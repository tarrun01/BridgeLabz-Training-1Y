import com.company.analytics.sales.SalesReport;
import com.company.analytics.hr.EmployeeReport;

/**
 * Q9 – Company Analytics with Sub-Packages
 *
 * Key note: In Java, sub-packages are INDEPENDENT of their parent packages.
 * 'com.company.analytics.sales' has NO special access to members of
 * 'com.company.analytics' — they are treated as completely separate packages.
 * The dot-separated naming is purely a naming/organisational convention;
 * the JVM treats each package as its own isolated namespace.
 */
public class CompanyMain {
    public static void main(String[] args) {
        System.out.println("╔══════════════════════════════════════════════╗");
        System.out.println("║         COMPANY ANALYTICS – FULL REPORT     ║");
        System.out.println("╚══════════════════════════════════════════════╝\n");

        SalesReport sales = new SalesReport();
        sales.printSalesData();

        System.out.println();

        EmployeeReport hr = new EmployeeReport();
        hr.printEmployeeData();

        System.out.println("\n✔ Combined report generated successfully.");
    }
}
