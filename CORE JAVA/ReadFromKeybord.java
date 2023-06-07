import java.lang.*;
import java.util.*;
public class ReadFromKeybord {


    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int a,b,c;
        System.out.println("Enter Your Name : ");

        String name = sc.nextLine();
        System.out.println("welcome, " + name);

        System.out.println("Enter 2 valid integer number : ");
    
        a = sc.nextInt();
        b=sc.nextInt();
        c = a+b;

        System.out.println("Sum of 2 numbers  is : "+c);

      

    }
    
}
/*
 * to read data from keybord we use the following wthod
 * 
 * nextInt() -> to read any integer data
 * nextFloat() - > to read any decimal value
 * nextDouble()-> read double value
 * 
 * next() - > to read any one word
 * nextLine() -> to read a line 
 * 
 * nextBoolean() -> to read boolean value [ True or False]
 *  
 */