package myReviews_AllenTrader;

import java.util.Random;
public class TestingSwitch 
{
	public static void main(String[] args)
	{
		Random input = new Random();
		int n = input.nextInt(6);
		System.out.println("n = " + n);
		switch(n)
		{
			case 0: System.out.println("This is case where n = 0.");
			case 1: System.out.println("This is case where n < 2.");
			case 2: System.out.println("This is case where n < 3.");
			case 3: System.out.println("This is case where n < 4.");
			default: System.out.println("This is the default case.");
		}
		System.out.println("n = " + n);

		switch(n)
		{
			case 0: System.out.println("This is case where n = 0.");break;
			case 1: System.out.println("This is case where n = 2.");break;
			case 2: System.out.println("This is case where n = 3.");break;
			case 3: System.out.println("This is case where n = 4.");break;
			default: System.out.println("This is the default case.");
		}
		
		System.out.println("n = " + n);
	}

}
