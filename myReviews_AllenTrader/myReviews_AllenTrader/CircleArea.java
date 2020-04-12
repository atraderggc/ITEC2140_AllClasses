package myReviews_AllenTrader;

import java.util.Scanner;
public class CircleArea 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter radius: "); 
		double radius = input.nextDouble();
		
		double area = 3.1416 * radius * radius;
		
		System.out.print("The area is ");
		System.out.println(area);
	}
}
