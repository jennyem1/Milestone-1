/*
 * Module 1 Milestone: Divider Class
 * Jennifer Scott
 * This class takes two numbers from a user and divides them, displaying a remainder.
 */
package scottj56;

        
public class Divider {
    
    int num1;
    int num2; 
    
    Divider(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public int quotient(){
        int q = num1/num2;
        return q;
    }//end quotient method
    
    public int remainder() {
        int r = num1%num2;
        return r;
    }//end remainder method
    
    
    
    
}//end class Divider
