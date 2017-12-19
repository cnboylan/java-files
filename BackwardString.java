import java.util.Scanner;

/* Program: Backward String
   Date:    11/21/17
   Author:  Caitlyn Boylan

	The Backward String class
   inverts user entered strings.

*/

public class BackwardString
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
   
      System.out.println("Please enter a word or phrase: ");
      String entry = keyboard.nextLine();
      System.out.println("Your entry backwards is: ");
      invert(entry);
   }
   
   /**
      invert method
      @param str
   */
   
   public static void invert(String str)
   {
      char[] array = str.toCharArray();
   
      for (int i = (array.length - 1); i >= 0; i--)
         System.out.print(array[i]);
   }
}