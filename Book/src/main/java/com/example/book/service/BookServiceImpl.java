package com.example.book.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.book.modal.Book;

@Service
public class BookServiceImpl implements BookService {

	@Override
	public List<Book> getAllBook() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * private static List<Book> list = new ArrayList<>(); static { list.add(new
	 * Book(101l, "math", "aasastin")); list.add(new Book(102l, "hindi", "kabir"));
	 * list.add(new Book(103l, "english", "roobathook")); list.add(new Book(104l,
	 * "science", "aarstu")); }
	 * 
	 * @Override public List<Book> getAllBook() {
	 * 
	 * return list; }
	 * 
	 * @Override public Book getById(Long id) { Book book = null; book =
	 * list.stream().filter(e -> e.getId() == id).findFirst().get(); return book; }
	 */
}
