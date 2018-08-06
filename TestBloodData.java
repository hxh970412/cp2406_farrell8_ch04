public class TestBloodData {
    public static void main(String[] args)
    {
        BloodDate b1 = new BloodDate();
        BloodDate b2 = new BloodDate("A", "-");
        display(b1);
        display(b2);
        b1.setBloodType("AB");
        b1.setRhFactor("-");
        display(b1);
    }
    public static void display(BloodDate b)
    {
        System.out.println("The blood is type " + b.getBloodType() + b.getRhFactor());
    }
}
