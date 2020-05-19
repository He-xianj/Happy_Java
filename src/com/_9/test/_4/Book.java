package com._9.test._4;

public class Book {
	private int Id;
	private String title;
	public Book(int Id,String title) {
		setId(Id);
		setTitle(title);
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "Book [Id=" + Id + ", title=" + title + "]";
	}
	
	
}
