package myReviews_AllenTrader;

public class TwoDice 
{
	public static void main(String[] args)
	{
		int roll1;
		int roll2;
		
		roll1 = 1 + (int) ((6 - 1 + 1) * Math.random());
		roll2 = 1 + (int) ((6 - 1 + 1) * Math.random());
		
		System.out.println("Roll 1 is " + roll1 + " and " + "Roll 2 is " +roll2);
	}
}