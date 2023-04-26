// Write a java program to find second smallest element in an array.
import java.util.Scanner;
public class Q11 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int temp;
        int a[]=new int[10];
        for(int k=0; k<5; k++){
            System.out.print("Enter Array elements :");
            a[k]=obj.nextInt();
        }
        for (int i=0; i<=5; i++){
            for (int j=i+1; j<=5; j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }   
        }
        System.out.println("second smallest element in an array is :"+a[2]);

    }
}