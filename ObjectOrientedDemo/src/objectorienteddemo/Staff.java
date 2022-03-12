/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objectorienteddemo;

/**
 *
 * @author rvc
 */
public class Staff
{
    private String nameOfStaff;
    private final int hourlyRate = 30;
    private int hoursWorked;
    
    public Staff(String name)
    {
        nameOfStaff = name;
        printMessage("\n%s".formatted(nameOfStaff));
        printMessage("----------------------------");
    }
    
    public Staff(String firstName, String lastName)
    {
        nameOfStaff = firstName + " " + lastName;
        printMessage("\n%s".formatted(nameOfStaff));
        printMessage("----------------------------");
    }
    
    public void setHoursWorked(int hours)
    {
        if (hours > 0)
            hoursWorked = hours;
        else
        {
            printMessage("Error: HoursWorked Cannot be Smaller than Zero");
            printMessage("Error: HousrWorked is not updated");
        }
    }
    
    public int getHoursWorked()
    {
        return hoursWorked;
    }
    
    public static void printMessage()
    {
        System.out.println("Calculating Pay...");
    }
    
    public static void printMessage(String message)
    {
        System.out.println(message);
    }
    
    public int calculatePay()
    {
        printMessage();                       
        return hoursWorked > 0 ? (hoursWorked * hourlyRate) : -1;
    }
    
    public int calculatePay(int bonus, int allowance)
    {
        printMessage();
        return hoursWorked > 0 ? (hoursWorked * hourlyRate) + bonus + allowance 
                               : 0;         
    }        
}
