package com.collection.map.book.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.collection.list.book.model.compare.AscCategory;
import com.collection.list.book.model.vo.Book;

public class MapBookManager {
	private HashMap<String, Book> booksMap;

	public MapBookManager() {
		booksMap = new HashMap<>();
		booksMap.put("1",new Book("1", 1, "아아아", "저자1"));
		booksMap.put("2",new Book("2", 2, "김김김", "저자2"));
		booksMap.put("3",new Book("3", 3, "지지지", "저자3"));
		booksMap.put("4",new Book("4", 4, "비비비", "저자4"));
	}

	public MapBookManager(HashMap<String, Book> booksMap) {
		super();
		this.booksMap = booksMap;
	}
	
	public void putBook(Book book) {
		booksMap.put(book.getbNo(), book);
	}
	
	public void deleteBook(String key) {
		booksMap.remove(key);
	}
	
	public String searchBook(String title) {
		Set<Map.Entry<String, Book>> entrySet = booksMap.entrySet();
		for(Map.Entry<String, Book> entry : entrySet)
		{
			Book value = entry.getValue();
			if(value.getTitle().contains(title))
			{
				return entry.getKey();
			}	
		}
		return null;
	}
	
	public void displayAll() {
		Set<String> keySet = booksMap.keySet();
		for(String key : keySet) 
		{
			System.out.println(booksMap.get(key));
		}
	}
	
	public Book[] sortedBookMap() {
		Book[] books = new Book[booksMap.size()];
		List<Book> List = new ArrayList<>(booksMap.values());
		
		Comparator<Book> comparator = new AscCategory();
		
		Collections.sort(List, comparator);
		
		for(int i = 0; i < booksMap.size(); i++)
		{
			books[i] = List.get(i);
		}
		return books;
	}
	
	public void printBookMap(Book[] br)
	{
		for(Book books : br)
		{
			System.out.println(books);
		}
	}
	
	public void printBook(String key)
	{
		System.out.println(booksMap.get(key));
	}
}
