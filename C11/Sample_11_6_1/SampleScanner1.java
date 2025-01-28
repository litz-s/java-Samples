import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SampleScanner1 {
    public void func() {
        Scanner scanner = null;
        try (FileReader fr  = new FileReader("C:\\test\\sample8.txt");
          BufferedReader br = new BufferedReader(fr)) {
            scanner = new Scanner(br);
            while (scanner.hasNext()) {     
                System.out.println(scanner.next());
            }
        } catch(IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}
