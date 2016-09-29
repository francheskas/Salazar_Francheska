import java.util.Scanner;

public class Calories_Burned_Calculator
{
	public static void main (String[]args)
	{
		Scanner keyboard = new Scanner (System.in);
		
		System.out.println("Hello. This is a calories burned calculator for women on a daily basis.");
		System.out.println("First, what is your weight in kilograms?");
		
		double weight = keyboard.nextInt();
		
		System.out.println("Now, what is your height in centimeters?");
		
		double height = keyboard.nextInt();
		
		System.out.println("How old are you?");
		
		double age = keyboard.nextInt();
		
		double caloriesBurned = (447.6+9.25 * weight)+(3.10 * height)-(4.33 * age);
		
		System.out.println("The calories you burn per day are " + caloriesBurned + ".");
	}
	
}