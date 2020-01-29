import java.util.Scanner;
/**
 * Write a description of class Task2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Task2
{
    public static void main(String[] args) {
        Scanner letterscan = new Scanner(System.in);
        System.out.println("I can count any letter, spaces and symbols! Write anything you want!");
        String s = letterscan.nextLine();
        int length = s.length();
        System.out.println("You used " + length + " characters and spaces!");
       
    }
        
}
