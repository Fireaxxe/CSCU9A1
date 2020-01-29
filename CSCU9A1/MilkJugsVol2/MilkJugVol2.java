import java.util.Scanner;
/**

 *This program calculates how many jugs will hold n litres of milk.

 * 

 * @author 

 * @version 20/10/16

 */

public class MilkJugVol2

{

    public static void main (String[] args)

    {
        Scanner scan = new Scanner(System.in);
        System.out.println ("Enter the amount of milk ");
        double a = scan.nextDouble();
        System.out.println ("Enter how many jugs are available ");
        double b = scan.nextDouble();
        int result = (int) (a / b);
        System.out.println ("This will fill "+ result);
       

    }

}
