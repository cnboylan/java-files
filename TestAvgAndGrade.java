import javax.swing.JOptionPane;

/* Program: TestAvgAndGrade
   Date:    10/19/17
   Author:  Caitlyn Boylan

	Uses calcAverage and determineGrade methods to
	display a user's letter grades and average
	based on 5 test scores. 

*/

public class TestAvgAndGrade
{
	public static void main(String[] args)
	{
		String input;
		double test1, test2, test3, test4, test5, avg;

		input = JOptionPane.showInputDialog("Please enter test score 1:");
		test1 = Double.parseDouble(input);
		JOptionPane.showMessageDialog(null, "Your letter grade for " +
                                 "test 1 is: " + determineGrade(test1));
		
		input = JOptionPane.showInputDialog("Please enter test score 2:");
		test2 = Double.parseDouble(input);
		JOptionPane.showMessageDialog(null, "Your letter grade for " +
                                 "test 2 is: " + determineGrade(test2));		
			
      input = JOptionPane.showInputDialog("Please enter test score 3:");
		test3 = Double.parseDouble(input);
		JOptionPane.showMessageDialog(null, "Your letter grade for " +
                                 "test 3 is: " + determineGrade(test3));
      
      input = JOptionPane.showInputDialog("Please enter test score 4:");
		test4 = Double.parseDouble(input);
		JOptionPane.showMessageDialog(null, "Your letter grade for " +
                                 "test 4 is: " + determineGrade(test4));

		input = JOptionPane.showInputDialog("Please enter test score 5:");
		test5 = Double.parseDouble(input);
		JOptionPane.showMessageDialog(null, "Your letter grade for " +
                                 "test 5 is: " + determineGrade(test5));
      
      avg = calcAverage(test1, test2, test3, test4, test5);
      
      JOptionPane.showMessageDialog(null, "The average of your test " +
                               "scores is " + avg + ". Your average " +
                             "letter grade is: " + determineGrade(avg));
	}

	/**
		The calcAverage method calculates the average
		of 5 test scores input by user.
		@param t1 The first test score.
		@param t2 The second test score.
		@param t3 The third test score.
		@param t4 The fourth test score.
		@param t5 The fifth test score.
		@return	The average test score.
	*/

	public static double calcAverage(double t1, double t2, double t3, double t4, double t5)
	{
		double sum = t1 + t2 + t3 + t4 + t5, avg;
		return avg = sum / 5.0;
	}

	/**
		The determineGrade method determines the letter
		grade of a test based on the numeric score.
		@param score The numeric test score.
		@return The letter grade of the score.
	*/

	public static String determineGrade(double score)
	{
		String grade;
		if (score < 60)
			grade = "F";
		else if (score < 70)
			grade = "D";
		else if (score < 80)
			grade = "C";
		else if (score < 90)
			grade = "B";
		else
			grade = "A";
		return grade;
	}
}