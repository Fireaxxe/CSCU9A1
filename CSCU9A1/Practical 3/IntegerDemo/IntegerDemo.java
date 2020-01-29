/**
* Program to practice using integer variables
* @author Constantinos
* @version 29/09/2016
*/
public class IntegerDemo
{
 public static void main(String[] args)
 {
 int a; // declaration of an integer variable
 int b = 23; // declaration with assignment of initial value
 int c, d, e; // three integer variables declared together
 b = b + 30; // assignment statement
 
 
 
 /****** Add your code after this line ********/
 a = 10;
 c = 65;
 d = a + b;
 e = 32;
 int F = 12; // an integer constant
 System.out.println ("a is " + a) ;
 System.out.println ("b is " + b) ;
 System.out.println ("c is " + c) ;
 System.out.println ("d is " + d) ;
 
 a = 15;
 System.out.println ("d is " + d) ;
 e = a + F;
 F = a + e;
 System.out.println ("e is " + e) ;
 System.out.println ("F is " + F) ;
 }
} 