/**
 * Equation Calculator
 *
 * @author (Luke Logan)
 * @version (2)
 */
import java.util.Scanner;
import java.lang.*;


public class Equation_calculator


{
   public static void main (String[] args)
   {
   
   System.out.print("\u000C");
       
   Scanner myobj = new Scanner(System.in);
   
   System.out.println("2 + B = C");
   System.out.println("Choose a variable # B to solve for C.");
   int in = myobj.nextInt();
   int total = in + 2;
   
   String inStr = String.valueOf(in);
   System.out.println(in);
   System.out.println("2 + " + String.valueOf(in) + " = " + String.valueOf(2 + in));
  
   }
}
