package com.example.book.service;

import java.util.List;

import com.example.book.modal.Book;

public interface BookService {

	public List<Book> getAllBook();

	public Book getById(Long id);
}
