import java.util.*;

class InnerClass{

    class Calculator{
        int a;
        int b;
        void add(int x,int y){
            a = x;
            b = y;
            int c = a + b; 
            System.out.println("Sum is :"+c);
        }
    }

}

public class InnerClassDemo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number to add: ");
        int x = sc.nextInt();

        System.out.println("Enter second number to add");
        int y = sc.nextInt();

        InnerClass outer = new InnerClass();

        InnerClass.Calculator calc = outer.new Calculator();

        calc.add(x,y);
        
    }
}