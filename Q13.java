// Define a class Student having data members as rollnumber, name and percentage. Define Default and parameterized constructors. Display details of each student. Use array of objects.
import java.util.*;
class Student{
    int rollnumber;
    String Name;
    int Percentage;
    public Student(){
        Scanner obj=new Scanner(System.in);
        System.out.print("enter Name :");
        Name=obj.next();
        System.out.print("enter Percentage :");
        Percentage=obj.nextInt();
        System.out.print("enter rollno :");
        rollnumber=obj.nextInt();
    }
    public Student(int rollnumber,String Name ,int Percentage){
        this.rollnumber=rollnumber;
        this.Name=Name;
        this.Percentage=Percentage;
    }
    public void display(){
        System.out.println("Name is :"+this.Name);
        System.out.println("Roll no is :"+this.Percentage);
        System.out.println("Percentage is :"+this.rollnumber);
    }
}
public  class Q13{
    public static void main(String[] args){
        Student obj1[]= new Student[2];
        for(int i=0; i<2; i++){ 
            obj1[i]=new Student();
            obj1[i].display();
        }
    }
}