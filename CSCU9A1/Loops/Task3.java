import java.util.Scanner;
/**
 *A program to find the minimum of a set of inputs
 * @author
 * @version 11/11/16
 */


public class Task3

{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println ("Enter an integer to continue or a non integer to finish.Then press return.");
        int i = 0;
        boolean first = true;
        int enter = 0;
        int min;
        
        min = scan.nextInt();
        while (first == true)
        {
            System.out.println ("Enter an integer to continue or a non integer to finish.Then press return.");
            enter = scan.nextInt(); //...read and discard input, then prompt again
            if (!scan.hasNextInt())
            {
                first = false;
                System.out.println ("The minimum value you entered was " + min );
                return;
            }
            if (enter <= min)
            {

                min = enter;
               // System.out.println ("Enter an integer to continue or a non integer to finish.Then press return.");
            }
            
            
        }      
    }  
}