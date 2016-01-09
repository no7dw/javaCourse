public Class Test{
    public static void main(String args[]){
        Human person1 = new Human('Wade');
        person1.sayHello();
        System.out.println(person1.age);
    }
}
class Human{
    void sayHello(){
        System.out.println('My name is ', name);
    } 
    int age = 0;
    String name ;
    void Human(String name){
       this.name = name; 
    }
}
