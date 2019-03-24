/**
 * Created by dengwei on 2019/3/24.
 */
import lombok.*;
import lombok.extern.slf4j.Slf4j;
import java.io.Serializable;

@Data
@AllArgsConstructor
@Slf4j
public class DataExample implements Serializable {
    private final String name;
    private int age;


    public static void main(String[] args) {
        DataExample do1 = new DataExample("dengwei", 3);
        log.info(do1.toString());
        System.out.println(do1.toString());
    }

}
