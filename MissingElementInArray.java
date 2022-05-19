package week1.day2;

import java.util.Arrays;

public class MissingElementInArray 
{
	public static void main(String[] args)
	{
		int[] arr= {1,2,3,4,7,6,8};
		
		//Sort the Array
		Arrays.sort(arr);
		int length = arr.length;
		
		for(int i = 0;i<length; i++)
		{
			//Check if the Iterator variable is not equal to the array values respectively 
			if(i+1!=arr[i])
			{
				System.out.println("Missing Element in Array is : " + (i+1));
				break;
			}
			
		}

	}
}
