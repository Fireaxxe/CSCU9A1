import java.util.Scanner;
/**
 * Write a description of class StringComparer here.
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StringComparer
{
    public static void StringComparer(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println ("Enter two words separated by a space");
        String word1 = scan.next();
        String word2 = scan.next();
        if (word1.equals(word2))
        {
            System.out.println(word1 = word2);
        }
        else  
        {
            if(word1.compareTo(word2) < 0)
            {
                System.out.println(word1 + " "+ word2);
            }
            else
            {
                System.out.println(word2 + " "+ word1);
            }
        }
    }
}

        
 
  