public class SampleMain7 {
    public static void main(String[] args) {
        StandardInput7 input = new StandardInput7();
        try {
            input.printGrade();
            input.printSub();
        } catch (NumberFormatException e) {
            System.out.println("数値以外が入力されました");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("例外が発生しました");
        }
    }
}