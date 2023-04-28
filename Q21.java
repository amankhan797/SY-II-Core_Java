// Define a class student having rollno, name and percentage. Define Default and parameterized constructor. Accept the Details of 5 student details and display it. (Use this keyword).
import java.util.Scanner;
class Student{
    int rollno,Percentage;
    String name;
    Scanner obj=new Scanner(System.in);
    Student(){
        System.out.print("Enter your Name :");
        name=obj.nextLine();
        System.out.print("Enter your rollno :");
        rollno=obj.nextInt();
        System.out.print("Enter your Percentage :");
        Percentage=obj.nextInt();
        System.out.println();
    }
    Student(int rollno,String name,int Percentage){
        this.rollno=rollno;
        this.name=name;
        this.Percentage=Percentage;
    }
    void display(){
        System.out.println("Your rollno is :"+rollno);
        System.out.println("Your Name is : "+name);
        System.out.println("Your percentage is :"+Percentage);
    }}
public class Q21{
    public static void main(String[] args) {
        Student obj[]=new Student[5];
        for (int i=0; i<5; i++){
            obj[i]=new Student();
        }
        for(int i=0;i<5; i++){
            obj[i].display();
    }}}