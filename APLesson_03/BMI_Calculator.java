import java.util.Scanner;

public class BMI_Calculator
{
	public static void main (String[]args)
	{
		Scanner keyboard  = new Scanner (System.in);
		System.out.println("This is a a BMI Calculator.");
		System.out.println("Please enter your weight in lbs.");
		
		double weight = keyboard.nextInt();
		
		System.out.println("Now enter your height in inches.");
		
		double height = keyboard.nextInt();
		
		double BMI = (weight/(height * height)) * 703;
		
		System.out.println("This is your BMI: " + BMI + "." );
		
	}
}