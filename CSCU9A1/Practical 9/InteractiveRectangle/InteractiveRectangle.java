import java.util.Scanner;
/**
 * A program to return the lenght, width and area of a rectangle after a user inputs his preferred values
 * 
 * @author  Constantinos Constantinou
 * @version 1.0
 */
public class InteractiveRectangle
{
    public static void main(String[] args)
    {
        boolean condition = false;
        do 
        {
            int length = readPositiveInteger("Enter length");
            int width = readPositiveInteger("Enter width"); 
            printRectangleDetails(length,width); // void method call used as statement
        }
        while ( keepGoing(condition));
        System.out.println("Goodbye!");
    }

    /**
     * Returns the area of a rectangle
     * @param lenght the length of the rectangle
     * @param width the width of the rectangle
     */
    public static int area (int length, int width)
    {
        return length * width;
    }

    /**
     * Returns the perimeter of a rectangle
     * @param length the length of the rectangle
     * @param width the width of the rectangle
     */
    public static int perimeter (int length, int width)
    {
        return 2*length + 2*width;
    }

    public static void printRectangleDetails(int width, int length)
    {
        System.out.println("The height of the rectangle is " + length);
        System.out.println("The width of the rectangle is " + width);
        System.out.println("The area of the rectangle is : " + area(length,width));
        System.out.println("The perimeter of the rectangle is : " + perimeter(length,width));
    }

    /**
     * Read in an integer and return its value
     * @param the prompt to be shown to the user
     */
    public static int readInteger(String prompt)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println (prompt);
        while ( !scan.hasNextInt() )
        {
            System.out.println("Please enter a positive integer");
            scan.next();
        }  
        int input = scan.nextInt();
        return input;
    }

    /**
     * Read in an integer greater than 0 and return its value
     * @ param the prompt to be shown to the user
     */
    public static int readPositiveInteger(String prompt)
    {
        while (true) 
        {
            int input = readInteger(prompt);
            if (input>0)
                return input;
            else
                System.out.println("Please enter a positive integer");
        }
    }

    /**
     * Ask the user whether or not to continue by typing "true" for yes or "false" for no,
     * and returns the result as a boolean
     */
    public static boolean keepGoing(boolean condition)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Would you like to process another rectangle (y/n)?");
        do{        
            String query=scan.next();
            if ( query.equals("y"))
            {
                return true;
            }
            else if ( query.equals("n"))
            {
                return false;
            }
            System.out.println("Please enter y/n");
        } while(true);
    }
}