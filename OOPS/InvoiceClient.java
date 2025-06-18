public class InvoiceClient {
    public static void main(String[] args) {
        Pen p = new Pen();
        Invoice i = new Invoice(p);
        System.out.println(i.CreateInvoice());
        i.sendMail();
        i.print();
    }
}
