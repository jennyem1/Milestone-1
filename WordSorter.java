/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scottj56;

import java.io.PrintStream;
import java.util.Scanner;

public class WordSorter {
    Scanner stdIn = new Scanner(System.in);
    String[] wordList = new String[100];//word array
    int filledElements = 0; //number of words
    public String word;//user-entered word
    
    
    public void add() {
        System.out.println("Please enter a word: ");
        word = stdIn.next();
        
        if (!word.equalsIgnoreCase ("n") && filledElements < wordList.length) {
            if (word.length() <1) {
                System.out.println("Invalid entry");
               }//end if condition for invalid entry
            else {
                wordList[filledElements] = word;
                filledElements++;
            }//end else statement that updates the number of filled elements
            
        }//end while loop
    }//end add method
    
    public void sort() {
        System.out.println("\nWord List:");
        for (int i=0; i<filledElements; i++) {
            System.out.println((i+1) + wordList[i]);
        }//end for loop to print out word list
    }//end class sort
}//end class WordSorter
