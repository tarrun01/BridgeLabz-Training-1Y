package com.gla.MethodReferences;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Invoice {
    private String transactionId;
    private long generatedAt;

    public Invoice(String transactionId) {
        this.transactionId = transactionId;
        this.generatedAt = System.currentTimeMillis();
    }

    public String toString() {
        return "Invoice{ transactionId='" + transactionId + "', generatedAt=" + generatedAt + " }";
    }
}

public class InvoiceCreation {

    public static void main(String[] args) {
        List<String> transactionIds = Arrays.asList(
            "TXN1001", "TXN1002", "TXN1003", "TXN1004", "TXN1005"
        );

        System.out.println("Transaction IDs: " + transactionIds);

        List<Invoice> invoices = transactionIds.stream()
                .map(Invoice::new)
                .collect(Collectors.toList());

        System.out.println("\nGenerated Invoices:");
        invoices.forEach(System.out::println);
    }
}
