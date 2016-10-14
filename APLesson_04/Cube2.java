import java.util.Scanner;

public class Cube2
{
	public static void main(String[]args)

	{
		Scanner keyboard = new Scanner (System.in);
	
		System.out.println("Enter the side of your cube:");
		double side = keyboard.nextDouble();
		
		double surfaceArea = calcSurf(side);
		
		System.out.printf("The surface area of acube whose sides are " + side + " in length is %5.5f .", surfaceArea);
	}
	
	public static double calcSurf(double side)
	{
		return (6*(Math.pow(side, 2)));
	}
}