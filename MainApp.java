/*
 * Module 1 Milestone
 * Jennifer Scott   scottj56
 * 
 * This is the main method for the Module 1 Milestone app.
*/
package scottj56;

import java.util.Scanner;
        
public class MainApp {

    
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        String name;
        int num1;
        int num2;
        String response;
        
        HelloWorld hw = new HelloWorld();
        
        
        while (true) {   
            //while statement will continute to display the menu until the 
            //user selects option 5
            System.out.println("Please choose an option from the following menu:");
            //print the menu options
            System.out.println("(1) Hello, World!");
            System.out.println("(2) Integer Divider");
            System.out.println("(3) Word Sorter");
            System.out.println("(4) Hello, Files!");
            System.out.println("(5) Exit");
            
            int choice = stdIn.nextInt(); //get the user's menu choice
            
            switch (choice) {
                case 1:            
                    System.out.println("Enter your name: "); //get user's name
                    name = stdIn.next();
                    hw.setName(name);
                    System.out.println("Hello "+ hw.getName() + "!"); //print greeting using user's name
                    break;
            
                case 2:
                    //Get user input for the two numbers to be divided
                    System.out.println("Divide any two whole numbers.");
                    System.out.println("Please enter your first whole number: ");
                    num1 = stdIn.nextInt();
                                
                    System.out.println("Please enter your second whole number: ");
                    num2 = stdIn.nextInt();
                
                    //calling the Divider class methods
                    Divider ans = new Divider(num1, num2);//create a new divider object
                    int quot = ans.quotient();//quotient variable 
                    int rem = ans.remainder();//remainder variable
                
                    System.out.println("The answer is: " + quot + " " + "remainder"
                    + rem);
                               
                    break;
            
                case 3:
                    WordSorter w = new WordSorter();
                    do {
                        System.out.println("Enter a word: ");
                        w.add(); 
                        System.out.println("Would you like to enter another word? "
                           + "(y/n)");
                        response = stdIn.next();
                        } while (response.equalsIgnoreCase("y")); 
                
                    
                        System.out.println("Here is your sorted list: ");
                        w.sort();
                    
                
                    break;
            
                case 4:
                    System.out.println("This choice is unavailable at the moment.");
                    
                    break;
                
                case 5:
                System.out.println("Goodbye.");
                System.exit(0);
                
                break;
            
        }//end switch
            
      }//end while statement
        
    }//end main method
    
}//end public class MainApp
