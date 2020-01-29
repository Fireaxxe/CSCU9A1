
/**
 * This is a program that generate 9 random values from 0-100 and prints out the sum and product of them and also the minimum value and the possition of the minimun value.
 * 
 * @author Constantinos Constantinou
 * @version 1.0
 */
public class ArrayBasics
{
    public static void main(String[] args)
    {
        int [] myArray = randomArray(9,0,100);
        list(myArray);
        listBackwards(myArray);
        System.out.println("The sum of the first 9 values is: " + sum(myArray));
        System.out.println("The product of the first 9 values is: " + product(myArray));
        System.out.println("The minumum value is: " + minimum(myArray));
        System.out.println("The possition of the minimun value is: " + find(myArray));
    } 

    /*
     * list the indices and values held in the given array
     * @param array: an array of integers
     */
    public static void list (int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.println("index: " + i + " value " + array[i]);

        }
        return;
    }

    /*
     * list the indices and values in an array in reverse order
     * @param array: an array of integers
     */
    public static void listBackwards (int[] array)
    {
        for (int i = 8; i >= 0; i--)
        {
            System.out.println("index: " + i + " value " + array[i]);
        }
        return;
    }

    /*
     * Find the sum of all the values held in an integer array
     * @param array: an array of integers
     */
    public static int sum (int[] array)
    {
        int total = 0;
        for (int element : array)
        {
            total = total + element;
        }
        return total;
    }

    /*
     * return an array of a given length filled
     * with random integers between given bounds
     *
     * @param length: the length of the result
     * @param min: minimum bound for the array elements
     * @param max: maximum bound for the array elements
     */
    public static int[] randomArray (int length, int min, int max) 
    {
        int[] array = new int[length];
        for (int i = 0; i < length; i++)
        {
            array[i] = (int)(Math.random()*(max - min + 1) + min);
        }
        return array;
    }

    /*
     * Find the product of all the values held in an integer array
     * @param array: an array of integers
     */
    public static long product (int[] array)
    {
        long product = 1;
        for (int i = 0; i < array.length; i++)
        {
            product = product * array[i]; 
        }
        return product;
    }

    /*
     * Find the minimum value in an array of integers
     * @param array: an array of integers
     */
    public static int minimum (int[] array)
    {
        int min = array[0];
        for (int i =1; i < array.length; i++)
        {
            if ( min > array[i])
            {
                min = array[i];
            }
        }
        return min;
    }

    /*
     * Search for a given value in an array of integers
     * @param array: an array of integers
     * @param target: the value to search for
     */
    public static int find (int[] array)
    {
        int index = 0;
        int min = array[index];
        for (int i=1; i<array.length; i++){

            if (array[i] < min ){
                min = array[i];
                index = i;
            }

        }
        return index ;
    }
}