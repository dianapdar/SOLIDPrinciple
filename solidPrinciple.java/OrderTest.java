public class OrderTest {
    public static void main(String[] args) {
        System.out.println("== BASIC ORDER EXAMPLE ==");
        Order basicOrder = new Order(
            new SimpleOrderCalculator(),
            new StandardOrderProcessor()
        );
        
        basicOrder.calculateTotal(10.0, 2);
        basicOrder.placeOrder("John Doe", "123 Main St");
    
        basicOrder.generateInvoice("order_123.pdf");
        basicOrder.sendNotification("johndoe@example.com");
        
        System.out.println("\n== FULL-FEATURED ORDER EXAMPLE ==");
        Order fullOrder = new Order(
            new SimpleOrderCalculator(),
            new StandardOrderProcessor(),
            new PDFInvoiceGenerator(),
            new EmailNotificationService()
        );
        
        fullOrder.calculateTotal(15.0, 3);
        fullOrder.placeOrder("Jane Smith", "456 Oak Ave");
        fullOrder.generateInvoice("order_456.pdf");
        fullOrder.sendNotification("janesmith@example.com");
    }
}