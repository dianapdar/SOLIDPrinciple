public class PDFInvoiceGenerator implements InvoiceGenerator {
    @Override
    public void generateInvoice(String fileName) {
        System.out.println("Invoice generated: " + fileName);
    }
}