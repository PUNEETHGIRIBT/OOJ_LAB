import java.util.*;

class Box{
    double height;
    double weight;
    double depth;

    // Default Constructor
    Box(){
        height = 1.0;
        weight = 2.0;
        depth = 3.0;
    }

    // 3 Parameter Constrcutor
    Box(double h,double w,double d){
        height = h;
        weight = w;
        depth = d;
    }

    // Single Parameter Constructor
    Box(double side){
        height = side;
        weight = side;
        depth = side;
    }

    double volume(){
        return height * weight * depth;
    }

    double volume(double h, double w, double d){
        return h * w * d;
    }

}


public class MethAndConsOverloading{
    public static void main(String args[]){
        Box b1 = new Box();
        Box b2 = new Box(2);
        Box b3 = new Box(8.0,5.6,9.3);

        System.out.println("Volume of default Box :"+b1.volume());
        System.out.println("Volume of Single paramter Box :"+b2.volume());
        System.out.println("Volume of Three parameter Box :"+b3.volume());

        double newVolume = b1.volume(16.0,26.0,32.0);
        System.out.println("Volume of three paramter method :"+newVolume);
    }
}