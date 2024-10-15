import java.util.*;

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
	Book b1 = new Book();
	b1.set_val("C_Program","Jez",150,350);
	b1.get_val();

	}
}
	



			
	
	