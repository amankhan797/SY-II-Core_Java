// read name from user and greet them in upper case leters 
import java.util.Scanner;
public class Aman2{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter your name: ");
        String line=obj.nextLine();
        String mystring=line.toUpperCase();
        System.out.println("Hello "+mystring+" nice to meet you!");
    }
}
