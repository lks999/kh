package com.collection.map.book;

import java.util.Scanner;

import com.collection.list.book.model.vo.Book;
import com.collection.map.book.controller.MapBookManager;

public class TestBookManager {
	
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		TestBookManager manager = new TestBookManager();
		manager.menu();
	}
	
	public void menu() {
		
		MapBookManager books = new MapBookManager(); 
		
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
			
			switch(choice)
			{
			case"1" : 
				books.putBook(inputBook());
				break;
			case"2" : 
				books.printBookMap(books.sortedBookMap());
				break;
			case"3" : 
				String str = books.searchBook(inputBookTitle());
				
				if(str == null)
				{
					System.out.println("이미 삭제 됬거나 없는 책입니다.");
				}
				else
				{
					books.deleteBook(str);
					System.out.println("삭제했습니다.");
				}
				break;
			case"4" : 
				str = books.searchBook(inputBookTitle());
				
				if(str == null)
				{
					System.out.println("없는 책입니다.");
				}
				else
				{
					books.printBook(str);
					
				}
				break;
			case"5" :
				books.displayAll();
				break;
			case"6" : 
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
