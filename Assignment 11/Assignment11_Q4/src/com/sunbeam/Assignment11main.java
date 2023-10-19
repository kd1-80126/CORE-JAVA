package com.sunbeam;

import java.util.*;

import javax.swing.text.html.HTMLDocument.Iterator;

class ComparePrice implements Comparator<Book>
{

	@Override
	public int compare(Book B1, Book B2) 
	{
		double diff =-Double.compare(B1.getPrice(), B2.getPrice());
		return (int) diff ;
	}

	
	
	
	
}


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
		return Objects.hash(isbn, price);
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
		return Objects.equals(isbn, other.isbn)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
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
		ComparePrice P = new ComparePrice();

		TreeSet <Book> set = new TreeSet<>(P);
	    
	    set.add(new Book("zzz",80.211,"Akshay",10));
		set.add(new Book("kkk",1001.11,"Aniket",10));
		set.add(new Book("ccc",88.11,"Pawan",10));
		set.add(new Book("qqq",120.11,"Prathamesh",10));
		set.add(new Book("ooo",101.11,"Anil",10));
		set.add(new Book("sss",44.11,"Parth",5));
		set.add(new Book("lll",10.11,"Pawan",10));
		set.add(new Book("ggg",66.11,"Aniket",10));
		set.add(new Book("ggg",120.11,"Aniket",10));

		java.util.Iterator<Book>itr=set.iterator();
		System.out.print("Iterate in Descending order: ");
		while(itr.hasNext())
		{
			Book C=itr.next();
			System.out.println(C);
		}
		
		System.out.print("Iterate in Ascending order: ");
		java.util.Iterator<Book> I =set.descendingIterator();
		while(I.hasNext())
		{
			Book D=I.next();
			System.out.println(D);
		}
		
		
	}

}
