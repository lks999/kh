package ncs.test8;

import ncs.test7.Book;

public class BookStore {
	
	public static void main(String[] args) {
		Book bookdata;
		BookUpdater bookupdate;
		
		bookdata = new Book("IT", "HTML5", 30000, 15);
		
		System.out.println("기본정보");
		System.out.printf("%s %.1f\n",bookdata.getBookName(),bookdata.getBookPrice());
		
		bookupdate = new BookUpdater(bookdata);
		bookupdate.updataBookPrice(bookdata);
		
		System.out.println("변경된 정보");
		System.out.printf("%s %.1f\n",bookdata.getBookName(),bookdata.getBookPrice());
	}

}
