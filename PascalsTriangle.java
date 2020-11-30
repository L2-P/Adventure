
/**
 * Pascals_triangle
 *
 * @author (Luke Logan)
 * @version (1.1)
 */
import java.util.Scanner;
public class PascalsTriangle {
   static int factorial(int n) {
      int f;

      for(f = 1; n > 1; n--){
         f *= n;
      }
      return f;
   }
   static int ncr(int n,int r) {
      return factorial(n) / ( factorial(n-r) * factorial(r) );
   }
   public static void main(String[] args){
      System.out.print('\u000C');
      System.out.println();
      int s;
      int z;
      int j;
      s = 5;

      for(z = 0; z <= s; z++) {
         for(j = 0; j <= s-z; j++){
            System.out.print(" ");
         }
         for(j = 0; j <= z; j++){
            System.out.print(" "+ncr(z, j));
         }
         System.out.println();
      }
   }
}