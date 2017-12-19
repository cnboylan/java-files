/* Program: Employee Class
   Date:    11/26/17
   Author:  Caitlyn Boylan

	The Employee class can set and
   retrieve values of employee's name,
   number, and hire date.

*/

public abstract class Employee
{
   private String name;
   private String empNum;
   private String hireDate;
   
   /*
      Constructor
   */
   
   public Employee(String n, String num, String hire)
   {
      name = n;
      empNum = num;
      hireDate = hire;
   }
   
   /*
      setName method
      @param n The employee's name.
   */
   
   public void setName(String n)
   {
      name = n;
   }
   
   /*
      setEmpNum method
      @param num The employee's number.
   */
   
   public void setEmpNum(String num)
   {
      empNum = num;
   }
   
   /*
      setHireDate method
      @param hire The employee's hire date.
   */
   
   public void setHireDate(String hire)
   {
      hireDate = hire;
   }
   
   /*
      getName method
      @return The employee's name.
   */
   
   public String getName()
   {
      return name;
   }
   
   /*
      getEmpNum method
      @return The employee's number.
   */
   
   public String getEmpNum()
   {
      return empNum;
   }
   
   /*
      getHireDate method
      @return The employee's hire date.
   */
   
   public String getHireDate()
   {
      return hireDate;
   }
   
   /*
      toString method
      @return A reference to a String.
   */
   
   public String toString()
   {
      String str = "Employee:\nName: " + name
               + "\nNumber: " + empNum
               + "\nHire Date: " + hireDate;
      return str;
   }
}