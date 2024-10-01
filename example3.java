import java.util.Scanner;

class example3{
	public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
	System.out.println("Find Maximum of three numbers \n Enter a:");
	int a = sc.nextInt();
	System.out.println("Enter b:");
	int b = sc.nextInt();
	System.out.println("Enter c:");
	int c = sc.nextInt();

	if(a>b && a>c)
		{
		System.out.println("a is the largest");
		}
	if(b>c && b>a)
		{
		System.out.println("b is the largest");

		}
	if(c>a && c>b)	
		{
		System.out.println("c is the largest");
		}
    }
}