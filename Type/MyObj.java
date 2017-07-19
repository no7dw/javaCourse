public class MyObj {
    private Object value;
    public MyObj(Object i) { this.value = i;}
    public void setValue(Object value) { this.value = value;}
    public Object getValue() {return this.value;}
    public static void swapMyObj(MyObj a, MyObj b) {
        MyObj c = new MyObj(a.getValue());
        a.setValue(b.getValue());
        b.setValue(c.getValue());
    }
}
