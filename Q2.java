// Write Java Program to calculate addition of all elements in an array.
class Q2 {
    public static void main(String[] args) {
        int myarray[]= {1,2,3,4,5};
        int sum=0;
        for(int i=0 ; i<myarray.length ; i++) {
            sum=sum+myarray[i];
        }
        System.out.println("Sum of Element is :"+ sum);
    }
}