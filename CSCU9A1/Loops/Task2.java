import java.util.Scanner;
/**
 * A program that tells us which strings begin with "Stir"
 * @ 
 * @ 11/11/16
 */

public class Task2
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println ("Write a word to continue or q to finish.Then press return.");
        int i = 0;
        boolean condition = true;
        String s;
        
        while (condition == true)
        {
            s = scan.nextLine(); //...read and discard input, then prompt again
            
            
            if (s != "q" && (s.length() >= 4)) // checks if the word has 4 or more characters so that the program doesnt crash
            {
                if (s.substring(0,4).equals("Stir"))
                {

                    i++;

                }
              System.out.println ("Write a word to continue or q to finish.Then press return.");
            }
            else
            {
                condition = false;
            }
        }

        
        
        System.out.println("You entered " + i + " words that contained the substring 'Stir' "); 
    }
}

