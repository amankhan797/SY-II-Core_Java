// Write a program which define class Employee with data member as id, name and salary Store the information of 'n' employees and Display the name of employee having maximum salary (Use array of object).
import java.util.Scanner;
class Employee{
    int id,salary;
    String  name;
    Scanner obj=new Scanner(System.in);
    Employee(){
        System.out.print("enter Name : ");
        name=obj.nextLine();
        System.out.print("enter ID : ");
        id=obj.nextInt();
        System.out.print("enter salary : ");
        salary=obj.nextInt();
        System.out.println();
    }
    void Display(){
        System.out.println("Your ID is: "+id);
        System.out.println("Your salary is: "+salary);
        System.out.println("Your Name is: "+name);
    }} 
public class Q20{
    public static void main(String[] args) {
        Scanner obj1=new Scanner(System.in);
        int max=0;
        System.out.print("how many records do you want to insert: ");
        int n=obj1.nextInt();
        Employee obj[]=new Employee[n];
        for(int i=0; i<n; i++){
            obj[i]=new Employee();
            if(max<obj[i].salary){
                max=obj[i].salary;
            }
        }
        for(int i=0; i<2; i++){
            if (max==obj[i].salary){
                obj[i].Display();
}}}}