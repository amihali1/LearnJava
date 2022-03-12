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
        var staff1 = new Staff("Peter");
        var staff2 = new Staff ("Jane", "Lee");
                
        staff1.setHoursWorked(160);
        staff2.setHoursWorked(180);
        
        var staff1Pay = staff1.calculatePay(1000,400);
        var staff2Pay = staff1.calculatePay(1000,500);
        
        System.out.printf("Pay = %d\n", staff1Pay);
    }
    
}
