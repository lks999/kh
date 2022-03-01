package com.collection.list.book.run;

import java.util.Scanner;

import com.collection.list.book.controller.BookManager;
import com.collection.list.book.model.vo.Book;

public class TestBookManager {
	
	Scanner sc= new Scanner(System.in);
	
	public static void main(String[] args) {
	
		TestBookManager manager = new TestBookManager();
		manager.menu();
	}
	
	public void menu() {
		
		BookManager books = new BookManager(); 
		
		String menu = "*** 도서 관리 프로그램 ***\n" 
				  +"1. 새 도서 추가\n" 
				  +"2. 도서정보 정렬 후 출력\n"
				  +"3. 도서 삭제\n"
				  +"4. 도서 검색 출력\n"
				  +"5. 전체 출력\n"
				  +"6. 끝내기\n"
				  +">번호입력 : ";
		
		while(true)
		{
			System.out.println(menu);
			String choice = sc.next();
			int index = 0;
			
			switch(choice)
			{
			case "1" :
				books.addBook(inputBook());
				break;
			case "2" :
				books.printBookList(books.sortedBookList());
				break;
			case "3" :
				index = books.searchBook(inputBookTitle());
				if (index == -1)
				{
					System.out.println("이미 삭제 됬거나 없는 책입니다.");
				}
				else
				{
					books.deleteBook(index);
				}
				break;
			case "4" : 
				index = books.searchBook(inputBookTitle());
				if (index == -1)
				{
					System.out.println("책을 찾을 수 없습니다.");
				}
				else
				{
					books.printBook(index);
				}
				break;
			case "5" :
				books.printAll();
				break;
			case "6" :
				System.out.println("프로그램 종료");
				return;
			}
		}
	}
	
	public Book inputBook() {
		
		sc.nextLine();
		System.out.print("도서 번호 입력 : ");
		String bNo = sc.nextLine();
		
		System.out.print("도서 분류코드 입력(1.인문/2.자연과학/3.의료/4.기타) : ");
		int category = sc.nextInt();
		sc.nextLine();
		
		System.out.print("제목 입력 : ");
		String title = sc.nextLine();
		
		System.out.print("저자 입력 : ");
		String author = sc.nextLine();
		
		return new Book(bNo, category, title, author);
		
	}
	
	public String inputBookTitle() {
		System.out.print("책 이름 입력 : ");
		return sc.next();
	}
	
}