package week1.day2assignment;

public class Palindrome 
{
public static void main(String[]args)
	{
		int number = 620026;
		int n =number;
		int temp1 =0;
		for(number=n;number!=0;number=number/10)
		{
			int temp = number%10;
			temp1 = (temp1*10)+temp;
		}
		if(temp1==n)
		{
			System.out.println("The Number " +n+ " is a Palindrome" );	
		}
		else
		{
		System.out.println("The Number " +n+ " is not a Palindrome" );		
		}
	}
}
