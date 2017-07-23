public class GenericArray<T> {
    private T[] array;
    
    @SuppressWarnings("unchecked")
    public GenericArray(int size){
        array = (T[]) new Object[size];
    }

    public void put(T value, int index){
       array[index] = value;
    }

    public T get(int index){
        return array[index];
    }

    public T[] rep(){
        return array;
    }

    public static void main(String[] args){
        GenericArray<Integer> gai = new GenericArray<Integer>(4);
        //Exception in thread "main" java.lang.ClassCastException: [Ljava.lang.Object; cannot be cast to [Ljava.lang.Integer;
        //      at GenericArray.main(GenericArray.java:23)
        //Integer[] ia = (Integer[]) gai.rep();
        Object[] oa = gai.rep();
        System.out.println(oa.toString());
    }
}
