package week1.day2assignment;

public class PrimeNumber 
{
	public static void main(String[]args)
	{
		int number = 15;
		boolean isPrime = false;
		for (int i=2;i<number/2; i++)
			{
				if (number % i ==0)
				{
				isPrime = true;
				break;
				}
			}
			
		if (isPrime == false)
		{
			System.out.println("Number " +number+ " is a Prime Number");			
		}
		else
		{
			System.out.println("Number " +number+ " is not a Prime Number");		
		}
	}
}

//Declare an int Input and assign a value 13
// Declare a boolean variable flag as false
// Iterate from 2 to half of the input
// Divide the input with each for loop variable and check the remainder
// Set the flag as true when there is no remainder
// break the iterator
// Check the flag (Provide a condition)
// Print 'Prime' when the condition matches
// Print 'Not a Prime' when the condition doesn't match 