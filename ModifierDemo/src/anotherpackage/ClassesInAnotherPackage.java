/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anotherpackage;

import modifierdemo.ModifierDemo;
/**
 *
 * @author rvc
 */
public class ClassesInAnotherPackage
{
    //empty
}

class MyClassC extends ModifierDemo
{
    public void printMessages()
    {
        //this is ok
        System.out.println(publicNum);
        
        //this is ok
        System.out.println(protectedNum);
        
        //this is NOT ok
        System.out.println(packagePrivateNum);
        
        //this is NOT ok
        System.out.println(privateNum);
    }
}

class MyClassD 
{
    public void printMessages()
    {
        ModifierDemo p = new ModifierDemo();
        
        //this is ok
        System.out.println(p.publicNum);
        
        //this is NOT ok
        System.out.println(p.protectedNum);
        
        //this is NOT ok
        System.out.println(p.packagePrivateNum);
        
        //this is NOT ok
        System.out.println(p.privateNum);
    }
}
