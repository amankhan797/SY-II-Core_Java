// What is the Java code for implementing a stack data structure using the interface `StackInterface` with methods to push and pop elements, check if the stack is full or empty, and a `mystack` class to test the stack functionality using user input?
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.BlockElement;
interface StackInterface{
    final int size=50;
    void push(int num);
    int pop();
    boolean isFull();
    boolean isEmpty();
}
class Stackopp implements StackInterface{
    int top=-1;
    int stack[]=new int[StackInterface.size];

    public void push(int num){
        stack[++top]=num;
        System.out.println(num+" is pushed into stack successfully!");
    }
    public int pop(){
        return stack[top--];
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public boolean isFull(){
        return top==StackInterface.size-1;
    }
}
public class mystack {
    public static void main(String[] args) {
        int ch,num;
        StackInterface ref=new Stackopp();
        Scanner sc=new Scanner(System.in);
        while(true){
        System.out.print("1.for push\n2.for pop\n3.for exit\nenter your choice:");
        ch=sc.nextInt();
        switch(ch){
            case 1:
              if(ref.isFull()){
                System.out.println("the stack is overflowed!");
              } else{
                System.out.println("enter element to push into stack:");
                num=sc.nextInt();
                ref.push(num);
              }
              break;
            case 2:
            if(ref.isEmpty()){
                System.out.println("the stack is empty!");
              } else{
                System.out.println("popped element is="+ref.pop());
              }
              break;
            case 3:
              System.out.println("Program terminated!!");
              System.exit(0);
            default:
              System.out.println("enter valid choice:");
              break; 
        } 
    }
}
}
