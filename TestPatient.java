public class TestPatient
{
    public static void main(String[] args)
    {
        Patient p1 = new Patient();
        Patient p2 = new Patient("1234", 35, "B", "+");
        BloodDate b2 = new BloodDate("A", "-");
        display(p1);
        display(p2);
        p1.setId("3456");
        p1.setAge(42);
        BloodDate b = new BloodDate("AB", "-");
        p1.setBloodDate(b);
        display(p1);
    }
    public static void display(Patient p)
    {
        BloodDate bt = p.getBloodDate();
        System.out.println("Patient #" + p.getId() + "  age: " + + p.getAge() +
                "\n   The blood is type " + bt.getBloodType() + bt.getRhFactor());
    }

}