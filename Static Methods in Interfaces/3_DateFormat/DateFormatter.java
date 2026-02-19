import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public interface DateFormatter {

    static String formatToInvoice(LocalDate date) {
        return date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }

    static String formatToISO(LocalDate date) {
        return date.format(DateTimeFormatter.ISO_DATE);
    }

    static String formatToLong(LocalDate date) {
        return date.format(DateTimeFormatter.ofPattern("MMMM dd, yyyy"));
    }

    static String formatToShort(LocalDate date) {
        return date.format(DateTimeFormatter.ofPattern("dd/MM/yy"));
    }

    static String formatToUS(LocalDate date) {
        return date.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
    }
}
