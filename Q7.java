// Java program to print sum of n numbers.
import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter your number : ");
        int num;
        num=obj.nextInt();
        int sum=0;
        for (int i=0; i<=num; i++) {
            sum=sum+i; }
        System.out.println("Sum of n numbers "+sum);
    }
}