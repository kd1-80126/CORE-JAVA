package com.sunbeam;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;

import javax.swing.text.html.HTMLDocument.Iterator;

class Book implements Serializable{
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
		return Objects.equals(isbn, other.isbn);
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", price=" + price + ", authorName=" + authorName + ", quantity=" + quantity
				+ "]";
	}
    
}
public class Assignment13_Q2main {

	private static final boolean BookExists = false;
	static int menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("0. Exit");
        System.out.println("1. Add a book");
        System.out.println("2. Display all books in forward order");
        System.out.println("3. Search a book with given isbn");
        System.out.println("4. Delete a book at given index.");
        System.out.println("5.Delete a book with given isbn");
        System.out.println("6. Reverse the list");
        System.out.println("7. Save books in file");
        System.out.println("8. Load books from file ");

        System.out.print("Enter your choice: ");
        return sc.nextInt();
    }
    public static void main(String[] args) {
        ArrayList<Book> list = new ArrayList<Book>();
        int choice;
        Book b;
        Scanner sc = new Scanner(System.in);

        do {
            choice = menu();
            switch (choice) {
            case 0:
                {System.out.println("Exiting the program.");}
                break;
                
                case 1:
                	{b=new Book();
                	b.acceptDetails();
                	if(list.contains(b))
                	{
                		int index=list.indexOf(b);
                	Book bk=list.get(index);
                	bk.setQuantity(bk.getQuantity()+1);
                	System.out.println("Quntity is increamented");
                	}
                	else
                	{
                		list.add(b);
                		System.out.println("New Book is added");
                	}
                	}
                    break;

                case 2:
                	//Iterator<Book> itr=list.iterator();
                	java.util.Iterator<Book> itr = list.iterator();
                	while(itr.hasNext())
                	{
                	Book element=itr.next();
                	System.out.println(element);
                	}
                	
                	break;
                	
                case 3:
                	{System.out.println("Enter isbn to find:");
                	String isbn=sc.next();
                	Book key = new Book();
                	key.setIsbn(isbn);
                	int index=list.indexOf(key);
                	if(index == -1)
                	{
                		System.out.println("Book not found");
                	}
                	else
                	{
                		System.out.println("Book found");
                		b=list.get(index);
                		System.out.println(b);
                	}}
                	break;
                	
                case 4:
                	
                	System.out.println("Enter index from which book to be deleted:");
                	int Index=sc.nextInt();
                	list.remove(Index);
                	System.out.println(list.toString());
                	break;
                	
                case 5:
                	{System.out.println("Enter isbn to find:");
                	String isbn=sc.next();
                	Book key = new Book();
                	key.setIsbn(isbn);
                	int index=list.indexOf(key);
                	if(index == -1)
                	{
                		System.out.println("Book not found");
                	}
                	else
                	{
                		System.out.println("Book found");
                		b=list.get(index);
                		list.remove(index);
                		System.out.println(b);
                	}
                	}
                	break;
                	
                case 6:{
                	System.out.println("reversed list is:");
                	ListIterator<Book>i=list.listIterator(list.size());
                	while(i.hasPrevious())
                	{
                		Book B=i.previous();
                		System.out.println(B);
                	}
                }
                break;
                
                case 7:
                {
                    try(FileOutputStream fout = new FileOutputStream("Yugantar.txt"))
                    {
                       try(ObjectOutputStream oout = new ObjectOutputStream (fout))
                    		   {
                              	  oout.writeObject(list);
                    		   }
                    }
                    
                    catch (Exception e) 
                    {
            			e.printStackTrace();
            		}
                    System.out.println("Books are saved");
                }
                	break;
                	
                	
                	
                case 8 :
                {
                	List<Book> A;
                	try(FileInputStream fin = new FileInputStream("Yugantar.txt"))
                	{
                	     try(ObjectInputStream oin = new ObjectInputStream(fin))
                	     {
                		   
                	    	 A = (List<Book>) oin.readObject();
             				A.forEach(m -> System.out.println(m));
                		    }
                	     }
                	
                	    
            		    catch (Exception e)
                	    {
            			   e.printStackTrace();
            		     }
               }
                	break;
                	
                
               
               
                
                default:
                {
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        
    } while (choice != 0);

    
}
}