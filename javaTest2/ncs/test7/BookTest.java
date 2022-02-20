package ncs.test7;


public class BookTest {

	public static void main(String[] args) {
		Book bookArray[] = new Book[5];
		double sum = 0.0;
		
		bookArray[0] = new Book("IT", "SQL Plus ", 50000, 5);
		bookArray[1] = new Book("IT", "Java 2.0 ", 40000, 3);
		bookArray[2] = new Book("IT", "JSP Servlet", 60000, 6);
		bookArray[3] = new Book("Nobel", "davincicode", 30000, 10);
		bookArray[4] = new Book("Nobel", "cloven hoof", 50000, 15);
		
		for(int i = 0; i<bookArray.length; i++)
		{
			
			System.out.printf("%s %s %.1f원 %.1f%%\n",bookArray[i].getCategory(),bookArray[i].getBookName(),
					bookArray[i].getBookPrice(),bookArray[i].getBookDiscountRate());
			
			sum += (bookArray[i].getBookPrice() - 
					(bookArray[i].getBookPrice() * (bookArray[i].getBookDiscountRate() / 100)));
			
		}
		
		System.out.printf("책 가격의 합: %.1f원\n",sum);

	}

}
