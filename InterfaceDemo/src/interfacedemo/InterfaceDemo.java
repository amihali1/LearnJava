/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfacedemo;

/**
 *
 * @author rvc
 */
public class InterfaceDemo
{
    public static void main(String[] args)
    {
        MyClass a = new MyClass();
        a.someMethod();
        
        System.out.println("The value of the constant is " + MyInterface.myInt);
    }   
}

class MyClass implements MyInterface
{
    @Override
    public void someMethod()
    {
        System.out.println("This is a method implemented in MyClass");
    }
}

interface MyInterface
{
    int myInt = 5;
    void someMethod();
}