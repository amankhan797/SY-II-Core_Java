// Write Java program to Check Character Is Vowel or Consonant.
import java.util.Scanner;
public class Q16 {
    public static void main(String[] args){
        char mychr;
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter character : ");
        mychr=obj.next().charAt(0);
        if (mychr=='a' || mychr=='e' || mychr=='i' || mychr=='o' || mychr=='u'){
            System.out.print("its a Vovel :D");
        }else{
            System.out.print("Its a Consonant :/");
        }
    }
}