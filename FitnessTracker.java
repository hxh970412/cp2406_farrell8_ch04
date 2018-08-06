import java.time.*;
public class FitnessTracker {
    String activity;
    int minutes;
    LocalDate date;
    public FitnessTracker()
    {
        activity = "running";
        minutes = 0;
        date = LocalDate.of(2018,1,1);

    }
    public FitnessTracker(String x, int y, LocalDate z)
    {
        activity = x;
        minutes = y;
        date = z;
    }
    public String getActivity()
    {
        return activity;
    }
    public int getMinutes()
    {
        return minutes;
    }
    public LocalDate getDate()
    {
        return date;
    }
}
