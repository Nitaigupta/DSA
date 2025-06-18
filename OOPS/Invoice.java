public class Invoice {
    Pen pen;
    public Invoice(Pen pen) {
        this.pen = pen;
    }   
    public int CreateInvoice() {
        // Logic to create an invoice
        System.out.println("Invoice created for pen with price: " + pen.price + " and color: " + pen.color);
        return 1; // Assuming 1 indicates success
    }
    public void sendMail() {
        // Logic to send an invoice via email
        System.out.println("Invoice sent via email.");
    }
    public void print() {
        // Logic to print the invoice
        System.out.println("Invoice printed.");
    }
}
