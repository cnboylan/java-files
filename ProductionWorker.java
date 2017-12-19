import java.text.DecimalFormat;

/* Program: ProductionWorker Class
   Date:    11/26/17
   Author:  Caitlyn Boylan

	The ProductionWorker Class extends
   the Employee class and can also
   set and retrieve values of worker's
   shift type and hourly pay rate.

*/

public class ProductionWorker extends Employee
{
   private int shift;
   private double hourlyPay;
   
   /*
      Constructor   
   */
   
   public ProductionWorker(String n, String num, String hire)
   {
      super(n, num, hire);
   }
   
   /*
      setShift method
      @param sh The worker's shift.
   */
   
   public void setShift(int sh)
   {
      shift = sh;
   }
   
   /*
      setHourlyPay method
      @param pay The worker's pay rate.
   */
   
   public void setHourlyPay(double pay)
   {
      hourlyPay = pay;
   }
   
   /*
      getShift method
      @return The worker's shift.
   */
   
   public int getShift()
   {
      return shift;
   }
   
   /*
      getHourlyPay method
      @return The worker's pay rate.
   */
   
   public double getHourlyPay()
   {
      return hourlyPay;
   }
   
   /*
      toString method
      @return A reference to a String.
   */
   
   public String toString()
   {
      DecimalFormat dollar = new DecimalFormat("$#,##0.00");
      
      String str = super.toString()
               + "\nShift: " + shift
               + "\nHourly Pay: " + dollar.format(hourlyPay);
      return str;
   }
}