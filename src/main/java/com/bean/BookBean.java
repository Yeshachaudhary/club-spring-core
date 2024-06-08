package com.bean;

public class BookBean {
	
	private String book;
	private String id; 
	
	private AuthorBean author;

	
	private BookBean(AuthorBean author)
	{
		this.author=author;
	}
	public String getBook() {
		return book;
	}

	public void setBook(String book) {
		this.book = book;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public AuthorBean getAuthor() {
		return author;
	}

	public void setAuthor(AuthorBean author) {
		this.author = author;
	}
	

}
