import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.text.DecimalFormat;

/* Program: Scrollable Tax Calculator
   Date:    12/11/17
   Author:  Caitlyn Boylan

	The TaxCalc class displays a window that allows
   the user to enter a purchase amount and select
   a tax rate. When the tax rate is adjusted, the
   sales tax is displayed in the window.
   
*/

public class TaxCalc extends JFrame
{
   private JPanel purchPanel, taxPanel, sliderPanel;
   private JTextField purchAmt, taxAmt;
   private JLabel purchLabel, taxLabel;
   private JSlider taxRate;
   
   /*
      Constructor
   */
   
   public TaxCalc()
   {
      setTitle("Tax Calculator");
      
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      purchLabel = new JLabel("Purchase: ");
      taxLabel = new JLabel("Sales tax: ");
      
      purchAmt = new JTextField(10);
      taxAmt = new JTextField(10);
      taxAmt.setEditable(false);
      
      taxRate = new JSlider(JSlider.HORIZONTAL, 0, 10, 0);
      taxRate.setMajorTickSpacing(1);
      taxRate.setPaintTicks(true);
      taxRate.setPaintLabels(true);
      taxRate.addChangeListener(new SliderListener());
      
      purchPanel = new JPanel();
      purchPanel.add(purchLabel);
      purchPanel.add(purchAmt);
      taxPanel = new JPanel();
      taxPanel.add(taxLabel);
      taxPanel.add(taxAmt);
      sliderPanel = new JPanel();
      sliderPanel.add(taxRate);
      
      setLayout(new GridLayout(3,1));
      
      add(purchPanel);
      add(taxPanel);
      add(sliderPanel);
      
      pack();
      setVisible(true);
   }
   
   /*
      Private inner class to handle change
      events triggered by the slider.
   */
   
   private class SliderListener implements ChangeListener
   {
      public void stateChanged(ChangeEvent e)
      {
         String input;
         double purchase, rate, tax;
         DecimalFormat dollar = new DecimalFormat("#########.00");
         
         input = purchAmt.getText();
         purchase = Double.parseDouble(input);
         rate = taxRate.getValue();
         
         tax = purchase * (rate / 100);
         taxAmt.setText(dollar.format(tax));
      }
   }
   
   /*
      The main method creates an instance of
      the class, and displays the window.
   */
   
   public static void main(String[] args)
   {
      new TaxCalc();
   }
}