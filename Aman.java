// Write Java Program find maximum element of an array.(Take Input as
// Command line argument)
class Aman {
    public static void main(String[] args){
        int[] A=new int[10];
        int i;
        int max=A[0];
        for (i = 0; i < args.length; i++) {
            A[i]=Integer.parseInt(args[i]);
        }
        for(int j=0 ; j<args.length ; j++) {
            if(A[j]>max ) {
                max=A[j];
            }
        }
        System.out.println("Max Element is :"+ max);
    }
}
