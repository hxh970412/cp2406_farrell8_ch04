public class BloodDate {
    private String bloodType;
    private String rhFactor;
    public BloodDate()
    {
        this("O", "+");
    }
    public BloodDate(String bType, String rh)
    {
        bloodType = bType;
        rhFactor = rh;
    }
    public void setBloodType(String bType)
    {
        bloodType = bType;
    }
    public String getBloodType()
    {
        return bloodType;
    }
    public void setRhFactor(String rh)
    {
        rhFactor = rh;
    }
    public String getRhFactor()
    {
        return rhFactor;
    }
}
