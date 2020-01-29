import java.util.Scanner;
/**
 *A program to print a string vertically
 * @author 
 * @version 11/11/16
 */
public class Task4 
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println ("Enter a word");
        String s = scan.next();
        
        for ( int strLength = 0; strLength < s.length(); strLength++)
        {
            System.out.println(s.charAt(strLength)); 
        }
    }
}