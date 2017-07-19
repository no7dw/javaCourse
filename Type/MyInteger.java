public class MyInteger {
    private Integer value;
    public MyInteger(Integer i) { this.value = i;}
    public void setValue(int value) { this.value = value;}
    public int getValue() {return this.value;}
    public static void swapMyInteger(MyInteger a, MyInteger b) {
        MyInteger c = new MyInteger(a.getValue());
        a.setValue(b.getValue());
        b.setValue(c.getValue());
    }
}