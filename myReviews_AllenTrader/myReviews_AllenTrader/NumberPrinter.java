package myReviews_AllenTrader;

import java.util.Scanner;
public class NumberPrinter 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number between 1 and 100");
		int n = input.nextInt();
		
		if (n < 0 || n > 100)
		{
			System.out.println("That is not a valid number");
		}
		else
		{
			for (int i = 1; i <= n; i++)
			{
				System.out.println(i);
			}
		}
	}
}
