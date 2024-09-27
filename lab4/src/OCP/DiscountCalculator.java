package OCP;

public class DiscountCalculator {
    public double calculate(Discount discount, double amount) {
        return discount.apply(amount);
    }
}
