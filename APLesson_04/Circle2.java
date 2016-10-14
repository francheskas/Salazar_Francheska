import java.util.Scanner;

public class Circle2
{
	public static void main(String[]args)

	{
		Scanner keyboard = new Scanner (System.in);
	
		System.out.println("Enter the the length of your radius:");
		double r = keyboard.nextDouble();
		
		double area = calcArea(r);
		
		System.out.printf("The area of a circle with a radius  " + r + " is %5.5f. ", area);
	}
	
	public static double calcArea(double r)
	{
		return (3.14*(Math.pow(r, 2)));
	}
}