package myReviews_AllenTrader;

import java.util.Scanner;

public class Switch 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
				
		System.out.print("Pick a number between 1 and 10: ");	
		int n = input.nextInt();
		
		switch (n)
		{
			case 1:
				System.out.println("You picked 1.");
			case 2:
			case 3:
				System.out.println("You picked a small number.");
				break;
				
			case 4:
			case 5:
			case 6:
				System.out.println("You picked a medium number.");
				break;
				
			case 7:
			case 8:
			case 9:
			case 10:
				System.out.println("You picked a number.");
				break;
				
			default:
				System.out.println("You picked an invalid number.");
		}
	}
}
