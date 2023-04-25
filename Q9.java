// Java program to read the ages of all members of family, store them in one-dimensional array and display the age of the eldest and the youngest person.
import java.util.Scanner;
public class Q9{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int temp;
        int a[]=new int[10];
        int max=a[0];
        for(int k=1; k<=4; k++){
            System.out.print("Enter "+k+" Member's Age : ");
            a[k]=obj.nextInt();
        }
        for (int i=0; i<=4; i++){
            for (int j=i+1; j<=4; j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }   
        }
        for(int l=1; l<=4; l++) {
            if(a[l]>max ) {
                max=a[l];
            }
        }
        System.out.println("youngest person's age is : "+a[1]);
        System.out.println("Eldest person's age is :"+max);   
    }
}