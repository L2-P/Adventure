
/**
 * Math_Functions 
 *
 * @author (Luke Logan)
 * @version (1)
 */
import java.util.Scanner;
import java.lang.*;
public class Math_Functions
{
    public static void main (String[] args){
        System.out.print("\u000C");
        System.out.println("This program will solve the formula A(squared) + B(squared) = C(squared) and find the square root of C(squared)."); 
        Scanner myobj = new Scanner(System.in);
        System.out.println("Please select a number for A.");
        double A = myobj.nextDouble();
        System.out.println("please select a number for B");
        double B = myobj.nextDouble();
        
        String inStr = String.valueOf(A);
        System.out.println(A);
          
        String Stu = String.valueOf(B);
        System.out.println(B);
        
        System.out.println(Math.pow(A, 2) + (Math.pow(B, 2)));
        System.out.println("C = " + Math.sqrt(Math.pow(A, 2) + (Math.pow(B, 2))));
        
    
    }
}
