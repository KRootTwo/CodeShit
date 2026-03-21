package bankAcc;

public class BankAccount implements TransactionOperations{
	private final String name;
	private final long accNo;
	private float balance;
	private int pass;
	public BankAccount(String name, long accNo, float balance, int pass) {
		this.name = name;
		this.accNo = accNo;
		this.balance = balance;
		this.pass = pass;
	}
	public BankAccount(String name, long accNo, int pass) {
		this.name = name;
		this.accNo = accNo;
		this.pass = pass;
	}
	public BankAccount() {
		this.name = null;
		this.accNo = -1;
	}
	public void showUser() {
		System.out.println("Name: " + this.name);
		System.out.println("Account No. " + this.accNo);
		System.out.println("Current Balance: " + this.balance);
	}
	@Override
	public void deposit(float amount) {
		this.balance += amount;
	}
	@Override
	public boolean withdraw(float amount) {
		if (this.balance >= amount) {
			this.balance -= amount;
			return true;
		}
		else if (amount == 0) {
			System.out.println("Bruhh");
		}
		else {
			System.out.println("Not Enough Balance");
		}
		return false;
	}
	@Override
	public boolean transfer(float amount, BankAccount bk[], BankAccount b) {
		boolean found = false;
		for (int i = 0; i < bk.length; i++) {
			if (bk[i].accNo == b.accNo) {
				found = true;
			}
		}
		if (found && this.balance >= amount && amount > 0) {
			b.balance += amount;
			this.balance -= amount;
			return true;
		}
		return false;
	}
	public int pass() {
		return this.pass;
	}
}
