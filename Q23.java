//  Write a program to accept 3 numbers using command line argument. Sort and display the numbers.
public class Q23{
    public static void main(String[] args) {
        int s[]=new int[3];
        int temp=0;
        System.out.print("Original order is : ");
        for (int i=0; i<s.length; i++){
            s[i]=Integer.parseInt(args[i]);
            System.out.print(s[i]+" ");
        }
        System.out.println();
        for(int i=0; i<s.length; i++){
            for (int j=i+1; j<s.length; j++){
                if (s[i]>s[j]){
                    temp=s[i];
                    s[i]=s[j];
                    s[j]=temp;                    
                } 
            }
        }
        System.out.print("Sorted order is : ");
        for (int i=0; i<s.length; i++){
            System.out.print(s[i]+" ");  

        }
    }
}
