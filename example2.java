import java.util.Scanner;

class example2{
	public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
	int n,i=1;
	System.out.println("Enter a number to print natural numbers : ");
	n = sc.nextInt();
	while(i<=n){
		System.out.println(+i+"\n");
		i++;
	}
    }
}