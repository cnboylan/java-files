/* Program: RetailItem
   Date:    10/28/17
   Author:  Caitlyn Boylan

	The RetailItem class simulates an inventory system. 

*/

public class RetailItem
{
   private String description;
   private int unitsOnHand;
   private double price;
   
   /**
      Constructor
      @param desc The item's description.
      @param units The number of units on hand of the item.
      @param prc The item's individual retail price.
   */
   
   public RetailItem(String desc, int units, double prc)
   {
      description = desc;
      unitsOnHand = units;
      price = prc;
   }
   
   /**
      setDescription method
      @param desc The item's description.
   */
   
   public void setDescription(String desc)
   {
      description = desc;
   }
   
   /**
      setUnitsOnHand method
      @param units The item's number of units on hand.
   */
   
   public void setUnitsOnHand(int units)
   {
      unitsOnHand = units;
   }
   
   /**
      setPrice method
      @param prc The item's retail price.
   */
   
   public void setPrice(double prc)
   {
      price = prc;
   }
   
   /**
      getDescription method
      @return The item's description.
   */
   
   public String getDescription()
   {
      return description;
   }
   
   /**
      getUnitsOnHand method
      @return The item's number of units on hand.
   */
   
   public int getUnitsOnHand()
   {
      return unitsOnHand;
   }
   
   /**
      getPrice method
      @return The item's retail price.
   */
   
   public double getPrice()
   {
      return price;
   }
}