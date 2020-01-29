import java.util.Scanner;
/**
 * A program that tells us how many integers are even 
 * @ 
 * @ 9/11/16
 */
public class Task1
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println ("Enter an integer to continue or a non-integer to finish.Then press return.");
        int sum = 0;
        int inputs = 0;
        int entry;
        int i= scan.nextInt();
        if((i % 2 == 0))
            while (scan.hasNextInt()) 
            {
                entry = scan.nextInt(); 
                inputs++;
                sum = sum + entry;
                System.out.println ("Enter an integer to continue or a non-integer to finish.Then press return."); 
            }
        System.out.println ("You entered " + inputs + " even integers."); 
    }
}
