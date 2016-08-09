import java.util.Enumeration;
import java.util.Vector;

public class EnumTest {
        public static void main(String args[]){
            Vector v = new Vector();
            v.add("Succeed");
            v.add("Fail");
            for (Enumeration<String> e = v.elements(); e.hasMoreElements();)
                System.out.println(e.nextElement());
            System.out.println( v.capacity());
            System.out.println(  v.size());
            v.clear();
//            System.out.println( v.elementCount());
        }

}