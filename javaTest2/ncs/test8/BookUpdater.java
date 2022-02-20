package ncs.test8;

import ncs.test7.Book;

public class BookUpdater {
	
	private Book bookData;

	public BookUpdater() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BookUpdater(Book bookData) {
		super();
		this.bookData = bookData;
	}

	public Book getBookData() {
		return bookData;
	}

	public void setBookData(Book bookData) {
		this.bookData = bookData;
	}
	
	public void updataBookPrice(Book book) {
		book.setBookPrice(book.getBookPrice() - (book.getBookPrice() * (book.getBookDiscountRate()/100)));
	}

}
