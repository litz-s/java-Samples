public enum Animal2 {
    CAT("猫", "ネコ"),
    DOG("犬", "イヌ"),
    BIRD("鳥", "トリ");

    private final String name1;
    private final String name2;

    private Animal2(String name1, String name2) {
        this.name1 = name1;
        this.name2 = name2;
    }
    public String getName1() {
        return this.name1;
    }
    public String getName2() {
        return this.name2;
    }
}
