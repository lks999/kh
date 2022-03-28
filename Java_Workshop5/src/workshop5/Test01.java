package workshop5;

public class Test01 {

	public static void main(String[] args) {
		Test01 test = new Test01();
		test.test1(args);

	}
	
	public void test1(String[] args) {
		String str = args[0];
		
		for(int i = str.length() -1; i>=0; i--)
		{
			System.out.print(str.charAt(i));
		}
	}

}
