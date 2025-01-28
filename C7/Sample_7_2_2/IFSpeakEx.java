public interface IFSpeakEx {
    public String DEF_NAME= "レッド";

    default public void speak(){
        greet();
        System.out.println("ワタシは" + IFSpeakEx.DEF_NAME + "です！");
    }
    private void greet() {
        System.out.println("こんにちは");
    }
    static public void thanks() {
        System.out.println("ありがとう");
    }
}