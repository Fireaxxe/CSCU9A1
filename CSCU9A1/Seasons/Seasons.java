import java.util.Scanner;
/**
 * A program to check what season it is given the date
 * @author 
 * @version 11/9/16
 */

public class Seasons
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter day and month (in dd mm format)");
        int day = scan.nextInt();
        int month = scan.nextInt();
        boolean validDate = true;
        int daysinmonth = 31;

        if (month < 1 || month > 12 || day < 1 || day > daysinmonth)
        {
            validDate = false;
        }
        else if ( month == 2 )
        {
            daysinmonth = 29;
        }
        else if (month == 4 || month == 6 || month == 9 || month == 11)
        {
            daysinmonth = 30;
        }
        if (validDate)
        {
            String season;
            if (month == 1 || month == 2 || month == 3)
            {
                season = "Winter";
            }
            else if (month == 4 || month == 5 || month == 6)
            { 
                season ="Spring";
            }
            else if ( month == 7 || month == 8 || month == 9)
            {
                season = "Summer";
            }
            else 
            {
                season = "Autumn";
            }
            if ( (month % 3 == 0) && (day > 21) )
            {
                if ( season.equals("Winter"))
                {
                    season = "Spring";
                }
                else if ( season.equals("Spring" ))
                {
                    season = "Summer";
                }
                else if (season.equals("Summer"))
                {
                    season = "Autumn";
                }
                else 
                {
                    season = "Winter";
                }
            } 
            System.out.println("The season is " + season );
        }    
        else
        {
            System.out.println("Invalid data. Try again.");
        }

    }
}
