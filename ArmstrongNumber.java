package week1.day2;

public class ArmstrongNumber {

	//Sum of cube of the digits 
	public static void main(String[] args) 
	{

		int input = 153;
		int OrgNumber = input;
		int sum=0;

		while(input > 0) 
		{
			int rem = input % 10;
			sum = sum + (rem * rem * rem);
			input = input/10;
			//System.out.println("input:" + input);
		}
		
		if(OrgNumber == sum)
		{
			System.out.println("Armstrong Number is : " + sum);
		}else {
			System.out.println("Not an Armstrong Number ");
		}

	}
}
