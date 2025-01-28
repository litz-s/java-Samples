public class StringOp2 {
    public void func() {
        String name = "YamadaTaro";
        System.out.println(name.indexOf("a"));
        System.out.println(name.indexOf("a", 3)); 
        System.out.println(name.lastIndexOf("a"));  
        System.out.println(name.lastIndexOf("a", 5));   
        System.out.println(name.substring(3));           
        System.out.println(name.substring(2, 5));   
    }
}
