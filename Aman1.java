import java.io.*;
import java.util.Scanner;
public class Aman{
    public static void main(String[] args)throws IOException{
        File obj=new File("abc.txt");
        String line;
        try{
            Scanner obj1=new Scanner(obj);
            FileWriter obj2=new FileWriter("xyz.txt");
            while(obj1.hasNextLine()){
                line=obj1.nextLine();
                String data=line.toUpperCase();
                System.out.println(data); 
                obj2.write(data);
            }
            obj1.close();
            obj2.close();  
        } catch(FileNotFoundException e){
            e.printStackTrace();
        }        
    }
}
