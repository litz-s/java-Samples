import java.io.BufferedReader;              
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class SampleBufferedReader1 {
    public void func() {
        File file = new File("C:\\test\\sample4.txt");
        try (FileReader fr = new FileReader(file);
          BufferedReader br = new BufferedReader(fr)) {               
            String line = null;
            while((line = br.readLine()) != null){        
                System.out.println(line);
            }
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
