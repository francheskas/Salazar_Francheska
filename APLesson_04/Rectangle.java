import java.util.Scanner;

public class Rectangle
{
	static double l;
	static double w;
	static double perimeter;
	
	public static void main(String[]args)
	{
		Scanner keybaord = new Scanner (System.in);
		
		System.out.println("Enter the length of your reactangle:");
		l = keybaord.nextDouble();
		System.out.println("Enter the width of your rectangle:");
		w = keybaord.nextDouble();
		calcPerim();
		print();
	}
	
	public static void calcPerim()
	{
		perimeter= (l+w);
	}
	
	public static void print()
	{
		System.out.printf("Your rectangle is %5.5f ft around.", perimeter);
	}

}