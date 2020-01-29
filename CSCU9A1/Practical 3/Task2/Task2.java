
/**
 * Write a description of class Task2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Task2
{
    public static void main(String[] args) {
        String s = "Humpty Dumpty sat on a wall and had a great fall.";
        System.out.println("String s is " + "\"" + s + "\"");
        int length = s.length();
        System.out.println(length);
        System.out.println(s.substring(s.length()/2,s.length()) + s.substring(s.length()/2));
    }
        
}
