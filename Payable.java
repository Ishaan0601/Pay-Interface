/*
*@author: Ishaan Virani
*Payable.java
*Interface class has the following methods:
*getPay()
*getPayCycle()
*getName()
*/
public interface Payable
{
  public final int HOURS_PER_WEEK = 40;
  public final int MONTHS_PER_YEAR = 12;
  public final double OVERTIME_RATE = 1.5;


  public double getPay();
  public String getPayCycle();
  public String getName();
}