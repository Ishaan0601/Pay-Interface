/*
*@author: Ishaan Virani
*the class creates a PartTime worker identity with a designated name, hourly wage, and total hours worked. Additionally, it allows for a method to change the amount of hours worked
*/
class PartTime implements Payable
{

//Instance Fields
private String name;
private double hourlyWage;
private double hoursWorked;
private static final String PAY_PERIOD = "Weekly";

//Constructor

/*
*constructor creates the PartTime object with a name, pay per hour, and hours worked.
*/
public PartTime (String employeeName, double employeePay, double timeWorked)
{
  name  = employeeName;
  hourlyWage = employeePay;
  hoursWorked = timeWorked;
}

//Methods

/*
*method setHours changes the amount of hours worked
*@return hoursWorked returns the new amount of hours worked of the worker
*/
public double setHours(double inputHours)
{
  hoursWorked = inputHours;
  return hoursWorked;
}

/*
*method getName provides volunteer name
*@return name returns the name of the PartTime Worker
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
  if(hoursWorked > (double)HOURS_PER_WEEK)
  {
    double totalTimeWorked;
    double overtime = hoursWorked - (double)HOURS_PER_WEEK;
    overtime *= OVERTIME_RATE;
    totalTimeWorked = overtime + (double)HOURS_PER_WEEK;
    return totalTimeWorked * hourlyWage;
  }
  return hourlyWage * hoursWorked;
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