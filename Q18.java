// Write a program which define class Product with data member as id, name and price. Store the information of 5 products and Display the name of product having minimum price (Use array of object).
import java.util.Scanner;
class Product{
    int id,price;
    String  name;
    Scanner obj=new Scanner(System.in);
    Product(){
        System.out.print("enter Name : ");
        name=obj.nextLine();
        System.out.print("enter ID : ");
        id=obj.nextInt();
        System.out.print("enter Price : ");
        price=obj.nextInt();
        System.out.println();
    }
    void Display(){
        System.out.println("Your ID is: "+id);
        System.out.println("Your Price is: "+price);
        System.out.println("Your Name is: "+name);
    }} 
public class Q18{
    public static void main(String[] args) {
        int max=0;
        Product obj[]=new Product[2];
        for(int i=0; i<2; i++){
            obj[i]=new Product();
            if(max<obj[i].price){
                max=obj[i].price;
            }
        }
        for(int i=0; i<2; i++){
            if (max==obj[i].price){
                obj[i].Display();
        }}}}