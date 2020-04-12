package myReviews_AllenTrader;

import java.util.Scanner;
public class FahrenheitToCelsius 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a temperature in Fahrenheit");
		int fahrenheit = input.nextInt();
		double celsius = (fahrenheit - 32) * (5.0 / 9.0);
		System.out.println(fahrenheit + " degrees F is " + celsius + " degrees C");
	}
}
