import java.util.Scanner;

public class Average

{
	static double num1;
    static double num2;
    static double num3;

    public static void main (String[]args)
	{
		System.out.println("What is your first number?");
		num1 = keybaord.nextDouble();
		
		System.out.println("What is your second number?");
		num2 = keybaord.nextDouble();
		
		System.out.println("What is your third number?");
		num3 = keybaord.nextDouble();
		
		calcAvg();
		print();
	}
	
	public static void calcAvg()
	{
		average = ((num1+num2+num3)/2);
	}
	
	public static void print()
	{
		System.out.printf("The average of " + num1 + ", " + num2 +"and %5.5f ft around.", perimeter);
	}
}


