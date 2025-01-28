import java.io.File;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.FileOutputStream;

public class SampleOutputStream1 {
    public void func() {
        File file = new File("C:\\test\\sample7.txt");
        try (FileOutputStream fos  = new FileOutputStream(file,true);
          OutputStreamWriter osw = new OutputStreamWriter(fos, "Shift-JIS");
          BufferedWriter bw  = new BufferedWriter(osw)) {
            bw.newLine();
            bw.write("さようなら 太郎さん！");
        } catch(IOException e) {
            System.out.println(e.getMessage());
       }
    }
}
