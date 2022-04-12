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
            value = getIntInput();
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
        String mem;
        double fees;
        int memberId;
        Member member;
        Calculator<Integer> cal;
        
        System.out.print("Enter the member's name: ");
        name = reader.nextLine();
        
        while (club < 1 || club > 4)
        {
            printClubOptions();
            System.out.print("Enter the club ID that the member has access to: ");
            club = getIntInput();          
        }

        
        
    }
}
