/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package filehandlingdemo;
import java.io.*;
import java.nio.Buffer;
/**
 *
 * @author rvc
 */
public class FileHandlingDemo
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        String line;
        
        try (BufferedReader reader = new BufferedReader(new FileReader("myFile.txt")))
        {
            line = reader.readLine();
            
            while (line != null)
            {
                System.out.println(line);
                line = reader.readLine();
            }
        } 
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
    
}
