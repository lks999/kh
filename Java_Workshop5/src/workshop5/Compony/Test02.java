package workshop5.Compony;

public class Test02 {

	public static void main(String[] args) {
		Compony co = new Compony();
		String str = args[0];
		
		int salary = Integer.parseInt(str);
		co.setSalary(salary);
		
		System.out.printf("연 기본급 합: %.1f 세후: %.1f%n", co.getIncome(), co.getAfterTaxIncome());
		System.out.printf("연 보너스 합: %.1f 세후: %.1f%n", co.getBonus(), co.getAfterTaxBonus());
		System.out.printf("연 지급액 합: %.1f%n", co.getAfterTaxIncome() + co.getAfterTaxBonus());

	}

}
