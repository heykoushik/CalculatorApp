package epam.calculatorapp;

import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("Hi! i can perform following operations\nTo ADD: addition,add,+\nTO SUBTRACT: sub,subtraction,-\nTO MULTIPLY: mul,multiply,*\nTO DIVIDE:div,division,/\nTO MOD:mod,modulo,%");
        boolean condition=true;
        double num1,num2;
        Scanner sc = new Scanner(System.in);
        while(condition)
        {
        	System.out.print("Enter the numbers to perform operation: ");
        	num1 = sc.nextDouble();
        	num2 = sc.nextDouble();
        	sc.nextLine();
        	System.out.print("Choose the operation to be performed : ");
        	String Op = sc.next();
        	Calculator cal = new Calculator(num1,Op,num2);
        	cal.Result();
        	System.out.println("To continue enter y for Yes and n for No");
        	String again = sc.next();
        	if(again.equalsIgnoreCase("y"))condition = true;
        	else {condition = false;break;}
        }
        sc.close();
    }
}