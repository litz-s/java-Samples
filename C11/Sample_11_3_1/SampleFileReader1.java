import java.io.File;             
import java.io.FileReader;
import java.io.IOException;

public class SampleFileReader1 {
    public void func() {
        File file = new File("c:\\test\\sample2.txt");
        FileReader fr = null;
        try {                                     
            fr = new FileReader(file);        
            int ch = fr.read();                  
            while (ch != -1) {            
                System.out.print((char)ch);      
                ch = fr.read();          
            }
        } catch(IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (fr != null) {       
                try {   
                    fr.close();   
                } catch(IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}