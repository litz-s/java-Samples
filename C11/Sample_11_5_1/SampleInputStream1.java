import java.io.File;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileInputStream;

public class SampleInputStream1 {
    public void func() {
        File file = new File("C:\\test\\sample6.txt");
        try (FileInputStream fi  = new FileInputStream(file);
          InputStreamReader is = new InputStreamReader(fi, "Shift-JIS"); 
          BufferedReader br = new BufferedReader(is)) {
            String line;
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}