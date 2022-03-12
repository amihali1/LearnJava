/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package helloworld;

/**
 *
 * @author rvc
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        var helloWorld = "Hello World";
        System.out.println(helloWorld);        
        System.out.println("\'%s\' is %d characters long...".formatted(helloWorld, helloWorld.length()));
        var helloSubstring = helloWorld.substring(0, 5);
        var worldSubstring = helloWorld.substring(6);
        
        System.out.println("%s %s".formatted(helloSubstring, worldSubstring));
        
        
    }
    
}
