package SRP;

public class InvoiceCalculator {
    public double calculateTotal(Invoice invoice) {
        double subTotal = 0;
        for (Item item : invoice.items) {
            subTotal += item.getPrice();
        }
        return subTotal + (subTotal * invoice.taxRate);
    }
}
