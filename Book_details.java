import java.util.*;
import java.util.Scanner;

class Book{
	String name;
	String author;
	int price;
	int num_pages;
	
	public Book(String name,String author,int price,int num_pages){
		this.name = name;
		this.author = author;
		this.price = price;
		this.num_pages = num_pages;
	}
	
	public String getName(){
		return name;
	}

	public void setname(String name){
		this.name = name;
	}

	public String getAuthor(){
		return author;
	}

	public void setAuthor(String author){
		this.author = author; 
	}

	public int getprice(){
		return price;
	}

	public void setprice(int price){
		this.price = price;
	}

	public int getnum_pages(){
		return num_pages;
	}

	public void setnum_pages(int num_pages){
		this.num_pages = num_pages;
	}

	@Override
	public String toString() {
		return "Book name :"+ name + "\nAuthor :"+ author +"\nprice :"+ price +"\nnum_pages :"+ num_pages;
	}

}


class Book_details{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number of Books");
	int n = sc.nextInt();
	sc.nextLine();

	Book[] books = new Book[n];

	for(int i=0; i<n; i++){
		System.out.println("\nEnter details of Book :"+(i+1));

		System.out.println("Enter Name: ");
		String name = sc.nextLine();

		System.out.println("Enter author:");
		String author = sc.nextLine();

		System.out.println("Enter price in rupees:");
		int price = sc.nextInt();

		System.out.println("Enter number of pages:");
		int num_pages = sc.nextInt();
		sc.nextLine();
		
		books[i] = new Book(name,author,price,num_pages);
		
		}

	for(int i=0; i<n; i++){
		System.out.println("\nDetails of Book "+(i+1));
		System.out.println(books[i].toString());
	    }

	}
}
	



			
	
	
	



			
	
	
	



			
	
	
