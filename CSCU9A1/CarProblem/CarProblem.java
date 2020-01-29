import java.util.Scanner;
/**
 * Program to help a person calculate the total cost over 5 years of owning a car.
 * 
 * @author 
 * @version 
 */
//Testing values
//car = 40000
//resale = 7000
//miles = 12000
//petrol = 1.1
//efficiency = 15 miles per litre
public class CarProblem
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println ("Enter the original price of the car ");
        int car = scan.nextInt();
        System.out.println ("Enter the depreciated price of the car after 5 years");
        int resale = scan.nextInt();
        System.out.println("Enter the estimated driven miles per year");
        double miles = scan.nextDouble();
        System.out.println("Enter the estimated price of petrol per litre");
        double petrol = scan.nextDouble();
        System.out.println("Enter the fuel efficiency of the car in miles per litre");
        double efficiency = scan.nextDouble();

        double gas = (petrol * miles) * 5 ;//over the five years

        int depreciation = car - resale;// original price plus the resale value
        double milestolitres = (15/1.1) * 12000;

        double total = gas + depreciation + milestolitres;

        System.out.println("The total amount of owning this car will be " + total );

    }
}

