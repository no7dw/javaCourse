/**
 * Created by dengwei on 2019/3/26.
 */
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class ServiceProvider {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"http://10.20.160.198/wiki/display/dubbo/provider.xml"});
        context.start();
        System.in.read();
    }
}
