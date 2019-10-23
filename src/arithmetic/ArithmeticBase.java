/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

import java.util.Scanner;

/** This class takes String input plus,minus,divide and times
 * from user and execute the arithmetic operation
 * change the code to use enum instead String and add object oriented principles satisfy as comment in the code
 * @author sivagamasrinivasan
 * date 10/22
 */
public class ArithmeticBase 
{
    
    public enum Operation{PLUS, MINUS, TIMES, DIVIDE};
    public final Operation operation;
    
   public Operation operation()
   {
		return this.operation;
	}
    
 public double x,y;
    double calculate(double x, double y) 
        {
        Scanner sc =new Scanner(System.in);

        switch (s.toUpperCase()) 
        {
            case "PLUS":
                return x + y;
            case "MINUS":
                return x - y;
            case "TIMES":
                return x * y;
            case "DIVIDE":
                return x / y;
            default:
                throw new AssertionError("Unknown operations " + this);
        }
        
        
    }
   
}
