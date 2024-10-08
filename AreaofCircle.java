import java.util.*;
import java.util.Scanner;


class Area{
	double radius;
	double pi=3.14;
}


class AreaofCircle{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in); 
		Area area1 = new Area();
		System.out.println("Enter a radius: ");
		double r = sc.nextInt();

		area1.radius = r;

		System.out.println("Area of Circle is :"+ area1.radius * area1.pi * area1.pi);
	}
}
