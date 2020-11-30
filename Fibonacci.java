    
/**
 * Fibonacci
 *
 * @author (Luke Logan)
 * @version (1.1)
 */
import java.util.Scanner;
public class Fibonacci {
 
    public static void main(String[] args) 
    {
            System.out.print('\u000C');
            System.out.println("Please select a number. This number will determin how many numbers this Fibonacci Sequence will calculate.");
            Scanner Y = new Scanner(System.in);
            int bigNum = Y.nextInt(); 
            long prevNum = 0;
            long nextNum = 1;
            
            System.out.print("Fibonacci Series using "+bigNum+" numbers:");
            
            for (int i = 1; i <= bigNum; ++i)
            {
                System.out.print(prevNum+" "); 
                long sum = prevNum + nextNum;
                prevNum = nextNum;
                nextNum = sum;
            }
            
    }
 
    
}
