public class IntegerChanger {
    public static void main(String[] args) {
        Integer a = 1, b = 2;
        System.out.println("a:" + a + " b:" + b);
        swap(a, b);
        System.out.println("a:" + a + " b:" + b); //won't work

        MyInteger am = new MyInteger(1);
        MyInteger bm = new MyInteger(2);        
        System.out.println("a:" + am.getValue() + " b:" + bm.getValue());
        MyInteger.swapMyInteger(am, bm); //work now
        System.out.println("a:" + am.getValue() + " b:" + bm.getValue());
    }
    public static void swap(Integer a , Integer b) {
        Integer tmp = a;
        a = b;
        b = tmp;
    } 
}
