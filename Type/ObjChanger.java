//rather than reflection
//this Obj will work simplely
public class ObjChanger {
    public static void main(String[] args) {
        MyObj am = new MyObj(1);
        MyObj bm = new MyObj(2);        
        System.out.println("a:" + am.getValue() + " b:" + bm.getValue());
        MyObj.swapMyObj(am, bm); //work now
        System.out.println("a:" + am.getValue() + " b:" + bm.getValue());
    }
}
