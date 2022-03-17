/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package genericsdemo;

/**
 *
 * @author rvc
 */
public class GenericsDemo
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        MyGenericsClass<Integer> g = new MyGenericsClass();
        
        g.setMyVar(10);
        g.printValue();
    }
    
}

class MyGenericsClass<T>
{
    private T myVar;
    
    void setMyVar (T i)
    {
        myVar = i;       
    }
    
    void printValue()
    {
        System.out.println("The value of myVar is " + myVar);
    }
}