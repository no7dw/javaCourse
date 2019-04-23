/**
 * Created by dengwei on 2019/3/26.
 */
public class DemoServiceImpl implements DemoService {
    public String sayHello(String name){
        return "Hello " + name
    }
    public String echo(){
        return "pingpong";
    }
    public void test() {
        System.out.println("test");
    }
}
