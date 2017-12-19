import javax.swing.JOptionPane;

/* Program: Charge Account Validation
   Date:    11/10/17
   Author:  Caitlyn Boylan

	The ValidatAcct class determines if a
   user's account number is valid/invalid.

*/

public class ValidateAcct
{
   public static void main(String[] args)
   {
      String input;
      int userAcct;
      int[] validNums = { 5658845, 4520125, 7895122,
                          8777541, 8451277, 1302850,
                          8080152, 4562555, 5552012,
                          5050552, 7825877, 1250255,
                          1005231, 6545231, 3852085,
                          7576651, 7881200, 4581002 };
      
      boolean result;
      
      input = JOptionPane.showInputDialog("Enter charge "
                                    + "account number: ");
      
      userAcct = Integer.parseInt(input);
      
      result = sequentialSearch(validNums, userAcct);
      
      if (result == false)
      {
         JOptionPane.showMessageDialog(null, "Invalid account!!");
      }
      else
      {
         JOptionPane.showMessageDialog(null, "Valid account :)");
      }
   }
   
   /**
      sequentialSearch method
      @param array The array searched in.
      @param value The value searched for.
      @return True if value found, false if not.
   */
   
   public static boolean sequentialSearch(int[] array, int value)
   {
      int index = 0;
      boolean found = false;
      
      while (!found && index < array.length)
      {
         if (array[index] == value)
         {
            found = true;
         }
         
         index++;
         
      }
      return found;
      
   }
      
      
      
}