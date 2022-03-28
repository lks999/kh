package workshop5.school;

public class StudentTest {

	public static void main(String[] args) {
		Student studentArray[] = new Student[3];
		
		studentArray[0] = new Student("홍길동", 15, 171, 81);
		studentArray[1] = new Student("한사람", 13, 183, 72);
		studentArray[2] = new Student("임걱정", 16, 175, 65);
		
		System.out.println("이름\t나이\t신장\t몸무게");
		for(int i = 0; i<studentArray.length; i++)
		{
			System.out.printf("%s\t%d\t%d\t%d\n",studentArray[i].getName(), studentArray[i].getAge(),studentArray[i].getHeight(),studentArray[i].getWeight());
		}
		
		double sum = 0;
		double hSum = 0;
		double wSum = 0;
		double avg = 0;
		double hAvg = 0;
		double wAvg = 0;
		
		for(int i = 0; i<studentArray.length; i++)
		{
			 sum += studentArray[i].getAge();
			 hSum += studentArray[i].getHeight();
			 wSum += studentArray[i].getWeight();
		}
		
		avg = sum / studentArray.length;
		hAvg = hSum / studentArray.length;
		wAvg = wSum / studentArray.length;
		
		System.out.println();
		System.out.printf("나이의 평균 : %.2f\n",avg);
		System.out.printf("신장의 평균 : %.2f\n",hAvg);
		System.out.printf("몸무게의 평균 : %.2f\n",wAvg);

	}

}
