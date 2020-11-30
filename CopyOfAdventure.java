/**
 * Descision_maker 
 *
 * @author (Luke Logan)
 * @version (1.1)
 */
import java.util.Scanner;
public class CopyOfAdventure 

{
  public static void main(String[] args) {
   System.out.print("\u000C"); 
   Scanner inputScanner = new Scanner(System.in);
   String play = "yes";
   while (play.equals("yes") || play.equals("Yes"))
   {
    System.out.println("Welcome to the jungle user.");
    System.out.println("You will have to navagate this harsh wilderness if you are to survive. For each question, you must answer correctly or face the consequences.");
    System.out.println("You wake up in the middle of a bank souronded by water on all fronts.");
    System.out.println("Option 1: Swim to land");
    System.out.println("Option 2: Make a boat");
    System.out.println("Option 3: Use old swamp vines to swing to land");
    System.out.println("Option 4: Go back to sleep and pretend that this is a bad dream");
    System.out.println("Option 5. Do nothing");
    System.out.println("The numbers you chose corespond to options above. Pick either 1, 2, 3, 4, or 5.");
    
    Scanner mynum = new Scanner(System.in);
    
    int hi = mynum.nextInt();
    
    if (hi == 1)
    {
        System.out.println("You have been eaten by paranas. Please try again.");
    }
    else if (hi == 2)
    {
        System.out.println("You could not fasten a river worthy vestile, so you died of exaustion next to your almost ok boat. Please try again");
    }
    else if (hi == 3)
    {
        System.out.println("Congrats!!! You have made it to the next round because the vines held up.");
        System.out.println("You still have many challenges to go.");
        System.out.println("You now have a hard decision to make.");
        System.out.println("Your hungry and you can only pick one of these options to do.");
        System.out.println("1 = Forage for food");
        System.out.println("2 = Look for shelter");
        System.out.println("3 = Fasten a weapon");
        System.out.println("Please select a number.");
        int ewn = mynum.nextInt();
       if (ewn == 1)
       { 
        System.out.println("Congrats!!! You found special berries that are full of water and that helped refule you.");
        System.out.println("It's getting dark. Please choose an option if you are to live.");
        System.out.println("1 = Fasten a weapon");
        System.out.println("2 = Look for shelter");
        System.out.println("3 = Build a fire near a large bolder");
        System.out.println("4 = Continue Journying into the jungle and press your luck");
        System.out.println("Please select 1-4.");
        int AST = mynum.nextInt();
       if (AST == 3)
       {
        System.out.println("Good survival skills. You kept the wild life away with your fire and the bolder served as a good rest point.");
        System.out.println("You traverse through the thick brush for hours and hear the sounds of vehicles. If you hear more than one of these sounds, you can be sure it is not a helusination, but if you hear too many,it could be a helusination.");
        System.out.println("Please enter how many times you herd the vehicle sound.");
        int i = mynum.nextInt();
        if (i < 20)
        {
        System.out.println(i);
        i++;
        System.out.println("You found a caravan of twenty trucks");
        System.out.println("Congrats you wern't helusinating. You have been picked up by a caravan of wilderness explorers.");
        System.out.println("You must pass one more test if you are to make it out alive. On your ride home, will you");
        System.out.println("1. Ride with the caravan");
        System.out.println("2. Ride on your own");
        System.out.println("3. Or stay where you are?");
        int FINAL = mynum.nextInt();
        if (FINAL == 1)
        {
        System.out.println("Awesome job!!! Thanks for playing. You have made it home safely.");
        }  
        else if (FINAL == 2)
        {
        System.out.println("On your way home, you find a temple that is gaurding a treasure.");
        System.out.println("1. Explore the temple");
        System.out.println("2. Keep riding home");
        int dest = mynum.nextInt();
        if (dest == 1)
        {
       System.out.println("You see a treasure in the temple, but in order to obtain it, you must enter the correct # combonation.");
        System.out.println("The riddle under the treasure reads, If you seek this treasure you must enter 1 2 3 with no spaces in one line..");
        int we = mynum.nextInt();
       if (we == 123)
       {
           System.out.println("Congrats!!! You have found a jem worth billions and made it to safty.");
           System.out.println("Thanks for playing");
       }
        
       }
       else if (dest == 2)
       {
        System.out.println("You come to a river that has flooded the road.");
        System.out.println("1. Hall your vehicle across the river");
        System.out.println("2. Ditch the vehicle and continue on foot");
        System.out.println("3. Travel back to the caravan");
        int edna = mynum.nextInt();
       if (edna == 1)
       {
           System.out.println("You got stuck half way and drowned.");
           System.out.println("Please play again.");
       }
       else if (edna == 2)
       {
           System.out.println("You have made it back to town.");
           System.out.println("You can");
           System.out.println("1. Fly back to the USA");
           System.out.println("2. Swim back to the USA");
           System.out.println("3. Ride in a boat back to the USA");
           int time = mynum.nextInt();
           if (time == 1)
           {
               System.out.println("Congrats!!! You have beat the game.");
           }
           else if (time == 2)
           {
               System.out.println("Congrats!!! You have beat the game.");
           }
           else if (time == 3)
           {
               System.out.println("Congrats!!! You have beat the game.");
           }
           else
           {
               System.out.println("Please select a valid number");
           }
        }
       else if (edna == 3)
       {
           System.out.println("You got eaten by a snake while looking for the caravan.");
       }
       else 
       {
           System.out.println("Please start over and select a valid number.");
       }
       }
       else
       {
        System.out.println("Please start over and select a valid number.");
       }
        }  
        else if (FINAL == 3)
        {
        System.out.println("Your stupid. Please play again.");
        }  
        else 
        {
        System.out.println("That was incorrect. Please play again.");
        }
        }
        else if (i >= 20)
        {
        System.out.println("Your number was too good to be true. You went mentaly insane and died. Please play again.");
        }   
        
        }
        else if (AST == 1)
        {
        System.out.println("There was no materials that could build a strong enough weapon to fend off a gorilla. Please try again.");
        }
        else if (AST == 2)
        {
        System.out.println("There was no reliable shelter that could have stopped a jaguar from ripping you to shreads.");
        }
        else if (AST == 4)
        {   
        System.out.println("You wondered all night and found nothing. You mistereasly vanashed near the old ruins. Please try again.");
        }
        else 
        {
        System.out.println("Please start over and select a valid number.");
        }
       }
       else if (ewn == 2)
       {
        System.out.println("You have guessed incorectly. There was no shelter near you and a wild tiger ate you. Game over:( Please try again");
       }
       else if (ewn == 3)
       {
        System.out.println("You have guessed incorectly. Your sword could not protecr you from a raging wild bore. Game over:( Please try again");
       }
       else 
       {
        System.out.println("Please start over and select a valid number.");
       }
    }
    else if (hi == 4)
    {
        System.out.println("You never wake up again. Please try again.");
    }
    else if (hi == 5)
    {
        System.out.println("Your stupidy has cost you your life. Please try again.");
        
    }
    else 
    {
        System.out.println("Please restart and enter a valid number.");
    }
    System.out.println("Do you want to play again?");
    System.out.println("Please select yes or no.");
    System.out.println("Your choice:    ");
    play = inputScanner.next();   
   } 
  }
}   
        
        
