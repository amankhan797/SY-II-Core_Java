// Define a class MyNumber having one private integer data member. Write a default constructor, initialize it to 0 and another constructor to initialize it to a value. Write methods isNegative, isPositive, isOdd, iseven. Use command line argument to pass a value to the object and perform the above operations.
class mynumber{
    private int a;
    mynumber(){
        a=0;
    }
    mynumber(int a){
        this.a=a;
    }
    void isNegative(int a){
        if(a<0){
            System.out.println("Number is Negative");
        }
    }
    void isPositive(int a){
        if(a>=0){
            System.out.println("Number is Positive");
        }
    }
    void isOdd(int a){
        if(a%2==0){
            System.out.println("Number is Odd");
        }
    }
    void isEven(int a){
        if(a%2!=0){
            System.out.println("Number is Even");
        }
    }
}
public class Q17{
    public static void main(String[] args) {
        int b=Integer.parseInt(args[0]);
        mynumber obj=new mynumber(b);
        obj.isNegative(b);
        obj.isPositive(b);
        obj.isEven(b);
        obj.isOdd(b);   
    }
}