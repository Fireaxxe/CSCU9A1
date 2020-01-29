import java.util.Scanner;
/**
 * A program to check what state water is in a given condition 
 * @author  
 * @version 11/9/16
 */
public class WaterState
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        final int altitude = 300; //altitude that causes boiling point to drop by 1 for every 300 metres
        final int freeze = 0; // freezing point of water
        final int boiling = 100; //boiling point of water
        System.out.println("What is the temperature (degrees Celsius)?");
        int temp = scan.nextInt();
        System.out.println("What is the altitude (metres above sea)?");
        int alt = scan.nextInt();
        int difference, boiling2; //difference between altitude and critical altitude, decreasing boiling point by 1 for every 300 metres
     
        {
            if (alt > altitude)
            {
                difference = alt - altitude;
                boiling2 = boiling - difference;
                if (freeze < temp && temp < boiling2)
                {
                    System.out.println("Water is liquid.");
                }
                else if (freeze >= temp)
                {
                    System.out.println("Water is solid.");
                }
                else
                {
                    System.out.println("Water is vapor.");
                }
            }
            else
            {
                if (freeze < temp && temp < boiling)
                {
                    System.out.println("Water is liquid.");
                }
                else if (freeze >= temp)
                {
                    System.out.println("Water is solid.");
                }
                else
                {
                    System.out.println("Water is vapor.");
                }
            }
        }
    }
}
