/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listdemo;
import java.util.*;
/**
 *
 * @author rvc
 */
public class ListDemo
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        LinkedList<Integer> userAgeList = new LinkedList<>();
        
        userAgeList.add(40);
        userAgeList.add(53);
        userAgeList.add(45);
        userAgeList.add(53);
        userAgeList.add(2,51);
        
        System.out.println(userAgeList.size());
        
        userAgeList.remove(3);
        
        System.out.println(userAgeList.contains(12));
        System.out.println(userAgeList.indexOf(12));
        System.out.println(userAgeList.get(2));
        
        Integer[] userAgeArray = userAgeList.toArray(new Integer[0]);
        System.out.println(userAgeArray[0]);
        System.out.println(userAgeList);
        
    }
    
}
