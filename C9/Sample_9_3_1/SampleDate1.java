import java.util.Date;

public class SampleDate1 {
    public void func(){
        Date now = new Date();
        System.out.println(now);
        Date future = new Date(1651719600000L);
        System.out.println(future);
    }
}
