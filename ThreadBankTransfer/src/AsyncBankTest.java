// AsyncBankTest.java
package src;

public class AsyncBankTest
{
	public static final int NACCOUNTS = 100;
	public static final double INITIAL_BALANCE = 1000;

	public static void main(String[] args)
	{
		BankAccount account = new BankAccount(NACCOUNTS, INITIAL_BALANCE);
		int i;
		for(i=0;i<NACCOUNTS;i++)
		{
			TransferRunnable r = new TransferRunnable(account, i, INITIAL_BALANCE);
			Thread t = new Thread(r);
			t.start();
		}
	}
}