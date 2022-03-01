package com.collection.list.book.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.collection.list.book.model.compare.AscCategory;
import com.collection.list.book.model.vo.Book;

public class BookManager {
	
	private ArrayList<Book> bookList;

	public BookManager() {
		bookList = new ArrayList<>();
	}

	public BookManager(ArrayList bookList) {
		super();
		this.bookList = bookList;

	}
	
	public void addBook(Book book) {
		bookList.add(book);
	}
	
	public void deleteBook(int index) {
		bookList.remove(index);
	}
	
	public int searchBook(String title) {
		for(int i = 0; i < bookList.size(); i++) 
		{
			if(title.equals(bookList.get(i).getTitle()))
				return i;
		}
		return -1;
	}
	
	public void printBook(int index) {
		System.out.println(bookList.get(index));
	}
	
	public void printAll() {		
		for(int i = 0; i<bookList.size(); i++)
		{
			System.out.println(bookList.get(i));
		}
	}
	
	public Book[] sortedBookList() {
		Book[] books = new Book[bookList.size()];
		
		Comparator<Book> comparator = new AscCategory();
		Collections.sort(bookList, comparator);
		
		for(int i = 0; i < bookList.size(); i++)
		{
			books[i] = bookList.get(i);
		}
		return books;
	}
	
	public void printBookList(Book[] br) {
		for(Book books : br)
		{
			System.out.println(books);
		}
	}
	
	

}
