/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaproject;

/**
 *
 * @author rvc
 */
public class MultiClubMember extends Member
{
    private int membershipPoints;

    @Override
    public String toString()
    {
        return super.toString() + ", " + membershipPoints;
    }

    public int getMembershipPoints()
    {
        return membershipPoints;
    }

    public void setMembershipPoints(int membershipPoints)
    {
        this.membershipPoints = membershipPoints;
    }

    public MultiClubMember(char pMemberType, int pMemberId, String pName, double pFees, int membershipPoints)
    {
        super(pMemberType, pMemberId, pName, pFees);
        this.membershipPoints = membershipPoints;
    }
    
    
}
