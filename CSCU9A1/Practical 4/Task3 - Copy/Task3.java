import java.util.Scanner;
/**
 * Write a description of class Task3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Task3 {
        public static void main(String[] args) { 
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the amount of milk in litres to show you how many jugs of 750ml you can completely fill."); 
        double milk = scan.nextDouble (); //litres of milk
        double jug = 0.75;//litres each
        double filledjug = milk / jug ;
        System.out.println("You can completely fill " + (int) filledjug + " jugs.");
        
        
        
    }
               
    
   
               
    
}
