import javax.swing.JOptionPane;

/* Program: Alphabetic Telephone Number Translator
   Date:    11/21/17
   Author:  Caitlyn Boylan

	The NumberTranslator class translates
   an alphanumeric telephone number to
   its numeric equivalent.
*/

public class NumberTranslator
{
   public static void main(String[] args)
   {
      String numEntry = JOptionPane.showInputDialog("Please enter "
            + "an alphanumeric\nphone number (XXX-XXX-XXXX):\n");
      String alphaPhone = numEntry.toUpperCase();
      StringBuilder str = new StringBuilder(alphaPhone.length());
      
      for (int i = 0; i < alphaPhone.length(); i++)
      {
         char c = alphaPhone.charAt(i);
         if (Character.isDigit(c))
            str.append(c);
         
         else if (Character.isLetter(c))
         {
            if (c >= 'A' && c<= 'C')
               str.append("2");
            else if (c >= 'D' && c<= 'F')
               str.append("3");
            else if (c >= 'G' && c<= 'I')
               str.append("4");
            else if (c >= 'J' && c<= 'L')
               str.append("5");
            else if (c >= 'M' && c<= 'O')
               str.append("6");
            else if (c >= 'P' && c<= 'S')
               str.append("7");
            else if (c >= 'T' && c<= 'V')
               str.append("8");
            else if (c >= 'W' && c<= 'Z')
               str.append("9");
         }
         
         else if (!Character.isLetterOrDigit(c))
            str.append(c);
      }
      
      JOptionPane.showMessageDialog(null, "The translated phone "
                                                + "number is:\n" + str);      
   }
}