package OCP;

public class SilverDiscount extends Discount{
    public double apply(double amount) {
        return amount * 0.9;
    }
}
