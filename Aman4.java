import java.io.*;
import java.util.Scanner;
public class Aman4{
    public static void main(String[] args)throws IOException{
        File obj=new File("abc.txt");
        try{
            Scanner obj1=new Scanner(obj);
            while(obj1.hasNextLine()){
                String line=obj1.nextLine();
                System.out.println(line);
            }
        obj1.close();  
        } catch(FileNotFoundException e){
            e.printStackTrace();
        }     
    }
}
