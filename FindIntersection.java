package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		//Declare Arrays
		int[] arr1 = {3,2,11,4,6,7};
		int[] arr2 = {1,2,8,4,9,7};
		
		System.out.println("Intersection of the Arrays are : " );
		
		//Declare for loop
		for(int i=0; i<arr1.length; i++)
		{
			//Declare nested for loop
			for(int j=0; j<arr2.length; j++)
			{
				//Comparing both the arrays then print
				if(arr1[i] ==arr2[j])
				{
					System.out.println(arr1[i]);
				}
					
			}
		}
	}
	

}
