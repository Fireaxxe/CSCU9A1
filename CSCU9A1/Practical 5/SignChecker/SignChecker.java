import java.util.Scanner;
/**
 * A program to check the sign of an integer
 * @author Constantinos Constantinou
 * @version Today's Date
 */
public class SignChecker
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println ("Enter an integer");
        if (scan.hasNextInt()) // if the input is integer then it continues to if (input == 0)
        {
            int input = scan.nextInt();
            if (input == 0) //if the input is equal zero then it prints the below
            {
                System.out.println ("This number is zero.");
            }
            else //else the input is not zero then it continues to if (input > 0)
            {
                if (input > 0) // if the input is positive it prints the below
                {
                    System.out.println ("This number is positive.");
                }
                else // else if the input is not positive it prints the below
                {
                    System.out.println ("This number is not positive.");
                }
            }
        }
        else // else the input is not an integer it prints the below
        {
            System.out.println("Not an integer.");
        }
    }
}
