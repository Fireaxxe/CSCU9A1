import java.util.Scanner;

/**
 * A program that tells us how many integers are entered and their total sum
 * @ 
 * @ 9/11/16
 */
public class InputSequence
{
    public static void main (String[] args)

    {
        Scanner scan = new Scanner(System.in);
        System.out.println ("Enter an integer to continue or a non-integer to finish.Then press return.");
        int sum = 0;
        int inputs = 0;
        int entry;
        while (scan.hasNextInt()) 
        {
            entry = scan.nextInt(); 
            inputs++;
            sum = sum + entry;
            System.out.println ("Enter an integer to continue or a non-integer to finish.Then press return."); 
        }
        System.out.println ("You entered " + inputs + " integers. The sum of your entries is " + sum); 
    }

}
