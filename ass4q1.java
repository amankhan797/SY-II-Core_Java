// What is the purpose of the abstract class shapes and its methods area and volume in the Java code, and how are they implemented in the sphere subclass?
import java.util.Scanner;
abstract class shapes{
    int radius;
    abstract void area(int radius);
    abstract void volume(int radius);
}
class sphere extends shapes{
    public void area(int radius){
        double a=4*3.14*radius*radius;
        System.out.println("Area of the sphere is "+a);
    }
    public void volume(int radius){
        double v=((4*3.14*radius*radius*radius)/3);
        System.out.println("Volume of the sphere is "+v);
    }
}
public class ass4q1 {
    public static void main(String[] args) {
        int radius;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radius of sphere:");
         radius=sc.nextInt();
         sphere obj=new sphere();
         obj.area(radius);
         obj.volume(radius);
        
    }
    
}
