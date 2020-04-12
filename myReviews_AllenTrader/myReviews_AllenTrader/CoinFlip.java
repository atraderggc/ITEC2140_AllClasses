package myReviews_AllenTrader;

public class CoinFlip 
{
	public static void main(String[] args)
	{
		double rand = Math.random();
		if (rand < 0.5)
		{
			System.out.println("H");
		}
		else
		{
			System.out.println("T");
		}
	}

}
