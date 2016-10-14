import java.util.Scanner;

public class cube

{
	static double side;
	static double surfaceArea;

    public static void main (String[]args)
	{
		Scanner keyboard = new Scanner (System.in);
		
		System.out.println("What is the side of your cube?");
		side = keyboard.nextDouble();
	
		calcSurf();
		print();
	}
	
	public static void calcSurf()
	{
		surfaceArea = (6*(Math.pow(side, 2)));
	}
	
	public static void print()
	{
		System.out.printf("The surface area of acube whose sides are " + side + " in length is %5.5f ", surfaceArea);
	}
}
