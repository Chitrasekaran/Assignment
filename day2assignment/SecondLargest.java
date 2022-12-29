package week1.day2assignment;

import java.util.Arrays;

public class SecondLargest 
{
	public static void main(String[] args) 
	{
		int[] Number= {23,45,67,32,89,22};
		
		Arrays.sort(Number);
		
		int length = Number.length;
	
		System.out.println("Length of the Array is 		: " +length);
		
        System.out.println("Second Smallest Number is 	: " +Number[1]);
        
        //0, 1, 2, 3, 4, 5
        //22, 23, 32, 45, 67, 89
				
	}
}