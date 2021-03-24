AP Computer Science I
Unit 9 Lab Packet
Interfaces

Part I: 	Payable Interface	
Javadocs and headings: 10 points
Part I: Payable Interface

Files: Main (driver/PayTester), Payable interface, Executive, part-time, commission classes

The Payable interface supplies method definitions for classes representing different types of employees that are paid in different ways.  You will create the interface, 3 different employee classes, and the tester/main.

Payable Interface (Payable.java):
The Payable interface should contain the following abstract methods:
•	getPay, which returns a double representing the amount the employee is paid each cycle
•	getPayCycle, which returns a String representing the pay cycle (weekly, monthly, bi-monthly, etc.)
•	getName, which returns the employee’s name
•	constants for hours per week (40),  months per year (12) and overtime rate (1.5)

Executive Class (Executive.java):
The Executive class represents an executive who gets paid an annual salary, and is paid once a month.  The Executive class should have the following members:
•	Instance fields to store the name and annual salary (double)
- Static final variable contain int the pay period Monthly
•	A parameter constructor which receives values for each instance field
•	The three methods from the Payable interface & toString returning getName, getPay and getPayCycle

PartTime Class (PartTime.java):
The PartTime class represents a part time employee who earns an hourly wage and gets paid weekly.  If the employee works over 40 hours, they should earn time and a half on the overtime hours.  The PartTime class should have the following members:
•	An instance field to store the name, hourly wage (double), and hours worked (double)
- Static final variable containint the pay period Weekly
•	A parameter constructor which receives values for each instance field
•	A method to set the hours worked
•	The three methods from the Payable interface & toString returning getName, getPay and getPayCycle

Commission Class (Commission.java):
The Commission class represents an employee who gets paid bi-monthly based on a percentage of sales.  The Commission class should have the following members:
•	Instance fields for the name, sales amount and percent commission (as a fraction.  20% = .20)
- Static final variable containint the pay period Bi-Monthly
•	A parameter constructor which receives values for each instance field
•	A method to set the sales amount
•	The three methods from the Payable interface & toString returning getName, getPay and getPayCycle

PayTester Class (Main.java):
PayTester will contain the main method.  It should do the following:
•	Declare a List (interface type) and instantiate it as an ArrayList of Payable objects.
•	Add 5 different employees from the assorted available classes (use each one at least once)
•	A for each loop that calls each employee’s toString method to display the payroll.
-  Adjust the hours for the part time employee & commission for the commissioned employee
-- Repeat the loop to print all pay


Bonus:   Make a Volunteer class that implements the Payable interface
Whenever the Volunteer is paid, they are just getting a refund of expenses.  The expenses are then reset back to zero.

 Sample Output based on the following data:
Alex Thompson is an Executive making 70000 per year
Susan Johnson is a Commission employee who makes 20% and sold 100,000
Christi Bunch is a part timer who worked 42 hours at $7.50 per hour
John Stewart is an Executive making 85000 per year
Robert Fulton is a part timer who worked 20 hours at $9.25 per hour


Output:
Alex Thompson     $    5833.33 Monthly
Susan Johnson   	$   20000.00 Bi-monthly
Christi Bunch   	$     322.50 Weekly
John Stewart   	  $     7083.33 Monthly
Robert Fulton   	$      185.00 Weekly

 
AFTER UPDATED HOURS AND COMMISSION SALES
Alex Thompson     $    5833.33 Monthly
Susan Johnson   	$     200.00 Bi-monthly
Christi Bunch   	$       7.50 Weekly
John Stewart   	  $     7083.33 Monthly
Robert Fulton   	$      185.00 Weekly