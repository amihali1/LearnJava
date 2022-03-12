/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package objectorienteddemo;

/**
 *
 * @author rvc
 */
public class ObjectOrientedDemo
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        var staffPeter = new Staff("Peter");        
        
        staffPeter.setHoursWorked(160);
        var staff1Pay = staffPeter.calculatePay(1000,400);
        
        System.out.printf("Pay = %d\n", staff1Pay);
        
        var staffJane = new Staff ("Jane", "Lee");                

        staffJane.setHoursWorked(180);                
        
        System.out.printf("\n\nUpdating Jane's Hours Worked to -10\n");
        staffJane.setHoursWorked(-10);
        System.out.printf("\nHours Worked = %d\n", staffJane.getHoursWorked());
        
        var staff2Pay = staffJane.calculatePay(1000,500);
        
        System.out.printf("Pay = %d\n", staff2Pay);
        
    }
    
}
