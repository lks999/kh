package workshop5.exception;

public class Account {
	private String account;
	private double balance;
	private double interestRate;
	
	public Account() {
		super();
	}
	
	public Account(String account, double balance, double interestRate) {
		super();
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	public double calculateInterest() {
		double interest = (double)((balance * interestRate) / 100);
		return interest;
	}
	
	public void deposit(double money) throws Exception {
		
		if(money < 0)
		{
			throw new Exception();
		}
		else
		{
			balance += money;
		}
		
	}
	
	public void withdraw(double money) throws Exception {		
		
		if(balance < money || money < 0)
		{
			throw new Exception();
		}
		else
		{
			balance -= money;
		}	
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	
}
