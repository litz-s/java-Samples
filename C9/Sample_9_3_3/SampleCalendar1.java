import java.util.Calendar;
import java.util.Date;

public class SampleCalendar1 {
    public void func() {
        Calendar cal = Calendar.getInstance();
        cal.set(2112, 9, 3, 15, 30, 00);
        Date futureDay = cal.getTime();
        System.out.println(futureDay);
    }
}