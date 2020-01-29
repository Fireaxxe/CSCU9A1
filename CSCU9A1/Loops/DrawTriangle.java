import java.util.Scanner;
/**
 * A program that draws a triangle made out of the letter x
 * @ 
 * @ 11/11/16
 */

public class DrawTriangle
{
    public static void main(String[] args)
    {
        while (true)
        {
            Scanner scan = new Scanner(System.in);
            System.out.println ("Do you want to see a triangle?");
            if (scan.hasNext("y"))
           {
            final int a = 1;
            final int b = 20;
            
            int height = (int) (Math.random() * (b - a + 1) + a);

            int numberOfXs =1;
            for (int rows = 1; rows <= height ; rows++)
            {
                for (int i = (height-rows); i > 0; i--)
                {
                    System.out.print(" ");
                }
                for (int z =1; z <= numberOfXs; z++)
                {
                    System.out.print("X");
                
                }
                numberOfXs = numberOfXs + 2;
                
                System.out.print("\n");
                
            }
    
           }
           else 
           {
               break;
           }
        
        }
    }
}