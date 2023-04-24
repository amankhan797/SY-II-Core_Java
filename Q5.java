// Write Java program to accept a number from the command prompt and generate multiplication table of a number.
class Q5 {
    public static void main(String[] args) {
        int num=Integer.parseInt(args[0]);
        for(int i=0 ; i<11 ; i++) {
            System.out.println(num+" X "+i+" = "+num*i);
        }
    }
}