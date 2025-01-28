public class Branch10 {
    public void func() {
        int num = 5;
        switch (num) {
        case 1:
            System.out.println("大吉");
            break;
        case 2:                  
        case 3:
            System.out.println("中吉");      
            break;
        case 4:                   
        case 5:
        case 6:
            System.out.println("小吉");    
            break;
        default:
            System.out.println("吉");       
        }
    }
    
}
