package OCP;

public class NoDiscount extends Discount {
    public double apply(double amount) {
        return amount;
    }
}
