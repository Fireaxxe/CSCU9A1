/**
 * This is a program contained a method called "area". 
 *
 * @author Constantinos Constantinou
 * @version 1.0
 */
public class Rectangle
{
    public static void main (String[] args)
    {
        int length = 11;  //length of rectangle
        int width = 22; //width of rectangle
        int area = length * width; //area of renctangle
        int perimeter = (length * 2) + (width * 2); //perimeter of rectangle

        printRectangleDetails(length, width, area, perimeter);                    
    }
    /**
     * Returns the area of a rectangle
     * @param width the width of the rectangle
     * @param length the length of the rectangle
     */
    public static int area (int length, int width)
    {
        return length * width;
    }
    /**
     * Returns the perimeter of a rectangle
     * @param width the width of the rectangle
     * @param length the length of the rectangle
     */
    public static int perimeter (int length, int width)
    {
        return (length * 2) + (width * 2);
    }
    /**
     * Returns rectangle details.
     * @param width the width of the rectangle
     * @param length the length of the rectangle
     * @param area the area of the rectangle
     * @param perimeter the perimeter of the rectangle
     */
    public static void printRectangleDetails (int length, int width, int area, int perimeter)
    {
        System.out.println("Length = " + length);
        System.out.println("Width = " + width);
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }
}
