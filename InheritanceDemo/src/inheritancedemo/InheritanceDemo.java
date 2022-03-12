/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inheritancedemo;

/**
 *
 * @author rvc
 */
public class InheritanceDemo
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        NormalMember mem1 = new NormalMember("James", 1, 2010);
        VIPMember mem2 = new VIPMember("Andy", 2, 2011);
        
        mem1.calculateAnnualFee();
        mem2.calculateAnnualFee();
        
        mem1.displayMemInfo();
        mem2.displayMemInfo();
        
        mem1.setDiscount();
        mem1.calculateAnnualFee();
        mem1.displayMemInfo();
    }
    
}

