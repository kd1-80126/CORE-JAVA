package com.sunbeam;

import java.util.*;

import javax.swing.text.html.HTMLDocument.Iterator;

class Book {
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

	void acceptData()
	{
	Scanner sc = new Scanner(System.in);

		System.out.println("Enter isbn:");
	    this.isbn=sc.next();
	    System.out.println("Enter price:");
	    this.price=sc.nextDouble();
	    System.out.println("Enter authorName:");
	    this.authorName=sc.next();
	    System.out.println("Enter quantity:");
	    this.quantity=sc.nextInt();
	   
	
	
	}

}

public class Assignment11main {
	static int menu() {
		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println("1.Exit");
		System.out.println("2.Add book");
		System.out.println("3.Find book");
		System.out.println("enter your choice");
		choice = sc.nextInt();

		return choice;
	}

	public static void main(String[] args) {

		Map<String, Book> map = new HashMap<>();

		int choice;
		do {
			choice = menu();

			switch (choice) {
			case 1: {
				System.out.println("Exiting the program");
				break;

			}

			case 2: {// case 1: insert in map
				Book b = new Book();
				b.acceptDetails();
				map.put(b.getIsbn(), b);
			}
				break;

			case 3: {
				Scanner sc = new Scanner(System.in);
				System.out.println("enter isbn");
				String isbn = sc.next();

				Book f = map.get(isbn);
				System.out.println(f);
				break;
			}
			}
		} while (choice != 0);
	}
}
