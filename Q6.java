// Java program to find factorial of a given number.
import java.util.Scanner;
class Q6 {
    public static void main(String[] args) {
        System.out.print("enter number");
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        int fact=1;
        for (int i = 1; i <= num; i++) {
            fact=fact*i;
        }
        System.out.println("Factorial of number is :"+ fact);
    }
}
