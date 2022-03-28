package workshop5.Compony;

public class Compony {
	private double salary;
	private double annualIncome;
	private double bonus;
	private double afterTaxBonus;
	public Compony() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Compony(double salary) {
		super();
		this.salary = salary;
	}
	
	public double getIncome() {
		return salary * 12;
	}
	
	public double getAfterTaxIncome() {
		return getIncome() - (getIncome() *0.1);
	}
	
	public double getBonus() {
		return 4 * (salary * 0.2);
	}
	
	public double getAfterTaxBonus() {
		return getBonus() - (getBonus() * 0.055);
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getAnnualIncome() {
		return annualIncome;
	}
	public void setAnnualIncome(double annualIncome) {
		this.annualIncome = annualIncome;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public void setAfterTaxBonus(double afterTaxBonus) {
		this.afterTaxBonus = afterTaxBonus;
	}
	
	
}
