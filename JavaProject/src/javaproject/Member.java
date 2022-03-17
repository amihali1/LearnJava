/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaproject;

/**
 *
 * @author rvc
 */
class Member
{
    private char memberType;
    private int memberID;
    private String name;
    private double fees;
    
    public Member(char pMemberType, int pMemberId, String pName, double pFees)
    {
        memberType = pMemberType;
        memberID = pMemberId;
        name = pName;
        fees = pFees;
    }

    @Override
    public String toString()
    {
        return memberType + ", " + memberID + ", " + name + ", " + fees;
    }
    
    public char getMemberType()
    {
        return memberType;
    }

    public void setMemberType(char memberType)
    {
        this.memberType = memberType;
    }

    public int getMemberID()
    {
        return memberID;
    }

    public void setMemberID(int memberID)
    {
        this.memberID = memberID;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getFees()
    {
        return fees;
    }

    public void setFees(double fees)
    {
        this.fees = fees;
    }
}
