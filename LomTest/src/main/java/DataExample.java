/**
 * Created by dengwei on 2019/3/24.
 */
import lombok.*;
import lombok.extern.slf4j.Slf4j;
import java.io.Serializable;
import java.util.HashMap;

@Data
@AllArgsConstructor
@Slf4j
@EqualsAndHashCode
public class DataExample implements Serializable {
    private final String name;
    private int age;

    public static void main(String[] args) {
        DataExample do1 = new DataExample("dengwei", 3);
        log.info(do1.toString());
        System.out.println(do1.toString()); //toString()
        System.out.println(do1.getName());//getter

        val do2 = new DataExample("dengwei", 4);
        do2.age = 5; //setter
        System.out.println(do2.age);

        System.out.printf("do1= do2 ? %s\n", do1.equals(do2)); //equal

        val map = new HashMap<Integer , String>(); //val
        map.put(0, "Jan");
        map.put(1, "Feb");

        for(val entry: map.entrySet()) {
            System.out.printf("%d: %s\n",entry.getKey(),entry.getValue());
        }
        //Synchronized has not simplify much, and granularity(粒度) is not small enough
        //so not recommended
    }
}
