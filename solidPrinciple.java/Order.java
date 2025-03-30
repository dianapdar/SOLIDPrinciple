public class Order {
    private final OrderCalculator calculator;
    private final OrderProcessor processor;
    private final InvoiceGenerator invoiceGenerator;
    private final NotificationService notificationService;
    
    public Order(OrderCalculator calculator, OrderProcessor processor) {
        this(calculator, processor, null, null);
    }
    
    public Order(
            OrderCalculator calculator, 
            OrderProcessor processor, 
            InvoiceGenerator invoiceGenerator, 
            NotificationService notificationService) {
        this.calculator = calculator;
        this.processor = processor;
        this.invoiceGenerator = invoiceGenerator;
        this.notificationService = notificationService;
    }
    
    public double calculateTotal(double price, int quantity) {
        return calculator.calculateTotal(price, quantity);
    }
    
    public void placeOrder(String customerName, String address) {
        processor.placeOrder(customerName, address);
    }
    
    public void generateInvoice(String fileName) {
        if (invoiceGenerator != null) {
            invoiceGenerator.generateInvoice(fileName);
        } else {
            System.out.println("No invoice generator configured");
        }
    }
    
    public void sendNotification(String recipient) {
        if (notificationService != null) {
            notificationService.sendNotification(recipient);
        } else {
            System.out.println("No notification service configured");
        }
    }
}