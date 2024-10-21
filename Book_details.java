import java.util.*;
import java.util.Scanner;

class Book{
	String name;
	String author;
	int price;
	int num_pages;
	
	void set_val(String n,String a,int p,int nu){
		name = n;
		author = a;
		price = p;
		num_pages = nu;
	}
	void get_val(){
		System.out.println("Name of the book is :"+name);
		System.out.println("Written by :"+author);
		System.out.println("It contains "+num_pages+" number of pages.");
		System.out.println("It's price value is: Rs "+price);
	}
}


class Book_details{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number of Books");
	int n = sc.nextInt();

	Book[] books = new Book[n];

	for(int i=0; i<n; i++){
		books[i] = new Book();
		System.out.println("\nEnter details of Book :"+(i+1));

		if(i==0){
			sc.nextLine();
		}
		System.out.println("Enter Name: ");
		String name = sc.nextLine();

		System.out.println("Enter author:");
		String author = sc.nextLine();

		System.out.println("Enter price in rupees:");
		int price = sc.nextInt();

		System.out.println("Enter number of pages:");
		int num_pages = sc.nextInt();
		sc.nextLine();
		
		books[i].set_val(name,author,price,num_pages);
		}

	for(int i=0; i<n; i++){
		System.out.println("\nDetails of Book "+(i+1));
		books[i].get_val();
	    }

	}
}
	



			
	
	
	



			
	
	
