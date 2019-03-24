/**
 * Created by dengwei on 2019/3/24.
 */
import lombok.*;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class DataExample implements Serializable {
    private final String name;
    private int age;

    public static void main(String[] args) {
        DataExample do1 = new DataExample("dengwei", 3);
        System.out.println(do1.toString());
    }

}
