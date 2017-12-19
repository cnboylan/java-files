import java.text.DecimalFormat;

/* Program: TeamLeader Class
   Date:    11/26/17
   Author:  Caitlyn Boylan

	The TeamLeader Class

*/

public class TeamLeader extends ProductionWorker
{
   private double monthlyBonus;
   private final int REQ_HOURS = 100;
   private int compHours;
   
   /*
      Constructor
   */
   
   public TeamLeader(String n, String num, String hire)
   {
      super(n, num, hire);
   }
   
   /*
      setMonthlyBonus method
      @param bonus The team leader's monthly bonus.
   */
   
   public void setMonthlyBonus(double bonus)
   {
      monthlyBonus = bonus;
   }
   
   /*
      setCompHours method
      @param hours The team leader's completed training hours.
   */
   
   public void setCompHours(int hours)
   {
      compHours = hours;
   }
   
   /*
      getMonthlyBonus method
      @return The team leader's monthly bonus.
   */
   
   public double getMonthlyBonus()
   {
      return monthlyBonus;
   }
   
   /*
      getCompHours method
      @return The team leader's completed training hours.
   */
   
   public double getCompHours()
   {
      return compHours;
   }
   
   /*
      getRemainingHours method
      @return The remaining training hours required.
   */
   
   public double getRemainingHours()
   {
      return REQ_HOURS - compHours;
   }
   
   /*
      toString method
      @return A reference to a String.
   */
   
   public String toString()
   {
      DecimalFormat dollar = new DecimalFormat("$###,##0.00");
      
      String str = super.toString()
               + "\nMonthly Bonus: " + dollar.format(monthlyBonus)
               + "\nTraining Hours: " + compHours
               + "\nRemaining Hours: " + getRemainingHours();
      return str;
   }
}