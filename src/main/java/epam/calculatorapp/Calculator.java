package epam.calculatorapp;

import Operations.*;
public class Calculator {
	private String Operator;
	private double num1;
	private double num2;
	private Double result;
	int S=0;
	operation op=new operation();
	Calculator(double num1,String Operator,double num2)
	{
		this.num1=num1;
		this.Operator=Operator;
		this.num2=num2;
		
	if(this.Operator.equalsIgnoreCase("addition")||this.Operator.equalsIgnoreCase("add")||this.Operator.equals("+"))S=1;
	if(this.Operator.equalsIgnoreCase("subtraction")||this.Operator.equalsIgnoreCase("sub")||this.Operator.equals("-"))S=2;
	if(this.Operator.equalsIgnoreCase("multiply")||this.Operator.equalsIgnoreCase("mul")||this.Operator.equals("*"))S=3;
	if(this.Operator.equalsIgnoreCase("divide")||this.Operator.equalsIgnoreCase("div")||this.Operator.equals("/"))S=4;
	if(this.Operator.equalsIgnoreCase("modulo")||this.Operator.equalsIgnoreCase("mod")||this.Operator.equals("%"))S=5;
	switch(S)
	{
		case 1:	
			this.result = op.Addition(this.num1, this.num2);
			break;
		case 2:
			this.result = op.Subtract(this.num1, this.num2);
			break;
		case 3 :
			this.result = op.Multiply(this.num1, this.num2);
			break;
		case 4 :
			this.result = op.Divide(this.num1, this.num2);
			break;
		case 5 :
			this.result = op.Modulo(this.num1, this.num2);
			break;
	}
		 
	}
	public void Result()
	{
		if(this.result!=null)System.out.println("Result: "+this.result);
		else System.out.println("number is not divisible by zero");
	}
}