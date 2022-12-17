package chap06;

public class Account {
	public static int minBalance = 0;
	public static int maxBalance = 1000000;
	private int balance = 0;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if(balance<Account.minBalance || balance>Account.maxBalance) {
			return;
		}
		this.balance = balance;
	}
}