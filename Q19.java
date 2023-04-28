// Write a program to accept a number from the user, if number is zero then throw user defined exception ―Number is 0, otherwise display factorial of a number.
import java.util.Scanner;
class invalidnumber extends Exception{
    public String toString(){
        return "invalid input";
    }
}
public class Q19{
    public static void main(String[] args) throws invalidnumber{
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter number: ");
        int num=obj.nextInt();
        try{
            if (num<=0){
                throw new invalidnumber();                
            }else{
                int fact=1;
                for (int i=1;i<=num;i++){
                    fact=fact*i;
                }
                System.out.print("Factorial of number is :"+fact);
            }
        }catch (Exception e) {
            System.out.println(e);
    }}}