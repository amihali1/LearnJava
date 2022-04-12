/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaproject;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;
/**
 *
 * @author rvc
 */
public class MembershipManagement
{
    final private Scanner reader = new Scanner(System.in);
    
    private int getIntInput()
    {
        int value = 0;
        System.out.println("Enter an integer value:");
        
        while (value == 0)
        {
           try
            {
                value = reader.nextInt();

                if (value == 0)
                    throw new InputMismatchException();

                reader.nextLine();
            } 
            catch (Exception e)
            {
                System.out.println("Error: You did not enter an integer. Please try again:");
            }
        }
        return value;         
    }
    
    private void printClubOptions()
    {
        System.out.println("1) Club Mercury\n2) Club Neptune\n3) Club Jupiter\n4) Multi Clubs");
    }
    
    private int getChoice()
    {        
        System.out.println("WELCOME TO OZONE FITNESS CENTER");
        System.out.println("===============================");
        System.out.println("1) Add Member");
        System.out.println("2) Remove Member");
        System.out.println("3) Display Member Information\n");
        System.out.println("Please select an option (or entier -1 to quit):");
        
        return getIntInput();               
    }
    
    public String addMembers(LinkedList<Member> members)
    {
        String name;
        int club = 0;        
        double fees;
        int memberId;       
        Calculator<Integer> cal;
        
        System.out.print("Enter the member's name: ");
        name = reader.nextLine();
        
        while (club < 1 || club > 4)
        {
            printClubOptions();
            System.out.print("Enter the club ID that the member has access to: ");
            club = getIntInput();          
        }

        memberId = !members.isEmpty()? members.getLast().getMemberID() + 1 : 1;       
        
        if (club != 4)
        {
            cal = (Integer n) -> switch (n) 
            {
                case 1 -> 900;
                case 2 -> 950;
                case 3 -> 1000;
                default -> -1;
            };
                    
            fees = cal.calculateFees(club);
            members.add(new SingleClubMember('S',memberId, name, fees, club));
            System.out.println("\nSTATUS: Single Club Member added\n");
        }
        else
        {
            cal = (Integer n) -> switch (n) 
            {
                case 4 -> 1200;
                default -> -1;
            };
            
            fees = cal.calculateFees(club);            
            members.add(new MultiClubMember('M', memberId, name, fees, 100));
            System.out.println("\nSTATUS: Multi Club Member added\n");
        }
        
        return members.getLast().toString();
    }
    
    public void removeMember(LinkedList<Member> members)
    {        
        System.out.println("Enter the Member ID of the member you want to remove: ");
        var memberId = getIntInput();
        
        for (int i = 0; i < members.size(); i++)
        {
            if (members.get(i).getMemberID() == memberId)
            {
                members.remove(i);
                System.out.println("Member " + memberId + " has been removed.");
                return;
            }
        }
        System.out.println("Member ID " + memberId + " not found.");
    }
}
