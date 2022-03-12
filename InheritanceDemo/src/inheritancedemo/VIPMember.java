/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritancedemo;

/**
 *
 * @author rvc
 */
public class VIPMember extends Member
{
    public VIPMember(String pName, int pMemberID, int pMemberSince)
    {
        super(pName, pMemberID, pMemberSince);
        System.out.println("Child Constructor with 3 parameters");
    }
    
    @Override
    public void calculateAnnualFee()
    {
        annualFee = (1 - .01*getDiscount())*1200;
    }
}
