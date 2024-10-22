import java.util.*;

class StaticDemo{
    // Static variables
    static int a;
    static int b;

    static void setValues(int x,int y){
        a = x;
        b = y;
    }

    static int add(){
        return a + b;
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter first number :");
        int x = sc.nextInt();

        System.out.println("Enter Second number: ");
        int y = sc.nextInt();


        StaticDemo.setValues(x,y);

        int sum = StaticDemo.add();// Calling the static method to add static variables

        System.out.println("Sum is : "+sum);
    }
}