public class Binary{
    public static void main(String[] args){
        int[] arr = new int[] {3, -2, 1};
        for(int a : arr){
            System.out.println(a + ":"  + ~a );
        }
    }
}
