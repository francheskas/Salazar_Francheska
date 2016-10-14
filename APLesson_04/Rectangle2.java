import java.util.Scanner;

public class Rectangle2
{
	public static void main(String[]args)

	{
		Scanner keyboard = new Scanner (System.in);
	
		System.out.println("Enter the length of your rectangle:");
		double l = keyboard.nextDouble();
		
		System.out.println("Enter the width of your rectangle:");
		double w = keyboard.nextDouble();
		
		double perimeter = calcPerim(l, w);
		
		System.out.printf("Your rectangle is %.5f.", perimeter);
	}
	
	public static double calcPerim(double l, double w)
	{
		return 2 *(l+w);
	}
}