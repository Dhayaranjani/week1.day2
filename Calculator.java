package week1.day2;

public class Calculator 
{

	public int add(int num1,int num2)
	{
		return num1 + num2;
	}
	
	public double sub(double num1,double num2)
	{
		return num1 - num2;
	}

	public double mul(double num1,double num2)
	{
		return num1 * num2;
	}

	public int div(int num1,int num2)
	{
		return num1 / num2;
	}
	
	public static void main(String[] args)
	{
		int num1 = 10;
		int num2 = 5;
		Calculator myCalc = new Calculator();
		int sumAdd = myCalc.add(num1,num2);
		double sumSub = myCalc.sub(num1,num2);
		double sumMul = myCalc.mul(num2,num2);
		int sumDiv = myCalc.div(num1,num2);
		
		System.out.println("My Calcultor");
		System.out.println("------------");
		System.out.println("Addition: " + sumAdd);
		System.out.println("Subtraction: " + sumSub);
		System.out.println("Multiplication: " + sumMul);
		System.out.println("Division: " + sumDiv);
	}
}
