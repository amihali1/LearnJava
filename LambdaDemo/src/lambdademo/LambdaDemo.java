/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lambdademo;

/**
 *
 * @author rvc
 */
public class LambdaDemo
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        MyNumber num1;
        
        num1 = () -> 12.3;
        System.out.println("The value is " + num1.getValue());
        
        num1 = () -> 2 + 3;
        System.out.println("The value is " + num1.getValue());
        
        num1 = () -> 
        {
            int counter = 1;
            int sum = 0;
            while (counter < 5)
            {
                sum += counter;
                counter++;
            }
            return sum;
        };
        System.out.println("Them value is " + num1.getValue());
        
        MyNumberPara num2;
        
        num2 = (n, m) -> n + m;
        System.out.println("The value is " + num2.getValue2(2, 3));
        
        num2 = (n, m) ->
        {
            return n > 10 ? m : m + 1;
        };
        System.out.println("The value is " + num2.getValue2(3, 9));
        
        //vvv THROWS EXCEPTION vvv
        //System.out.println(num2.getValue2(2, 2.1)); 
    }
    
}
