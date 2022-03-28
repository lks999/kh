package workshop5.exception;

public class AccountTest {

	public static void main(String[] args){
		Account ac = new Account();
		
		ac = new Account("441-0290-1203", 500000, 7.3);
		System.out.printf("계좌 : %s 잔액 : %.1f 이자 : %.1f\n",ac.getAccount(),ac.getBalance(),ac.getInterestRate());
		
		try
		{
			ac.deposit(-10);
		}
		catch(Exception e)
		{
			System.out.println("입금 금액이 0보다 적습니다.");
		}
		
		try
		{
			ac.withdraw(600000);
		}
		catch(Exception e)
		{
			System.out.println("금액이 0보다 적거나 현재 잔액보다 많습니다.");
		}
		
		System.out.printf("이자: %.1f%n", ac.calculateInterest());
	}

}
