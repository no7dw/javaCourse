public class Box {
    public static void main(String[] args){
        Integer a = 127;
        Integer b = 127;
        Integer c = 128;
        Integer d = 128;
        System.out.println( a == b);
        System.out.println( c == d); // cache [-128, 127]
        System.out.println( c.equals(d));
    }
}
