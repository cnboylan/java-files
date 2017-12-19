import javax.swing.JOptionPane;
import java.util.ArrayList;

/* Program: Driver's License Exam
   Date:    11/12/17
   Author:  Caitlyn Boylan

	The DriverExam class compares a user's
   answers to the exam key and outputs:
   pass/fail status, number correct,
   number incorrect, and questions missed.

*/

public class DriverExam
{
   public static void main(String[] args)
   {
      char[] examKey = { 'B', 'D', 'A', 'A', 'C',
                         'A', 'B', 'A', 'C', 'D',
                         'B', 'C', 'D', 'A', 'D',
                         'C', 'C', 'B', 'D', 'A' };
      final int questions = 20;
      char[] userExam = new char[questions];
      
      for (int i = 0; i < questions; i++)
      {
         String input = JOptionPane.showInputDialog("Enter "
                                + "answer " + (i + 1) + ": ");
         
         userExam[i] = input.charAt(0);
         
         while (userExam[i] < 'A' || userExam[i] > 'D')
         {
            input = JOptionPane.showInputDialog("Invalid input. "
                   + "Enter only the letters A, B, C, or D.");
         
            userExam[i] = input.charAt(0);
         }
      }
      
      boolean passFail = passed(examKey, userExam);
      
      if (passFail)
         JOptionPane.showMessageDialog(null, "User has passed.");
      else
         JOptionPane.showMessageDialog(null, "User has failed.");
      
      int correct = totalCorrect(examKey, userExam);
      
      JOptionPane.showMessageDialog(null, "User answered "
                            + correct + " questions correctly.");
      
      int incorrect = totalIncorrect(examKey, userExam);
      
      JOptionPane.showMessageDialog(null, "User answered "
                        + incorrect + " questions incorrectly.");
      
      ArrayList<String> questionsWrong = new ArrayList<String>();
      if (incorrect > 0)
      {
         questionsWrong = questionsMissed(examKey, userExam, questionsWrong);
         
            JOptionPane.showMessageDialog(null, "User missed the "
              + "following questions:\n" + questionsWrong);
      }
      else
         JOptionPane.showMessageDialog(null, "No questions missed.");
   }
   
   /**
      passed method
      @param key The answer key array.
      @param input The user's answers.
      return True if user passed, otherwise false.
   */
   
   public static boolean passed(char[] key, char[] input)
   {
      boolean passed = false;
      int correct = totalCorrect(key, input);
      if (correct >= 15)
         passed = true;
      return passed;
   }
   
   /**
      totalCorrect method
      @param key The answer key array.
      @param input The user's answers.
      return The number of correct answers.
   */
   
   public static int totalCorrect(char[] key, char[] input)
   {
      int correct = 0;
      for (int index = 0; index < 20; index++)
      {
         if (input[index] == key[index])
            correct++;
      }
      return correct;
   }
   
   /**
      totalIncorrect method
      @param key The answer key array.
      @param input The user's answers.
      return The question numbers of all incorrect answers.
   */
   
   public static int totalIncorrect(char[] key, char[] input)
   {
      int incorrect = 0;
      for (int index = 0; index < 20; index++)
      {
         if (input[index] != key[index])
            incorrect++;
      }
      return incorrect;
   }
   
   /**
      questionsMissed method
      @param key The answer key array.
      @param input The user's answers.
      @param incorrect The number incorrect from totalIncorrect method.
      return Question numbers of all missed questions.
   */
   
   public static ArrayList<String> questionsMissed(char[] key, char[] input, ArrayList<String> missed)
   { 
      for (int index = 0; index < 20; index++)
      {
         if (input[index] != key[index])
            missed.add(Integer.toString(index + 1));
      }
      return missed;
   }
   
}