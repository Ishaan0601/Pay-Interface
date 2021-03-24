/*
*@author: Ishaan Virani
*the class creates a volunteer identity with a designated expense and name. Additionally, it allows for a method to change the volunteer expense
*/
class Volunteer implements Payable
{


//Instance Fields
private String name;
private double expenses;
private static final String PAY_PERIOD = "Hourly";

//Constructor

/*
*constructor creates the volunteer object with a name and expense.
*/
public Volunteer (String volunteerName, double volunteerExpenses)
{
  name  = volunteerName;
  expenses = volunteerExpenses;
}

//Methods

/*
*method setExpense changes the expense for the volunteerExpenses
*@return expenses returns the new exenses for the volunteer
*/
public double setExpense(double inputExpense)
{
  expenses = inputExpense;
  return expenses;
}

/*
*method getName provides volunteer name
*@return name returns the name of the volunteer
*/
public String getName()
{
  return name;
}

/*
*method getPay returns expense for volunteer then sets value  to 0
*@return name returns the expense of the volunteer
*/
public double getPay()
{
  double expenseRefund = expenses;
  expenses = 0;
  return expenseRefund;
}

/*
*method getPayCycle provides the time period in which the expenses add up
*@return PAY_PERIOD returns the time interval in which the expenses are added up
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