import java.util.Scanner;

public class Compound_Interest
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the interest rate:");
		double rate = keyboard.nextDouble();
		
		System.out.println("Enter the amount you inetend to borrow:");
		double principal = keyboard.nextDouble();
		
		System.out.println("Enter the number of times the loan is compounded per year:");
		double number = keyboard.nextDouble();
	
		System.out.println("Enter the life of the loan in years:");
		double time = keyboard.nextDouble();
		
		
		Compound_Interest payment = new Compound_Interest();
		System.out.println("Your monthly payment will be " + payment(rate, principal, number, time));
	}
	
	public static double payment(double r, double p, double n, double t)
	{
		 return(p *(Math.pow(1+(r/n), n*t)));
		 
	}
}