// Write Java program to calculate reverse of a number (Accept a number from user).
import java.util.Scanner;
class Q4 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        int rev=0;
        int rem=0;

        while (num>0) {
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        System.out.println("Reverse of number is :"+ rev);
    }
}