
package labexer5a;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LabExer5A {

    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
        
        int num;
        int GuessNum = 9;
        int LimitNum = 50;
        boolean infinite = true;
    
        for(int i = 1; infinite; i++ ){
            
            try{
                
                 System.out.print("Guess a number from 1 to 50!: ");
                 num = input.nextInt();
                 
                 if(num == GuessNum){
                     
                      System.out.println("You got it in " + i + " attempts");
                      break;
                     
                 }
                 
                 else if(num < GuessNum){
                     
                     System.out.println("too low, try again");
                     
                 }
                 
                 else if(num > GuessNum && num <= LimitNum){
                     
                     
                      System.out.println("too high, try again");
                     
                 }
                 
                 else if(num > LimitNum){
                     
                     i--;
                 
                     throw new ArithmeticException();
                  
                 }
               
                 else{
                     
                     throw new InputMismatchException();
                    
                 }
            
            }
            
            catch(ArithmeticException ex){
                
                System.out.println("Out of range");
                
                 }
            
            catch(InputMismatchException ex){
                
                System.out.println("You entered a non-numeric number, Game over.");
                break;
               
                }
      
        }
      
    }
}