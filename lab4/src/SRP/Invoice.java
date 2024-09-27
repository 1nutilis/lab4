package SRP;

public class Invoice {
    public int id;
    public List<Item> items;
    public double taxRate;

    public Invoice(int id, List<Item> items, double taxRate) {
        this.id = id;
        this.items = items;
        this.taxRate = taxRate;
    }
}
