package com.library.library.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.library.library.entities.Book;
import com.library.library.service.BookService;

@RestController
public class BookController {

	@Autowired
	public BookService service;

	@PostMapping("/addBook")
	public String savebook(@RequestBody Book book) {
		return service.savebook(book);
	}

	@GetMapping("/findAllBooks/{bookName}")
	public Book getBook(@PathVariable String bookName) {
		return service.findBook(bookName);
	}

	@GetMapping("/rentBook")
	public String rentBook(@RequestParam String bookName) {
		return service.rentBook(bookName);
	}
	@PostMapping("/submitbook")
    public String submitBook(@RequestParam String bookname, @RequestParam @DateTimeFormat
            (iso=DateTimeFormat.ISO.DATE)LocalDate submitDate) {
    return service.submitBook(bookname, submitDate);    
    }

}
