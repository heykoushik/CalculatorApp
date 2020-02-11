package Operations;

public class operation implements Operations {
	
	public double Addition(double num1, double num2) {
				return num1+num2;
	}

	public double Subtract(double num1, double num2) {
				return num1-num2;
	}

	public double Multiply(double num1, double num2) {
				return num1*num2;
	}

	public Double Divide(double num1, double num2) {
		if(num2!=0)
		{
		return num1/num2;
		}
		return null;
		
	}

	public double Modulo(double num1, double num2) {
			return num1%num2;
	}
	

}
