public class Main {
    public static void main(String[] args) {
        System.out.println("========= Cloning Prototype Objects =========\n");

        DocumentTemplate invoiceTemplate = new DocumentTemplate(
            "Invoice Template",
            "Company Name | GST: 27ABCDE1234F1Z5",
            "Thank you for your business!",
            "Item | Qty | Rate | Amount"
        );

        System.out.println("Original Template:");
        System.out.println(invoiceTemplate);

        DocumentTemplate invoice1 = invoiceTemplate.clone();
        invoice1.setTitle("Invoice #1001");
        invoice1.setContent("Laptop | 1 | 80000 | 80000");

        DocumentTemplate invoice2 = invoiceTemplate.clone();
        invoice2.setTitle("Invoice #1002");
        invoice2.setContent("Mouse | 2 | 500 | 1000");

        System.out.println("\nCloned Invoice 1:");
        System.out.println(invoice1);

        System.out.println("\nCloned Invoice 2:");
        System.out.println(invoice2);

        System.out.println("\nOriginal unchanged:");
        System.out.println(invoiceTemplate);
    }
}
