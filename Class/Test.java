public class Test{
    public static void main(String args[]){
        Baby person1 = new Baby("Wade");
        person1.sayHello();
        System.out.println(person1.age);
    }
}
class Baby{
    public void sayHello(){
        System.out.println("My name is "+ this.name);
    } 
    int age = 1;
    String name ;
    Baby(){
        System.out.println("I'm born");
    }
    Baby(String name){
       this.name = name; 
    }
}
