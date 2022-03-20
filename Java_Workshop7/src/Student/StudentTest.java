package Student;

public class StudentTest {

	public static void main(String[] args) {
		Student studentArray[] = new Student[3];
		
		studentArray[0] = new Student("홍길동", 15, 170, 80);
		studentArray[1] = new Student("한사람", 13, 180, 70);
		studentArray[2] = new Student("임걱정", 16, 175, 65);
		
		double agemax = 0;
		double ageavg = 0;
		double heightmax = 0;
		double heightavg = 0;
		double weightmax = 0;
		double weightavg = 0;
		
		System.out.println("이름\t나이\t신장\t몸무게");
		for(int i = 0; i < studentArray.length; i++)
		{			
			System.out.println(studentArray[i].studentInfo());
			agemax += (studentArray[i].getAge());
			ageavg = agemax / 3;
			
			heightmax += (studentArray[i].getHeight());
			heightavg = heightmax / 3;
			
			weightmax += (studentArray[i].getWeight());
			weightavg = weightmax / 3;
		}	
		
		System.out.println();
		
		System.out.printf("나이 평균 : %.3f\n",ageavg);
		System.out.printf("신장 평균 : %.3f\n",heightavg);
		System.out.printf("몸무게 평균 : %.3f\n",weightavg);
		
		System.out.println();
		
		int agemin2 = 0;
		int agemax2 = 0;
		int heightmin2 = 0;
		int heightmax2 = 0;
		int weightmin2 = 0;
		int weightmax2 = 0;
		
		for(int i = 0; i <studentArray.length; i++)
		{
			if(studentArray[agemax2].getAge() < studentArray[i].getAge())
			{
				agemax2 = i;
			}
			
			if(studentArray[agemin2].getAge() > studentArray[i].getAge())
			{
				agemin2 = i;
			}
			
			if(studentArray[heightmax2].getHeight() < studentArray[i].getHeight())
			{
				heightmax2 = i;
			}
			
			if(studentArray[heightmin2].getHeight() > studentArray[i].getHeight())
			{
				heightmin2 = i;
			}
			
			if(studentArray[weightmax2].getWeight() < studentArray[i].getWeight())
			{
				weightmax2 = i;
			}
			
			if(studentArray[weightmin2].getWeight() > studentArray[i].getWeight())
			{
				weightmin2 = i;
			}
		}
		System.out.println("나이가 가장 많은 학생 : " + studentArray[agemax2].getName());
		System.out.println("나이가 가장 적은 학생 : " + studentArray[agemin2].getName());
		System.out.println("신장이 가장 큰 학생 : " + studentArray[heightmax2].getName());
		System.out.println("신장이 가장 작은 학생 : " + studentArray[heightmin2].getName());
		System.out.println("몸무게가 가장 많이 나가는 학생 : " + studentArray[weightmax2].getName());
		System.out.println("몸무게가 가장 적게 나가는 학생 : " + studentArray[weightmin2].getName());
		
	}
}
