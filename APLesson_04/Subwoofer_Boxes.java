import java.util.Scanner;

public class Subwoofer_Boxes
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner (System.in);
		
		System.out.println("Enter the height in inches:");
		double height = keyboard.nextDouble();
		
		System.out.println("Enter the lenght in inches:");
		double length = keyboard.nextDouble();
		
		System.out.println("Enter the width in inches:");
		double width = keyboard.nextDouble();

		System.out.println("Your volume is " + calcVol(height, length, width) + " ft.");
		
		
	}
	
	public static double calcVol(double h, double l, double w)
	{
		return ((h*l*w)/1728);
	}
}