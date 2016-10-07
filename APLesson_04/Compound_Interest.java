import java.util.Scanner;

public class Compound_Interest
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the interest rate:");
		double r = keyboard.nextDouble();
		
		System.out.println("Enter the amount you inetend to borrow:");
		double P = keyboard.nextDouble();
		
		System.out.println("Enter the number of times the loan is compounded per year:");
		int n = keyboard.nextInt();
	
		System.out.println("Enter the life of the loan in year:");
		int t = keyboard.nextInt();
		
	}
}