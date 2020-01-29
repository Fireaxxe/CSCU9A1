
import java.util.Scanner;
/**
 *  The code below shows how a while loop can be used for this. 
 * 
 * @author Constantinos Constantinou 
 * @version 1.0
 */

public class InputLoop
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println ("Enter an integer");
        while (!scan.hasNextInt()) // while non-integers are present...
        {
            scan.next(); //...read and discard input, then prompt again
            System.out.println ("Bad input. Enter an integer");
        }
        int input = scan.nextInt();
        System.out.println ("You entered " + input + "!");
    }
} 