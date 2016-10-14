import java.util.Scanner;

public class Circle

{
	static double r;
	static double area;

    public static void main (String[]args)
	{
		Scanner keyboard = new Scanner (System.in);
		
		System.out.println("What is the radius of your circle?");
		r = keyboard.nextDouble();
	
		calcArea();
		print();
	}
	
	public static void calcArea()
	{
		area = (3.14*(Math.pow(r, 2)));
	}
	
	public static void print()
	{
		System.out.printf("The area of a circle with a radius  " + r + " is %5.5f . ", area);
	}
}
