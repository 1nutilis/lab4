package SRP;

public class InvoiceRepository {
    public void saveToDatabase(Invoice invoice) {
        System.out.println("Счет " + invoice.id + " сохранен в ДБ");
    }
}
