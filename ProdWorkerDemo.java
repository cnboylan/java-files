import javax.swing.JOptionPane;

/* Program: ProdWorker Demo
   Date:    11/26/17
   Author:  Caitlyn Boylan

	The ProdWorkerDemo class demonstrates
   the capabilities of the Employee and
   ProductionWorker classes.

*/

public class ProdWorkerDemo
{
   public static void main(String[] args)
   {
      String name = JOptionPane.showInputDialog("Please enter "
                  + "the worker's name:");
      String num = JOptionPane.showInputDialog("Please enter "
                  + "the worker's employee number:");      
      String hire = JOptionPane.showInputDialog("Please enter "
                  + "the worker's hire date:");
      
      ProductionWorker worker = new ProductionWorker(name, num, hire);
      
      String input = JOptionPane.showInputDialog("Please set "
                  + "the worker's shift (Day=1,Night=2):");
      int shift = Integer.parseInt(input);
      worker.setShift(shift);
      
      input = JOptionPane.showInputDialog("Please set the "
                  + "worker's hourly pay rate:");
      double hourlyPay = Double.parseDouble(input);
      worker.setHourlyPay(hourlyPay);
      
      JOptionPane.showMessageDialog(null, worker);
      
      System.exit(0);
   }
}