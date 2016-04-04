// BankAccount.java
package src;

public class BankAccount
{
	private final double[] accounts;
	public BankAccount(int n ,double initBalance)
	{
		accounts = new double[n];
		for(int i=0; i< accounts.length; i++)
			accounts[i] = initBalance;
	}

	public void transfer(int from, int to ,double amount)
	{
		if(accounts[from]<amount) return;
		System.out.print(Thread.currentThread());
		accounts[from] -= amount;
		System.out.printf("%10.2f from %d to %d", amount, from, to);
		accounts[to] += amount;
		System.out.printf("Total Balance: %10.2\n", getTotalBalance());
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