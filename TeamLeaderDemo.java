import javax.swing.JOptionPane;

/* Program: TeamLeader Demo
   Date:    11/27/17
   Author:  Caitlyn Boylan

	The TeamLeaderDemo class demonstrates
   the capabilities of the Employee,
   ProductionWorker, and TeamLeader classes.

*/

public class TeamLeaderDemo
{
   public static void main(String[] args)
   {
      String name = JOptionPane.showInputDialog("Please enter "
                  + "the team leader's name:");
      String num = JOptionPane.showInputDialog("Please enter "
                  + "the team leader's employee number:");      
      String hire = JOptionPane.showInputDialog("Please enter "
                  + "the team leader's hire date:");
      
      TeamLeader tLeader = new TeamLeader(name, num, hire);
      
      String input = JOptionPane.showInputDialog("Please set "
                  + "the team leader's shift (Day=1,Night=2):");
      int shift = Integer.parseInt(input);
      tLeader.setShift(shift);
      
      input = JOptionPane.showInputDialog("Please set the "
                  + "team leader's hourly pay rate:");
      double hourlyPay = Double.parseDouble(input);
      tLeader.setHourlyPay(hourlyPay);
      
      input = JOptionPane.showInputDialog("Please set the "
                  + "team leader's monthly bonus:");
      double monthlyBonus = Double.parseDouble(input);
      tLeader.setMonthlyBonus(monthlyBonus);
      
      input = JOptionPane.showInputDialog("Please set the "
                  + "team leader's completed training hours:");
      int compHours = Integer.parseInt(input);
      tLeader.setCompHours(compHours);
      
      JOptionPane.showMessageDialog(null, tLeader);
      
      System.exit(0);
   }
}