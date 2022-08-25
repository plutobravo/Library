package com.library.library.service;

import static java.time.temporal.ChronoUnit.DAYS;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.library.Repository.BookRepository;
import com.library.library.entities.Book;

@Service
public class BookService {

	@Autowired
	public BookRepository repository;

	public String savebook(Book book) {
		Book book2 = new Book();
		book2.setBookName(book.getBookName());
//		if(book==null)

		book2 = repository.save(book);

		return "book saved";
	}

	public Book findBook(String bookName) {

		return repository.findByBookName(bookName);

	}

	public String rentBook(String bookName) {
		Book book = findBook(bookName);

		if (book != null) {
			if (book.isIssuedstatus() == true) {
				return "book already issued";
			} else {
				book.setIssuedate(LocalDate.now());
				book.setIssuedstatus(true);
				repository.save(book);
				return "book issued";
			}

		}
		return "book not found";
	}

	public String submitBook(String bookName, LocalDate submitDate) {

		// 1)find book by book name
		Book book = findBook(bookName);

		// 2)if book present
		// get issue date
		// compare issuedate and submit date to calculate fine(return fine)
		// set issue status false
		if (book != null) {
			if (book.isIssuedstatus() == true) {
				book.setIssuedstatus(false);
				LocalDate bookissuedate = book.getIssuedate();
				Long days = DAYS.between(bookissuedate, submitDate);// for days
				if (days < 10) {
					return "no fine";
				} else if (days > 10 && days < 30) {
					return "fine is rupees 50";
				}
				repository.save(book);
			}

			return "invalid book (this book is not issued)";
		}

		return "no such book";

	}

	
}