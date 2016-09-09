package actvity;
import actvity.nameList;
import java.util.ArrayList;

public class startActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nameList nl = new nameList();
		ArrayList al = nl.getNameList();
		for(int i = 0; i< al.size(); i++)
			System.out.println(al.get(i));
//		ArrayList wal = new ArrayList();
//		wal.add("Philip\n");
//		wal.add("Navy\n");
//		wal.add("Smile\n");
//		try{
//			nl.SaveList(wal);
//		}
//		catch(Exception e){
//			System.out.println(e.getMessage());
//			System.out.println("save fail");
//		}
		System.out.println("end");
	}

}
