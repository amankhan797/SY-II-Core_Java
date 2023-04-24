// Write Java program to accept a number from user and calculate sum of digits.
import java.util.Scanner;
class Q3 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        int sum=0;
        int rem=0;

        while (num>0) {
            rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        System.out.println("Sum of Digit is :"+ sum);
    }
}
