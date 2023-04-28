// Define a class MyDate (day, month, year) with methods to accept and display MyDate object. Accept date as dd, mm, yyyy. Throw user defined exception “InvalidDateException” ifthe date is invalid. Examples of invalid dates : 12 15 2015, 31 6 1990, 29 2 2001.
import java.util.Scanner;
class invalidday extends Exception{
    public String toString(){
        return "invalid Day :/";
    }
}
class invalidmonth extends Exception{
    public String toString(){
        return "invalid Month :/";
    }
}
public class Q22{ //class name is mydate
    public static void main(String[] args) throws invalidday,invalidmonth{
        int dd,mm,yy;
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter Day : ");
        dd=obj.nextInt();
        System.out.print("Enter Month : ");
        mm=obj.nextInt();
        System.out.print("Enter Year : ");
        yy=obj.nextInt();
        try{
            if (mm<1 || mm>12){
                throw new invalidmonth();                
            }
            switch (mm) {
                case 1:case 3:case 5:case 7:case 8:case 10: case 12:
                if(dd<1 || dd>31){
                    throw new invalidday();
                }                  
                break;
                case 4:case 6:case 9:case 11:
                if(dd<1||dd>30){
                    throw new invalidday();
                }
                break;
                case 2:
                if(yy%4==0 && yy%400==0 && mm==2){
                    if(dd<1 || dd>29){
                        throw new invalidday();
                    }
                }else if(dd<1||dd>28){
                    throw new invalidday();
                }
                default:
                    break;
            }
        }catch (Exception e) {
            System.out.println(e);
    }}}