import java.util.Scanner;
/**
 * Write a description of class Task1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Task1
{

    /**
     * Constructor for objects of class Rectangle
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two integers for the length and width of a rectangle seperated by one or more spaces.");    
        int length = scan.nextInt () ;
        int width = scan.nextInt () ;
        System.out.println("The perimeter of the rectangle is " + (length*2 + (width*2)));             
        System.out.println("The area of the rectangle is " +length*width) ;
        double diagonalLength = Math.sqrt(Math.pow(length, 2)+ Math.pow(width, 2));        
        System.out.println("The diagonal legth of a rectangle is " + diagonalLength);
       
        
        
       
        
    }
        
    }

   
