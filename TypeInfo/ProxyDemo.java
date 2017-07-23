interface Interface {
    void doSomething();

    void somethingElse(String arg);
}

class ReadObject implements Interface {
    public void doSomething() {System.out.println("dosomething");}

    public void somethingElse(String arg) {System.out.println("somethinelse" + arg);}
}

class Proxy implements Interface {
    private Interface proxied;

    public Proxy (Interface proxy) {this.proxied = proxy;} 

    public void doSomething() {System.out.println("dosomething in proxy"); proxied.doSomething();}

    public void somethingElse(String arg) {System.out.println("somethinelse in proxy " + arg); proxied.somethingElse(arg);}

}

class ProxyDemo  {
    public static void comsumer(Interface iface){
        iface.doSomething();
        iface.somethingElse("proxy demo");
    }

    public static void main(String[] args) {
        comsumer(new ReadObject());
        comsumer(new Proxy(new ReadObject()));
    }
}
