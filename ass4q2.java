// What is the purpose of the `operation` interface and the `circle` class in the given Java code, and how does it calculate and print the area of a circle based on user input?
import java.util.*;
interface operation{
    static final double pi=3.142;
    void area(int radius);
}
class circle implements operation{
    int radius;
    public void area(int radius){
        double a=pi*radius*radius;
        System.out.println("The area of circle is "+a);
    }
    public void volume(int radius){
        double a=pi*radius*radius;
        System.out.println("The area of circle is "+a);
    }
}
public class ass4q2 {
    public static void main(String[] args) {
        int radius;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radius of circle:");
        radius=sc.nextInt();
        circle obj=new circle();
        obj.area(radius);
    }
}
