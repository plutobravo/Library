package com.library.library.entities;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

@Document(collection = "Book" )
public class Book {
    @Id
	private int bookid;
	private String bookName;
	private String author;
	private boolean issuedstatus;
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate Issuedate;
	private String userName;
	
	public Book() {
		
	}

	
	public Book(int bookid, String bookName, String author, boolean issuedstatus, LocalDate issuedate, String userName) {
		super();
		this.bookid = bookid;
		this.bookName = bookName;
		this.author = author;
		this.issuedstatus = issuedstatus;
		this.Issuedate = issuedate;
		this.userName = userName;
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public boolean isIssuedstatus() {
		return issuedstatus;
	}

	public void setIssuedstatus(boolean issuedstatus) {
		this.issuedstatus = issuedstatus;
	}

	public LocalDate getIssuedate() {
		return Issuedate;
	}

	public void setIssuedate(LocalDate issuedate) {
		Issuedate = issuedate;
	}
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}


	
	
}
