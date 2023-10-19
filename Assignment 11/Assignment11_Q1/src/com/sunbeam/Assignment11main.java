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
		return Objects.hash( isbn);
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

	

	

}
public class Assignment11main {

	public static void main(String[] args) {

		
		Set<Book> set = new HashSet<>();
		set.add(new Book("111",100.11,"Akshay",10));
		set.add(new Book("222",100.11,"Aniket",10));
		set.add(new Book("333",100.11,"Pawan",10));
		set.add(new Book("444",100.11,"Prathamesh",10));
		set.add(new Book("555",100.11,"Anil",10));
		set.add(new Book("555",100.11,"Parth",5));
		set.add(new Book("333",100.11,"Pawan",10));

		java.util.Iterator <Book> itr = set.iterator();
	   while(itr.hasNext())
	   {
		   Book B=itr.next();
		   System.out.println(B);
	   }
		

		
		
	}

}
