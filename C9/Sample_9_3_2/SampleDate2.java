import java.text.SimpleDateFormat;
import java.util.Date;

public class SampleDate2 {
    public void func() {
        Date now = new Date();
        Date future = new Date(1635070542587L);
        SimpleDateFormat sdf = new SimpleDateFormat("yy/MM/dd HH:mm:ss");
        System.out.println(sdf.format(now));
        System.out.println(sdf.format(future));
    }
}