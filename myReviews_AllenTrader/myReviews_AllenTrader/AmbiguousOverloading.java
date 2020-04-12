package myReviews_AllenTrader;

import java.util.Scanner;
public class AmbiguousOverloading 
{
	public static void main(String[] args)
	{
		System.out.println(max1(1, 2));
		System.out.println(max2(1, 2));
	}
	
	public static int max1(double num1, double num2)
	{
		if (num1 > num2)
			return (int) num1;
		else
			return (int) num2;
	}
	
	public static double max2(double num1, double num2)
	{
		if (num1 > num2)
			return num1;
		else
			return num2;
	}
}
