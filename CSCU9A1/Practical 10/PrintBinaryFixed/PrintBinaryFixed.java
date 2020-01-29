import java.util.Scanner;
/**
 * This is a program that the user enter an integer and convert it to binary.
 * 
 * @author Constantinos Constantinou
 * @version 1.0
 */

public class PrintBinaryFixed
{
    public static void main (String[] args)
    {
        final int MIN = 0;
        final int MAX = (int) (Math.pow(2,30)-1);
        int[] digits = new int[30]; // array to hold the digits
        int number = readInput("Enter an integer from " + MIN + " to " + MAX, MIN, MAX);
        // Your code goes here. This code must do the following:
        // Declare a "companion" variable to count how many digits stored
        // Initialize that variable appropriately 
        // While number > 0
        int arrayCounter = 0;
        int i = number;
        while (i > 0) 
        {
            digits[arrayCounter] =  i % 2;
            i = i / 2;
            arrayCounter++;
        }
        listBackwardsFrom(digits,arrayCounter);
    }
    //Store the remainder (number % 2) in the array
    //Update the companion variable
    //Set number to be number / 2
    //Display the filled portion of the array in reverse order
    /**
     * Print the contents of an array backwards, starting from index last 
     * @param array: an array of integers
     * @param last: the index of the starting location
     */
    public static void listBackwardsFrom (int[] array, int last) 
    {
        for (int i = last; i >= 0; i--)
        {
            System.out.print(array[i]);
        }
        return;  
    }

    /**
     * Read in an integer between two given bounds
     * @param prompt: the prompt to show the user
     * @param min: the smallest acceptable input value 
     * @param max: the largest acceptable input value 
     */
    public static int readInput(String prompt, int min, int max) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println (prompt);
        boolean invalid  = true;
        int input = 0;
        while ( invalid == true)
        {
            if ( scan.hasNextInt() ) 
            {
                input = scan.nextInt();
                if ( input >= min && input <= max )
                {
                    return input;
                }
            }
            else
            {
                scan.next();
            }
            System.out.println("Bad input.Enter an integer from " + min + " to " + max); 
        }
        return input;
    }

    /**
     * Read in a positive integer and return its value 
     * @param the prompt to be shown to the user
     */
    public static int readInteger(String prompt) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println (prompt);
        boolean invalid  = true;
        final int MIN = 0;
        final int MAX = (int) (Math.pow(2,30)-1);
        int input = readInput("Enter an integer from " + MIN + " to " + MAX , MIN ,MAX);
        while ( invalid == true)
        {
            if ( scan.hasNextInt() ) 
            {
                input = scan.nextInt();
                if ( input > 0 )
                {
                    invalid = false;
                    return input;
                }
            }
            else
            {
                scan.next();
            }
            System.out.println ("Bad input. Enter a positive integer"); 
        }
        return input;
    } 
}