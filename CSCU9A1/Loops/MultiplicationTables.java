/**
 * A program  which outputs multiplication tables up to 10 times 9
 * @ 
 * @ 11/11/16
 */

public class MultiplicationTables
{
    public static void main(String[] args)
    {
        for (int i = 1; i <= 10 ; i++)
        {
            for (int j = 1; j <= 9; j++)
            {
                System.out.println(i + " " + j + " = " + (i*j));
            }
        }
    }
}