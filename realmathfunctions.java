
/**
 * Mathfunctions 
 *
 * @author (Luke Logan)
 * @version (1.1)
 */
import java.util.Scanner;
import java.lang.*;
public class realmathfunctions
{
    public static void main (String[] args){
    System.out.print("\u000C");
    System.out.println("Please select math function you would like to use.");
    System.out.println("1 = Math.max(x,y)");
    System.out.println("2 = Math.min(x,y)");
    System.out.println("3 = Math.sqrt(x)");
    System.out.println("4 = Math.abs(x)");
    System.out.println("5 = Math.random()");
    System.out.println("6 = Math.pow(x,y)");
    
    Scanner mynum = new Scanner(System.in);
    int Decision = mynum.nextInt();
    
    if (Decision == 1)
    {
        System.out.println("Please select a number for X and Y. This calculater will give you the max number.");
        double X = mynum.nextDouble();
        double Y = mynum.nextDouble();
        System.out.println(Math.max(X, Y));
    }
    else if (Decision == 2)
    {
        System.out.println("Please select a number for X and Y. This calculater will give you the minimum number.");
        double X = mynum.nextDouble();
        double Y = mynum.nextDouble();
        System.out.println(Math.min(X, Y));
    }
    else if (Decision == 3)
    {
        System.out.println("Please select a number for X. This calculater will find the square root of X.");
        double X = mynum.nextDouble();
        System.out.println(Math.sqrt(X));
    }
    else if (Decision == 4)
    {
        System.out.println("Please select a number for X. This calculater will find the absolute value of an equation.");
        double X = mynum.nextDouble();
        System.out.println(Math.abs(X));
    }
    else if (Decision == 5)
    {
        System.out.println("Please select a number for X. This calculater will give you a number between 0 and 1.");
        System.out.println(Math.random());
    }
    else if (Decision == 6)
    {
        System.out.println("Please select a number for X and Y. This calculater will take X and square it by Y.");
        double X = mynum.nextDouble();
        double Y = mynum.nextDouble();
        System.out.println(Math.pow(X, Y));
    }
    else
    {
        System.out.println("Please select a valid number");
    }
    

    }
}
