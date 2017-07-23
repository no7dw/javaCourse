import java.lang.reflect.Array;
import java.util.Arrays;

public class Collection<T> {
    private Class<T> type;

    public Collection(Class<T> type) {
        this.type = type;
    };

    @SuppressWarnings("unchecked")
    T[] create(int size) {
        return (T[]) Array.newInstance(type, size);
    }

    public static void main(String[] args){
        Collection<String> csMaker = new Collection<String>(String.class);
        String[] stringArray = csMaker.create(4);
        System.out.println(Arrays.toString(stringArray));
    }
}

