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
            reader.nextLine();
        } 
        catch (Exception e)
        {
            System.out.println("Error: You did not enter an integer");
            getIntInput();
        }
        return value;
    }
}
