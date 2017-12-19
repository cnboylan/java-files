/* Program: RetailItemTest
   Date:    10/28/17
   Author:  Caitlyn Boylan

	This program displays the Retail Item class. 

*/

public class RetailItemTest
{
   public static void main(String[] args)
   {
      RetailItem item1 = new RetailItem("Jacket", 12, 59.95);
      RetailItem item2 = new RetailItem("Designer Jeans", 40, 34.95);
      RetailItem item3 = new RetailItem("Shirt", 20, 24.95);
      
      System.out.println(item1.getDescription() + " "
         + item1.getUnitsOnHand() + " " + item1.getPrice());
      System.out.println(item2.getDescription() + " "
         + item2.getUnitsOnHand() + " " + item2.getPrice());
      System.out.println(item3.getDescription() + " "
         + item3.getUnitsOnHand() + " " + item3.getPrice());
   }
}