package com.example.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.book.modal.Book;
import com.example.book.service.BookService;

@RestController
@RequestMapping("api/v1")
public class Controller {
	@Autowired
	BookService bookService;

	@GetMapping("/book")
	public List<Book> getBook() {
		return bookService.getAllBook();
	}

	@GetMapping("/{id}")
	public Book getBookid(@PathVariable("id") Long id) {
		return bookService.getById(id);
	}
}
