// Write Java Program to accept a number from user and check if the number is perfect or not.
import java.util.Scanner;
public class Q12{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter number :" );
        int n=obj.nextInt();
        int res=0;
        for(int i=1; i<n; i++){
            if(n%i==0){
                res=res+i;
            }
        }
        if(res==n){
            System.out.println("Number is perfect");
        }else{
            System.out.println("number is not perfect");
        }
    }
}