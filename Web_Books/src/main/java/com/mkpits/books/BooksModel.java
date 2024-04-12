package com.mkpits.books;

public class BooksModel {

	 private int id;
	 private String title;
	 private String author;
	 private String date;
	 private String genres;
	public BooksModel(int id, String title, String author, String date, String genres) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.date = date;
		this.genres = genres;
	}
	public BooksModel() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getGenres() {
		return genres;
	}
	public void setGenres(String genres) {
		this.genres = genres;
	}
	@Override
	public String toString() {
		return "BooksModel [id=" + id + ", title=" + title + ", author=" + author + ", date=" + date + ", genres="
				+ genres + "]";
	}
	 
	 
	
}
