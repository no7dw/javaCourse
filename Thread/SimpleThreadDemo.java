import com.wade.thread.*;

public class SimpleThreadDemo{
	public static void main(String[] args) {
		Thread threadA = new Thread( new RandomThread(1,100) , "threadA");
		threadA.start();
		System.out.println("end");
	}
}