
/**
 * madLibs Assignment.
 *
 * @author (Luke Logan)
 * @version (1.2)
 */
import java.util.Scanner;

public class madLibs
{
    public static void main(String[] args) {
    System.out.print("\u000C");
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter username");

    String userName = myObj.nextLine();  // Read user input
    System.out.println("Username is: " + userName);  // Output user input
    
  

    Scanner myObj1 = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Name adj.");

    String Fill_in_the_blank = myObj1.nextLine();  // Read user input
    System.out.println("" + Fill_in_the_blank);  // Output user input
    
    Scanner myObj2 = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Name a building");

    String Fill_in_the_blank2 = myObj1.nextLine();  // Read user input
    System.out.println("" + Fill_in_the_blank2);  // Output userinput
    
    Scanner myObj3 = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Name a grim place");

    String Fill_in_the_blank3 = myObj1.nextLine();  // Read user input
    System.out.println("" + Fill_in_the_blank3);  // Output user input
    
    Scanner myObj4 = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Name a verb");

    String Fill_in_the_blank4 = myObj1.nextLine();  // Read user input
    System.out.println("" + Fill_in_the_blank4); // Output user input

    Scanner myObj5 = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Name a happy place");

    String Fill_in_the_blank5 = myObj1.nextLine();  // Read user input
    System.out.println("" + Fill_in_the_blank5);  // Output user input
    
    System.out.println(" ");
    System.out.println(" ");
    
    System.out.println("My dog is " + Fill_in_the_blank); 
    System.out.println("He fell off a " + Fill_in_the_blank2); 
    System.out.println("So, we took him to the " + Fill_in_the_blank3); 
    System.out.println("During his visit, he " + Fill_in_the_blank4); 
    System.out.println("He then went to " + Fill_in_the_blank5); 
    System.out.println("The End");
}
 
}


