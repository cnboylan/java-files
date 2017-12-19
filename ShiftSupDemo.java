import javax.swing.JOptionPane;

/* Program: ShiftSup Demo
   Date:    11/26/17
   Author:  Caitlyn Boylan

	The ShiftSupDemo class demonstrates
   the capabilities of the Employee and
   Shift Supervisor classes.

*/

public class ShiftSupDemo
{
   public static void main(String[] args)
   {
      String name = JOptionPane.showInputDialog("Please enter "
                  + "the supervisor's name:");
      String num = JOptionPane.showInputDialog("Please enter "
                  + "the supervisor's employee number:");      
      String hire = JOptionPane.showInputDialog("Please enter "
                  + "the supervisor's hire date:");
      
      ShiftSupervisor supervisor = new ShiftSupervisor(name, num, hire);
      
      String input = JOptionPane.showInputDialog("Please set "
                  + "the supervisor's annual salary:");
      double salary = Integer.parseInt(input);
      supervisor.setSalary(salary);
      
      input = JOptionPane.showInputDialog("Please set the "
                  + "supervisor's annual bonus:");
      double bonus = Double.parseDouble(input);
      supervisor.setBonus(bonus);
      
      JOptionPane.showMessageDialog(null, supervisor);
      
      System.exit(0);
   }
}