/*
 * This is a tutorial to learn about Chapters 1 through 3
 */

package chapter1to3tutorial;
//Provides the collections framework, formatted printing and scanning, array manipulation utilities, event model, date and time facilities, internationalization, and miscellaneous utility classes.
import java.util.Scanner;

/**
 *
 * @author karim.waljee
 */
public class Chapter1To3Tutorial {
    
    public static void main(String[] args) { //This  is the starting point!
        
        double price; //variable to store the item $cost
        int option=0; //variable to store customer selection
        //This line calls the library to store an object of input from user
        Scanner input = new Scanner(System.in);
        //This string is for prompting the user to enter another item
        String more = "";
        
           
        //Displays menu to the user0
        System.out.println("*********************************");
        System.out.println("** THE AWESOME RESTAURANT MENU **");
        System.out.println("*********************************");
        System.out.println("Your food options:");
        System.out.println("1. Pizza Slice - $1.00");
        System.out.println("2. Sushi (Dyanamite) - $5.00");
        System.out.println("3. Kabobs (2 per plate) - $3.00");
            
     do{ 
            System.out.print("Please enter your option: ");
            option = input.nextInt(); //Assigns input from user to option variable   
            
            switch (option) {
                case 1:
                    System.out.println("You ordered a pizza");
                    System.out.println("Would you like to order more? y or n");    
                    more = input.next();
                    
                    if (more.equals("y") || more == "Y"){
                        
                        System.out.println("Sorry no you can't");
                    }
                    else if (more == "n" || more == "N"){
                        System.out.println("Thanks for you money");
                        
                    }
                    else{
                        System.out.println("This is a MORE: " + more);
                        System.out.println("Sorry incorrect choice");
                      
                    }
                    break;
                case 2:
                    System.out.println("You ordered some sushi");
                    break;
                case 3:
                    System.out.println("You ordered some kabobs");
                    break;
                default:
                    System.out.println("Sorry incorrect option");
                } 
       }   while (option < 1 || option > 3 );            
    }   
}
