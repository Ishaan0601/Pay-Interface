/*
*@author: Ishaan Virani
*the class creates a commission-based-worker identity with a designated name, percent commission, and total value of sale. Additionally, it allows for a method to change the amount the worker's sale is worth
*/
class Commission implements Payable
{

//Instance Fields
private String name;
private double salesAmount;
private double percentCommission;
private static final String PAY_PERIOD = "Bi-Monthly";

//Constructor

/*
*constructor creates the worker object with a name, pay based on commission, and sale ammount.
*/
public Commission (String employeeName, double employeeCommission, double salePrice)
{
  name  = employeeName;
  salesAmount = salePrice;
  percentCommission = employeeCommission;
}

//Methods

/*
*method setSaleAmount changes the amount the sale was worth
*@return salesAmount returns the new value of the sale
*/
public double setSaleAmount(double inputAmount)
{
  salesAmount = inputAmount;
  return salesAmount;
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
  return salesAmount * percentCommission;
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