import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("========= Date Format Utility =========\n");

        LocalDate invoiceDate = LocalDate.of(2025, 2, 19);
        LocalDate today = LocalDate.now();

        System.out.println("Invoice Date Formats:");
        System.out.println("Invoice Format : " + DateFormatter.formatToInvoice(invoiceDate));
        System.out.println("ISO Format     : " + DateFormatter.formatToISO(invoiceDate));
        System.out.println("Long Format    : " + DateFormatter.formatToLong(invoiceDate));
        System.out.println("Short Format   : " + DateFormatter.formatToShort(invoiceDate));
        System.out.println("US Format      : " + DateFormatter.formatToUS(invoiceDate));

        System.out.println("\nToday's Date Formats:");
        System.out.println("Invoice Format : " + DateFormatter.formatToInvoice(today));
        System.out.println("ISO Format     : " + DateFormatter.formatToISO(today));
        System.out.println("Long Format    : " + DateFormatter.formatToLong(today));
    }
}
