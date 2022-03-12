/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simpleio;

import java.util.Scanner;
/**
 *
 * @author rvc
 */
public class SimpleIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        var reader = new Scanner(System.in);
        
        System.out.println("Hi, what is your name?\n");
        var nameInput = reader.nextLine();
        
        System.out.printf("Nice to meet you, %s\n", nameInput);
        
    }
    
}
