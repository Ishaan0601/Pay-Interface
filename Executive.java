/*
*@author: Ishaan Virani
*the class creates an Executive worker identity with a designated name and annual salary. 
*/
class Executive implements Payable
{

//Instance Fields
private String name;
private double annualSalary;
private static final String PAY_PERIOD = "Monthly";

//Constructor

/*
*constructor creates the Executive object with a name and annual salary.
*/
public Executive (String employeeName, double employeeSalary)
{
  name  = employeeName;
  annualSalary = employeeSalary;
}

//Methods

/*
*method getName provides volunteer name
*@return name returns the name of the Executive Worker
*/
public String getName()
{
  return name;
}

/*
*method getPay provides the amount the worker is payed
*@return provides the amount the worker received in compensation of their efforts
*/
public double getPay()
{
  double monthlyPay = (annualSalary / MONTHS_PER_YEAR);
  return monthlyPay;
}

/*
*method getPayCycle provides the time interval for the given worker
*@return PAY_PERIOD returns the specific time interval
*/
public String getPayCycle()
{
  return PAY_PERIOD;
}

/*
*method toString formats the data
*@return returns the formatted data for the volunteer including the name, total amount, and time interval
*/
public String toString()
{
  String tempName = String.format("%-20s", getName());
  String tempPay = String.format("%-20s", String.format("%.2f", getPay()));
  String tempPayCycle = String.format("%-20s", getPayCycle());
  return tempName + "\t\t$ " + tempPay + " " + tempPayCycle;
}
}