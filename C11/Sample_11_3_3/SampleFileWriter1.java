import java.io.File; 
import java.io.FileWriter;
import java.io.IOException;

public class SampleFileWriter1 {
    public void func() {
        File file = new File("C:\\test\\sample3.txt");
        try (FileWriter fw = new FileWriter(file, true)) {
            fw.write("\r\nこんにちは 咲さん！"); 
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
