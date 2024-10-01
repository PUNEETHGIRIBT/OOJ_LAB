import java.util.Scanner;

class example1{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int n,i;
	System.out.println("Enter a number to print natural numbers : ");
	n = sc.nextInt();
	for(i=1 ; i <= n; i++){
		System.out.println(+i+"\n");
		}
	}
}