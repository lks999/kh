package com.io.test4.controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.GregorianCalendar;
import java.util.Scanner;
import com.io.test4.model.vo.Book;


public class BookManager {
	
	Scanner sc = new Scanner(System.in);

	public BookManager() {
		super();
	}
	
	public void fileSave() {
		Book[] books = new Book[5];
		
		books[0] = new Book("정보처리기사 실기", "시나공", 33000, new GregorianCalendar(2022, 1, 21));
		books[1] = new Book("아두이노 프로젝트", "영진", 18000, new GregorianCalendar(2020, 9, 30));
		books[2] = new Book("정보처리기사 필기", "수제비", 34000, new GregorianCalendar(2021, 5, 30));
		books[3] = new Book("초보자를 위한 유니티", "다쿠야", 25200, new GregorianCalendar(2019, 5, 1));
		books[4] = new Book("생활코딩! 자바 프로그래밍", "이고잉", 24300, new GregorianCalendar(2022, 1, 9));
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("books.dat")))
		{
			for(int i = 0; i < books.length; i++)
			{
				oos.writeObject(books[i]);
			}
			System.out.println("books.dat 저장 완료!");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}
	
	public void fileRead() {
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("books.dat")))
		{
			Book[] books = new Book[5];
			
			for(int i = 0; i < books.length; i++)
			{
				books[i] = (Book) ois.readObject();
				System.out.println(books[i]);
			}
			System.out.println("books.dat 읽기 완료!");
		} 
		catch (IOException | ClassNotFoundException e) 
		{
			e.printStackTrace();
		} 
	}
}
