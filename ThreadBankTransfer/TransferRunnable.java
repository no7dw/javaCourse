// TransferRunnable.java
package src;

public class TransferRunnable implements Runnable
{
	private BankAccount bankAccount;
	private int fromAccount;
	private double maxAccount;
	private int DELAY = 10;

	public TransferRunnable(BankAccount b, int from , double max)
	{
		bankAccount = b;
		fromAccount = from;
		maxAccount = max;
	}

	public void run(){
		try{
			while(true){
				int toAccount = (int)(bankAccount.size()*Math.random());
				double amount = maxAccount*Math.random();
				bankAccount.transfer(fromAccount, toAccount, amount);
				Thread.sleep((int) (DELAY*Math.random()));
			}
		}catch(InterruptedException e){
			System.out.println("Interrupted");
		}
	}
}