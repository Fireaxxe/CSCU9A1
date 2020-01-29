import java.util.Scanner;
/**
 *A program that reads a positive integer and prints all of its binary digits
 * @author 
 * @version 11/11/16
 */

public class PrintBinaryDigits
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println ("Enter an integer");
        int i = scan.nextInt();
        
       while (i > 0) 
        {
           System.out.print( i % 2);
           i = i / 2;
        }
       
    }

    /*
     * list the indices and values in an array in reverse order
     * @param array: an array of integers
     */
    public static void listBackwards (int[] array)
    {
        for (int i = 8; i >= 0; i--)
        {
            System.out.print(array[i]);
        }
        return;
    }

}