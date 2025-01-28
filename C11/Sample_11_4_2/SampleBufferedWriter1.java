import java.io.BufferedWriter;                 
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SampleBufferedWriter1 {
    public void func() {
        File file = new File("C:\\test\\sample5.txt");
        try (FileWriter fw = new FileWriter(file, true);
          BufferedWriter bw = new BufferedWriter(fw)) {               
            bw.newLine();                      
            bw.write("こんにちは 大介さん！");  
            bw.newLine();                     
            bw.write("こんにちは 幸子さん！");  
        } catch(IOException e) {
           System.out.println(e.getMessage());
        }
    }
}