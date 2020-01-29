import java.util.Scanner;
/**
 * This is a program that the user can enter as many integers
 * and when the user enter anything non integer then the program 
 * stops and it counts how many entries the user did and what is
 * the sum of those integers.
 * 
 * @author Constantinos Constantinou     
 * @version 1.0
 */
public class  InputSequence
{
    public static void main(String[] args) {
        int sum = 0; 
        int Input = 0;
        int count = 0;        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer to continue or a non-integer value to finish. Then press return.");
        while(scan.hasNextInt())
        {
            count++; //this is the counter of the entries
            System.out.println("Enter an integer to continue or a non-integer value to finish. Then press return.");
            Input = scan.nextInt(); //user can enter an integer
            sum+= Input; 
            {
                if (scan.hasNextInt()) //if this is not an integer then it will print the "else" part 
                {}
                else
                    System.out.println(" You entered " + count + " integers. The sum of your entries is "+ sum);
            }
        }
    }
}
