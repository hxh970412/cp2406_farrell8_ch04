public class Patient {
    private String id;
    private int age;
    private BloodDate bloodDate;
    public Patient()
    {
        id = "0";
        bloodDate = new BloodDate();
    }
    public Patient(String id, int age, String bType, String rhFactor)
    {
        this.id = id;
        this.age = age;
        bloodDate = new BloodDate(bType, rhFactor);
    }
    public String getId()
    {
        return id;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public BloodDate getBloodDate()
    {
        return bloodDate;
    }
    public void setBloodDate(BloodDate b)
    {
        bloodDate = b;
    }
    public void setId(String s)
    {
        this.id = id;
    }
}
