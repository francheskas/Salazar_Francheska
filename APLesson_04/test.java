import java.util.Scanner;

public class test
{
	static int grade1, grade2;
	static int average;
	
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter grade 1:");
		grade1 = keyboard.nextInt();
		System.out.println("Enter grade 2:");
		grade2 = keyboard.nextInt();
		calcAvg();
		print();
	}
	
	public static void calcAvg()
	{
		average = ((grade1+grade2)/2);
	}
	
	public static void print()
	{
		System.out.println("The average of your grades is " + average);
	}
}