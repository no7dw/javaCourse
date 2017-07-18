public class Father {
    protected static int age = 60;
    protected static String surName = "Deng";
    private String name;
    static {
        System.out.println("init Father age " + age );
    }
    public Father(){
        System.out.println("Father Constructor");
    }
    public Father(String name){
        this.name = name;
        System.out.println("Father Constructor with name" + name);
    }
}
