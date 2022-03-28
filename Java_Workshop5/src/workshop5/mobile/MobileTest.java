package workshop5.mobile;

public class MobileTest {

	public static void main(String[] args) {
		
		Mobile ltab = new Ltab("Ltab", 500, "AP-01");
		Mobile otab = new Otab("Otab", 1000, "AND-20");
		
		System.out.println("Moblie\t\tBattery\t\tOS");
		System.out.println("--------------------------------------------");
		System.out.printf("%s\t\t%d\t\t%s\n",ltab.getMobileName(),ltab.getBatterySize(),ltab.getOsType());
		System.out.printf("%s\t\t%d\t\t%s\n",otab.getMobileName(),otab.getBatterySize(),otab.getOsType());
		System.out.println();
		
		ltab.charge(10);
		otab.charge(10);
		System.out.println("10분 충전");
		System.out.println("Moblie\t\tBattery\t\tOS");
		System.out.println("--------------------------------------------");
		System.out.printf("%s\t\t%d\t\t%s\n",ltab.getMobileName(),ltab.getBatterySize(),ltab.getOsType());
		System.out.printf("%s\t\t%d\t\t%s\n",otab.getMobileName(),otab.getBatterySize(),otab.getOsType());
		System.out.println();
		
		ltab.operate(5);
		otab.operate(5);
		System.out.println("5분 통화");
		System.out.println("Moblie\t\tBattery\t\tOS");
		System.out.println("--------------------------------------------");
		System.out.printf("%s\t\t%d\t\t%s\n",ltab.getMobileName(),ltab.getBatterySize(),ltab.getOsType());
		System.out.printf("%s\t\t%d\t\t%s\n",otab.getMobileName(),otab.getBatterySize(),otab.getOsType());
	}

}
