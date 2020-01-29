import java.util.Scanner;
/**
 * Program to find the larger of two integers
 * @author Your Name
 * @version Today's Date
 */
public class LargerdDouble
{
 public static void main(String[] args)
 {
 Scanner scan = new Scanner(System.in);
 System.out.println
 ("Enter two decimal numbers separated by one or more spaces");
 double a = scan.nextDouble ();
 double b = scan.nextDouble ();
 
 System.out.println
 ("The larger decimal is " + Math.max(a, b));
 }
} 