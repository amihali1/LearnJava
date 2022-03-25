/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaproject;

import java.util.LinkedList;
import java.io.*;

/**
 *
 * @author rvc
 */
public class FileHandler
{
    public LinkedList<Member> readFile()
    {
        LinkedList<Member> members = new LinkedList();
        String lineRead;
        String[] splitLine;                
        int i = 1;
        
        try (BufferedReader reader = new BufferedReader(new FileReader("members.csv")))
        {
            lineRead =reader.readLine();            
            
            while (lineRead != null)
            {
                splitLine = lineRead.split(", ");
                
                if (splitLine[0].equals("S"))
                {
                    members.add(new SingleClubMember(splitLine[0].charAt(0), Integer.parseInt(splitLine[1]), splitLine[2], Double.parseDouble(splitLine[3]), Integer.parseInt(splitLine[4])));
                }
                else if (splitLine[0].equals("S"))
                {
                    members.add(new MultiClubMember(splitLine[0].charAt(0), Integer.parseInt(splitLine[1]), splitLine[2], Double.parseDouble(splitLine[3]), Integer.parseInt(splitLine[4])));
                }
                
                lineRead =reader.readLine();
                i++;
            }
        }   
        catch (IOException e)
        {
            System.out.println("Error on line " + i + " of members.csv. " + e.toString());
        }
        return members;
    }
    
    public void appendFile(String member)
    {        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("members.csv", true)))
        {
            writer.write(member + "\n");
        }
        catch (Exception e)
        {
            System.out.println("Error writing to members.csv. " + e.toString());
        }
    }
    
    public void overWriteFile(LinkedList<Member> members)
    {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("members.temp", false)))
        {
            for (var member : members)
            {
                writer.write(member.toString() + "\n");
            }            
        }
        catch (Exception e)
        {
            System.out.println("Error writing to members.temp. " + e.toString());
        }
        
        try 
        {
            File file = new File("members.csv");
            File tempFile = new File("members.temp");
            
            file.delete();
            tempFile.renameTo(new File("members.csv"));            
        }
        catch (Exception e)
        {
            System.out.println("Error writing to members.csv. " + e.toString());
        }
    }
}
