public class StringOp4 {
    public void func() {
        String str1 = "春夏秋冬";
        char[] char1 = str1.toCharArray();    
        for (char c : char1) {
            System.out.println(c);
        }
        char char2 =str1.charAt(1);                
        System.out.println("char2：" + char2);
        String str2 = String.valueOf(char2);    
        System.out.println("str2：" + str2);
        char[] char3 = {'松', '竹', '梅'};
        String str3 = String.valueOf(char3);   
        System.out.println("str3：" + str3);
      }
}
