package myReviews_AllenTrader;

import java.util.Scanner;
public class DaySwitch 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number between 1 and 7");
		
		int n = input.nextInt();
		
		switch(n)
		{
			case 1: System.out.println("Monday is " + n);break;
			case 2: System.out.println("Tuesday is " + n);break;
			case 3: System.out.println("Wednesday is " + n);break;
			case 4: System.out.println("Thursday is " + n);break;
			case 5: System.out.println("Friday is " + n);break;
			case 6: System.out.println("Saturday is " + n);break;
			case 7: System.out.println("Sunday is " + n);break;
		}
	}
}
