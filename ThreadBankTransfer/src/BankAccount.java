// BankAccount.java
package src;

public class BankAccount
{
	private final double[] accounts;
	// private Lock bankLock = new ReentrantLock();
	public BankAccount(int n ,double initBalance)
	{
		accounts = new double[n];
		for(int i=0; i< accounts.length; i++)
			accounts[i] = initBalance;
	}

	public void transfer(int from, int to ,double amount)
	{
		// bankLock.lock();
		// try{
			if(accounts[from]<amount) return;
			System.out.print(Thread.currentThread());
			accounts[from] -= amount;
			System.out.printf("%10.2f from %d to %d%n", amount, from, to);
			accounts[to] += amount;
			System.out.printf("Total Balance: %10.2f%n", getTotalBalance());
		// }
		// finally{
		// 	bankLock.unlock();
		// }
	}

	public double getTotalBalance()
	{
		double sum = 0;
		for(double a: accounts)
			sum+=a;
		return sum;
	}

	public int size(){return accounts.length;}
}