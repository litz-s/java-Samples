import java.io.File;

public class SampleFile1 {
    public void func() {
        File file = new File("C:\\test\\sample1.txt");
        if (file.exists()) {
            System.out.println("sample1.txtは存在します");
        } else {
            System.out.println("sample1.txtは存在しません");
        }
    }
}