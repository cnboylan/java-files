import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.text.DecimalFormat;

/* Program: Theater Revenue
   Date:    12/8/17
   Author:  Caitlyn Boylan

	The TheaterRevenueWindow class displays a window
   that allows the user to enter the theater's price
   and number of tickets sold for adults and children.
   When the Calculate button is selected, a new
   window displays the gross and net adult revenues,
   gross and net child revenues, and gross and net
   total revenues based on the user's input.

*/

public class TheaterRevenueWindow extends JFrame
{
   private JPanel panel1, panel2;
   private JLabel aPriceLabel, aTixLabel, cPriceLabel, cTixLabel;
   private JTextField aPriceTextField, aTixTextField,
                                  cPriceTextField, cTixTextField;
   private JButton calcButton;
   private final int WINDOW_WIDTH = 450;
   private final int WINDOW_HEIGHT = 200;
   private final double THEATER_REVENUE = .2;
   
   /*
      Constructor
   */

   public TheaterRevenueWindow()
   {
      setTitle("Theater Revenue Calculator");
      
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
      
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      setLayout(new GridLayout(1, 2));
      
      buildPanels();
      
      add(panel1);
      add(panel2);
      
      setVisible(true);
   }

   /*
      The buildPanel method adds labels,
      text fields, and a button to a panel.
   */

   private void buildPanels()
   {
      aPriceLabel = new JLabel("Enter adult ticket price: ");
      aTixLabel = new JLabel("Enter number of adult tickets sold: ");
      cPriceLabel = new JLabel("Enter child ticket price: ");
      cTixLabel = new JLabel("Enter number of child tickets sold: ");
      
      aPriceTextField = new JTextField(10);
      aTixTextField = new JTextField(10);
      cPriceTextField = new JTextField(10);
      cTixTextField = new JTextField(10);
      
      calcButton = new JButton("Calculate");
      calcButton.addActionListener(new CalcButtonListener());
      
      panel1 = new JPanel();
      panel2 = new JPanel();
      panel1.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 13));

      panel1.add(aPriceLabel);
      panel1.add(aTixLabel);
      panel1.add(cPriceLabel);
      panel1.add(cTixLabel);
      
      panel2.add(aPriceTextField);
      panel2.add(aTixTextField);
      panel2.add(cPriceTextField);
      panel2.add(cTixTextField);
      panel2.add(calcButton);
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
         double aPrice, cPrice;
         int aTix, cTix;
         double gAdult, nAdult, gChild, nChild, gTotal, nTotal;
         
         DecimalFormat dollar = new DecimalFormat("######0.00");
         
         input = aPriceTextField.getText();
         aPrice = Double.parseDouble(input);
         
         input = aTixTextField.getText();
         aTix = Integer.parseInt(input);
         
         input = cPriceTextField.getText();
         cPrice = Double.parseDouble(input);
         
         input = cTixTextField.getText();
         cTix = Integer.parseInt(input);
         
         gAdult = aPrice * aTix;
         nAdult = gAdult * THEATER_REVENUE;
         gChild = cPrice * cTix;
         nChild = gChild * THEATER_REVENUE;
         gTotal = gAdult + gChild;
         nTotal = nAdult + nChild;
         
         JOptionPane.showMessageDialog(null, "Adult ticket gross: "
                  + dollar.format(gAdult) + "\nAdult ticket net: "
                  + dollar.format(nAdult) + "\nChild ticket gross: "
                  + dollar.format(gChild) + "\nChild ticket net: "
                  + dollar.format(nChild) + "\nTotal gross: "
                  + dollar.format(gTotal) + "\nTotal net: "
                  + dollar.format(nTotal));
      }
   }
   
   public static void main(String[] args)
   {
      new TheaterRevenueWindow();
   }
}