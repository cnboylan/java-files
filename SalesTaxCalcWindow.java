import javax.swing.*;
import java.awt.event.*;
import java.text.DecimalFormat;

/* Program: Monthly Sales Tax
   Date:    12/8/17
   Author:  Caitlyn Boylan

	The SalesTaxCalcWindow class displays a window
   that allows the user to enter total monthly sales.
   When the Calculate button is selected, a new
   window displays the county tax, sales tax, and 
   total tax calculated based on the user's input.

*/

public class SalesTaxCalcWindow extends JFrame
{
   private JPanel panel;
   private JLabel label;
   private JTextField salesTextField;
   private JButton calcButton;
   private final int WINDOW_WIDTH = 350;
   private final int WINDOW_HEIGHT = 100;
   private final double CTAX_RATE = .02;
   private final double STAX_RATE = .04;
   
   /*
      Constructor
   */

   public SalesTaxCalcWindow()
   {
      setTitle("Sales Tax Calculator");
      
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
      
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      buildPanel();
      
      add(panel);
      
      setVisible(true);
   }

   /*
      The buildPanel method adds a label,
      text field, and button to a panel.
   */

   private void buildPanel()
   {
      label = new JLabel("Enter the total monthly sales: ");
      
      salesTextField = new JTextField(10);
      
      calcButton = new JButton("Calculate");
      
      calcButton.addActionListener(new CalcButtonListener());
      
      panel = new JPanel();
      panel.add(label);
      panel.add(salesTextField);
      panel.add(calcButton);
   }
   
   private class CalcButtonListener implements ActionListener
   {
      /*
         The actionPerformed method executes when
         the Calculate button is selected.
         @param e The event object.
      */
      
      public void actionPerformed(ActionEvent e)
      {
         String input;
         double countyTax;
         double stateTax;
         double totalTax;
         
         DecimalFormat dollar = new DecimalFormat("######0.00");
         
         input = salesTextField.getText();
         
         countyTax = Double.parseDouble(input) * CTAX_RATE;
         stateTax = Double.parseDouble(input) * STAX_RATE;
         totalTax = countyTax + stateTax;
         
         JOptionPane.showMessageDialog(null, "County sales tax: "
                  + dollar.format(countyTax) + "\nState sales tax: "
                  + dollar.format(stateTax) + "\nTotal sales tax: "
                  + dollar.format(totalTax));
      }
   }
   
   public static void main(String[] args)
   {
      new SalesTaxCalcWindow();
   }
}