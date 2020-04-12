package myReviews_AllenTrader;

import java.util.Scanner;

public class LoopsNeed 
{
	public static void main(String[] args)
	{
		int count = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter an integer value");
		count = in.nextInt();
		
		do
		{
			System.out.println("Count is " + count);
			count++;
		}while (count <= 5);
	}
}
