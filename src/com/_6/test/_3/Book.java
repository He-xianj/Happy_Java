package com._6.test._3;
import java.io.Serializable;
public class Book implements Serializable {
	private String name;
	private long ISBN;
	private String author;
	private double prices;
	private String press;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getISBN() {
		return ISBN;
	}
	public void setISBN(long iSBN) {
		ISBN = iSBN;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrices() {
		return prices;
	}
	public void setPrices(double prices) {
		this.prices = prices;
	}
	public String getPress() {
		return press;
	}
	public void setPress(String press) {
		this.press = press;
	}
	public Book() {
		
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", ISBN=" + ISBN + ", author=" + author + ", prices=" + prices + ", press="
				+ press + "]";
	}
	public Book(String name,long ISBN,String author,double prices,String press) {
		setName(name);
		setISBN(ISBN);
		setAuthor(author);
		setPrices(prices);
		setPress(press);
	}
	public double discount(double discout) {
		setPrices(getPrices()*discout);
		return getPrices();
	}
	
}
