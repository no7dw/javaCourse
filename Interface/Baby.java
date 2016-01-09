class Baby implements Person{
	public Baby(String name){
		this.name = name;
	}
    public void cry(){
        System.out.println("wa wa wa ~");
    }
    public void eat(String food){
        System.out.println(this.name + " wanna eat " + food);
    }
    public void sayHello(){
        System.out.println("My name is "+ this.name);
    } 
    private String name = "noisy baby";//will be overrided
    public int age = 1;
}
