/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package javaproject;

/**
 *
 * @author rvc
 */
public interface Calculator<T extends Number>
{
    double calculateFees(T clubId);
}
