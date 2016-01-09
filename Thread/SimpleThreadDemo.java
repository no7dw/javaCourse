import com.wade.thread.*;

public class SimpleThreadDemo{
	public static void main(String[] args) {
		Thread threadA = new Thread( new RandomThread(1,100) , "threadA");
		Thread threadB = new Thread( new RandomThread(1,100) , "threadB");
		threadA.start();
		threadB.start();
		System.out.println("main end");
	}
}