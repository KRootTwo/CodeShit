package bankAcc;

public interface TransactionOperations {
	void deposit(float amount);
	boolean withdraw(float amount);
	boolean transfer(float amount, BankAccount bk[], BankAccount b);
}
