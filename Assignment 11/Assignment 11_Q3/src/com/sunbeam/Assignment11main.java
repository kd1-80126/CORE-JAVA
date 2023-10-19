package com.sunbeam;

import java.util.*;

import javax.swing.text.html.HTMLDocument.Iterator;

class Book implements Comparable<Book> 
{
	private String isbn;
	private double price;
	private String authorName;
	private int quantity;

	public Book() {
	}

	public Book(String isbn, double price, String authorName, int quantity) {
		this.isbn = isbn;
		this.price = price;
		this.authorName = authorName;
		this.quantity = quantity;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	void acceptDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ISBN of the book:");
		isbn = sc.next();
		System.out.println("Enter price of the book:");
		price = sc.nextDouble();
		System.out.println("Enter author name of the book:");
		authorName = sc.next();
		System.out.println("Enter quantity of the book:");
		quantity = sc.nextInt();
	}

	void displayData() {
		System.out.println("ISBN of book: " + this.getIsbn());
		System.out.println("Price of book: " + this.getPrice());
		System.out.println("Author of book: " + this.getAuthorName());
		System.out.println("Quantity of book: " + this.getQuantity());

	}

	@Override
	public int hashCode() {
		return Objects.hash(isbn);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(this.isbn, other.isbn);
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", price=" + price + ", authorName=" + authorName + ", quantity=" + quantity
				+ "]";
	}
//	 private String isbn;
//	    private double price;
//	    private String authorName;
//	    private int quantity;

	@Override
	public int compareTo(Book other) 
	{
		 int diff=this.isbn.compareTo(other.isbn);
		
		return diff;
	}
}




public class Assignment11main {

	public static void main(String[] args) {
    Set <Book> set = new TreeSet<>();
    
    set.add(new Book("zzz",100.11,"Akshay",10));
	set.add(new Book("kkk",100.11,"Aniket",10));
	set.add(new Book("ccc",100.11,"Pawan",10));
	set.add(new Book("qqq",100.11,"Prathamesh",10));
	set.add(new Book("ooo",100.11,"Anil",10));
	set.add(new Book("sss",100.11,"Parth",5));
	set.add(new Book("lll",100.11,"Pawan",10));
	set.add(new Book("ggg",100.11,"Aniket",10));
	
	java.util.Iterator<Book>itr=set.iterator();
	while(itr.hasNext())
	{
		Book C=itr.next();
		System.out.println(C);
	}

	
	}

}
