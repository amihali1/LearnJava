/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package errorhandling;

/**
 *
 * @author rvc
 */
import java.util.Scanner;
public class ErrorHandling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        
        try
        {
            System.out.println("Enter a number: ");
            var num = input.nextInt();
            
            System.out.printf("You entered the number %d\n", num);
        }
        catch (Exception e)
        {
            System.out.printf("You did not enter a number.\n\n%s", e.getMessage());
        }
    }
    
}
