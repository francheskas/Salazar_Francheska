import java.util.Scanner;

public class Average2
{
	public static void main (String[]args)
	
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter your first number:");
		double num1 = keyboard.nextDouble();
		
		System.out.println("Enter your second number:");
		double num2 = keyboard.nextDouble();
		
		System.out.println("Enter your third number:");
		double num3 = keyboard.nextDouble();
		
		double average = calcAvg(num1, num2, num3);
		
		System.out.printf("The average of " + num1 + ", " + num2 +", and "  + num3 + " is %5.5f.", average);
	}
	
	public static double calcAvg(double num1, double num2, double num3)
	{
		return ((num1+num2+num3)/3);
	}
}