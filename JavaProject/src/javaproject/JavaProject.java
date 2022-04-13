/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaproject;
import java.util.LinkedList;

/**
 *
 * @author rvc
 */
public class JavaProject
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {        
        MembershipManagement membershipManagement = new MembershipManagement();
        FileHandler fileHandler = new FileHandler();
        
        LinkedList<Member> members = fileHandler.readFile();
        int choice = membershipManagement.getChoice();
        
        while (choice != -1)
        {
            switch (choice)
            {
                case 1:                
                    var memberInfo = membershipManagement.addMembers(members);
                    fileHandler.appendFile(memberInfo);
                    break;                                   
                case 2:
                    membershipManagement.removeMember(members);
                    fileHandler.overWriteFile(members);
                    break;                
                case 3:
                    membershipManagement.printMemberInfo(members);
                    break;           
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;                                                    
            }
            choice = membershipManagement.getChoice();
        }
    }
    
}
