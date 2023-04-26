// Write a program which keeps track of number of objects created using static variable and static method.
import java.util.Scanner;
class A{
    static int cnt=0; // Static data member
    public static void display(){   // Static member function
        System.out.println("number of object created "+ cnt++);
    }
}
public class Q14 {
    public static void main(String[] args) {
        A obj=new A(); //object 1 created
        A obj1=new A(); //object 2 created
        obj.display();
        obj1.display();          
    }
}