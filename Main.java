//Author: Ishaan Virani
import java.util.ArrayList;
public class Main 
{
  public static void main(String[] args) 
  {
    //Create an ArrayList that will contain Payable references
    ArrayList<Payable> payRole = new ArrayList <>();

    //As you test, add one class at a time to the ArrayList.  
    //You should start (after creating the interface) with an Executive
    //You will have at least 5 Employees when ready to submit
    // 1) Executive 2) Commission 3) part time reg hours, 4) part time with overtime hours 5) one of your choosing
    Payable  alexT = new Executive ("Alex Thompson", 70000);
    payRole.add(alexT);
    Payable susanJ = new Commission ("Susan Johnson", 0.2, 100000);
    payRole.add(susanJ);
    Payable christiB = new PartTime("Christi Bunch", 7.50, 42);
    payRole.add(christiB);
    Payable johnS = new Executive ("John Stewart", 85000);
    payRole.add(johnS);
    Payable robertF = new PartTime ("Robert Fulton", 9.25, 20);
    payRole.add(robertF);
    Payable jacobK = new Volunteer ("Jacob Kingly", 40);
    payRole.add(jacobK);
    Payable navrajS = new Executive ("Navraj Singh", 100000);
    payRole.add(navrajS);
    Payable mileyC = new Commission ("Miley Cyrus", 0.5, 49500);
    payRole.add(mileyC);

    //Loop thru the Employees and print as shown for the sample
    for (int k = 0; k < payRole.size(); k++)
    {
      Payable object = payRole.get(k);
      String attributes = object.toString();
      System.out.println(attributes);
    }



    // adjust the hours for one part time Employee
    ((PartTime) christiB).setHours(45);

    // adjust the commission sales for the Commission Employee
    ((Commission) susanJ).setSaleAmount(90000);

    // adjust the expense for the volunteer
    ((Volunteer) jacobK).setExpense(65);


    // Loop thru to print all Employees again to show the modifications worked. 
    System.out.println("\n\n");
    for (int k = 0; k < payRole.size(); k++)
    {
      Payable object = payRole.get(k);
      String attributes = object.toString();
      System.out.println(attributes);
    }
  } 
}