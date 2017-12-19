import javax.swing.JOptionPane;

/* Program: HotelOccupancy
   Date:    10/12/17
   Author:  Caitlyn Boylan
   
   Determines occupancy of hotel from relevant user input.
   
*/

// This is my thirteenth Java program.

public class HotelOccupancy
{
   public static void main(String[] args)
   {
      String input;
      int floors, frooms, orooms;
      double vrooms, occupancy;
      
      do
      {
         input = JOptionPane.showInputDialog("Please enter the " +
                                  "number of floors in the hotel:");
         floors = Integer.parseInt(input);
      } while (floors < 1);
      
      double trooms = 0;
      double torooms = 0;
      
      for (int floor = 1; floor <= floors; floor++)
      {
         do
         {
            input = JOptionPane.showInputDialog("Please enter the " +
                         "number of rooms on floor " + floor + ":");
            frooms = Integer.parseInt(input);
         } while (frooms < 10);
         trooms += frooms;
         input = JOptionPane.showInputDialog("Please enter the " +
                "number of occupied rooms on floor " + floor + ":");
         orooms = Integer.parseInt(input);
         torooms += orooms;
      }

      vrooms = trooms - torooms;
      occupancy = torooms / trooms;

      JOptionPane.showMessageDialog(null, "There are " + trooms
                                     + " total rooms in the hotel.");
      JOptionPane.showMessageDialog(null, "There are " + torooms
                                  + " occupied rooms in the hotel.");
      JOptionPane.showMessageDialog(null, "There are " + vrooms
                                    + " vacant rooms in the hotel.");
      JOptionPane.showMessageDialog(null, "The occupancy rate of" +
                                       " the hotel is " + occupancy); 
      
      System.exit(0);
   }
}