public class Son extends Father{
    private static int age;
    private String name;
    static {
        System.out.println("init son age");
    }
    public Son(){
        System.out.println("Son constructor");
    }
    public Son(String name){
        System.out.println("Son with name " + this.surName + name);
    }
    public static void main(String[] args){
        new Son();
        new Son("Lucas");
    }
}
