class Parent{
    static String father_name = "Anjinappa";
}
class child extends Parent{
    static String child_name = "Ajay";
} 

public class Single_Inheritance{
    public static void main(String args[]){
        System.out.println("Parent name: "+Parent.father_name);
        System.out.println("Child name: "+child.child_name);
        System.out.println("Parent name accessing in child class: "+child.father_name);
    }
}