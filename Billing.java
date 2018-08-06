public class Billing {
    public static void main(String[] args)
    {
        double totalPrice = Billing(20);
        System.out.println("One book's price is $" + totalPrice);
        double totalPrice_1 = Billing(20, 12);
        System.out.println("The total price of these book is $" + totalPrice_1);
        double totalPrice_2 = Billing(15, 12, 45);
        System.out.println("The total price of these book with coupon is $" + totalPrice_2);
    }
    public static double Billing(double parameter)
    {
        double TAX = 0.08;
        double totalPrice = parameter + parameter * TAX;
        return totalPrice;
    }
    public static double Billing(double price , double quantity)
    {
        double TAX = 0.08;
        double totalPrice = price * quantity + price * quantity * TAX;
        return totalPrice;
    }
    public static double Billing(double price, double quantity, double coupon)
    {
        double TAX = 0.08;
        double totalPerice = (price * quantity - coupon) * (1 + TAX);
        return totalPerice;
    }
}
