import java.text.DecimalFormat;

/* Program: ShiftSupervisor Class
   Date:    11/26/17
   Author:  Caitlyn Boylan

	The ShiftSupervisor class extends
   the Employee class and can also
   set and retrieve values of supervisor's
   annual salary and annual bonus.

*/

public class ShiftSupervisor extends Employee
{
   private double annSalary;
   private double annBonus;
   
   /*
      Constructor   
   */
   
   public ShiftSupervisor(String n, String num, String hire)
   {
      super(n, num, hire);
   }
   
   /*
      setSalary method
      @param salary The supervisor's salary.
   */
   
   public void setSalary(double salary)
   {
      annSalary = salary;
   }
   
   /*
      setBonus method
      @param bonus The supervisor's yearly bonus.
   */
   
   public void setBonus(double bonus)
   {
      annBonus = bonus;
   }
   
   /*
      getSalary method
      @return The supervisor's salary.
   */
   
   public double getSalary()
   {
      return annSalary;
   }
   
   /*
      getBonus method
      @return The supervisor's bonus.
   */
   
   public double getBonus()
   {
      return annBonus;
   }
   
   /*
      toString method
      @return A reference to a String.
   */
   
   public String toString()
   {
      DecimalFormat dollar = new DecimalFormat("$###,###,##0.00");
      
      String str = super.toString()
               + "\nSalary: " + dollar.format(annSalary)
               + "\nBonus: " + dollar.format(annBonus);
      return str;
   }
}