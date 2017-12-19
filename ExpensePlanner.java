/*
   Unchecked/unsafe error not cleared
   but program compiles and runs.
*/

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

/* 
   Program: Dorm and Meal Plan Calculator
   Date:    12/12/17
   Author:  Caitlyn Boylan

	The ExpensePlanner class displays a window that
   allows the user to make a dorm and meal plan
   selection. When the selections are made, the
   total cost is displayed in the window.
*/

public class ExpensePlanner extends JFrame
{
   private JPanel selectionPanel, totalPanel;
   private JLabel totalLabel;
   private JTextField selectionTotal;
   private JComboBox dormBox, mealBox;
   private String[] dorm = {"Allen Hall", "Pike Hall",
                     "Farthing Hall", "University Suites"};
   private String[] meal = {"7 meals per week",
                     "14 meals per week", "Unlimited meals"};
   private int[] dormCost = {1500, 1600, 1200, 1800};
   private int[] mealCost = {560, 1095, 1500};
   
   /*
      Constructor
   */
   
   public ExpensePlanner()
   {
      setTitle("Dorm and Meal Plan Calculator");
      
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      totalLabel = new JLabel("Total Expense: ");
      
      selectionTotal = new JTextField(5);
      selectionTotal.setEditable(false);
      
      dormBox = new JComboBox(dorm);
      dormBox.addActionListener(new BoxListener());
      mealBox = new JComboBox(meal);
      mealBox.addActionListener(new BoxListener());
      
      selectionPanel = new JPanel();
      selectionPanel.add(dormBox);
      selectionPanel.add(mealBox);
      
      totalPanel = new JPanel();
      totalPanel.add(totalLabel);
      totalPanel.add(selectionTotal);
      
      setLayout(new GridLayout(2,1));
      
      add(selectionPanel);
      add(totalPanel);
      
      pack();
      setVisible(true);
   }
   
   /*
      Private inner class to handle change
      events triggered by the combo boxes.
   */
   
   private class BoxListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         int index1, index2;
         double cost;
         DecimalFormat dollar = new DecimalFormat("####.00");
         index1 = dormBox.getSelectedIndex();
         index2 = mealBox.getSelectedIndex();
         cost = dormCost[index1] + mealCost[index2];
         selectionTotal.setText(dollar.format(cost));
      }
   }
   
   /*
      The main method creates an instance of
      the class, and displays the window.
   */
   
   public static void main(String[] args)
   {
      new ExpensePlanner();
   }
}