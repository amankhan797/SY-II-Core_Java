//Write Java program which accepts  a string and a character to be searched, From the user .The program  should display number of times character found in the string.
import java.util.Scanner;
public class Q15{
    public static void main(String[] args) {
        String mystring="";
        char mychr;
        int cnt=0;
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter your String : ");
        mystring=obj.nextLine();

        System.out.print("Enter character to be searched : ");
        mychr=obj.next().charAt(0); //taking input as a character is complex java
                                          //so we are using charAt() method
                                          
        for (int i=0; i<mystring.length(); i++){
            char temp=mystring.charAt(i); //temp is created to store a single character of a string
            if(mychr==temp){              //comparision of two character
                cnt+=1;
            }
        }
        System.out.println("count of "+mychr+ " is :"+cnt);
}
}