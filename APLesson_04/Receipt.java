import java.util.Scanner;

public class Receipt
{
	public static void main (String[]args)
	{
		Receipt form = new Receipt();
	
		
		Scanner keyboard = new Scanner (System.in);
		
		System.out.println("Please enter item 1:");
		
		String item1 = keyboard.nextLine();
		
		System.out.println("Please enter the price:");
		
		double price1 = keyboard.nextDouble();
		
		
		form.format(item1, price1);
		
		
		System.out.println("Please enter item 2:");
		
		String item2 = keyboard.nextLine();
		
		System.out.println("Please enter the price:");
		
		double price2 = keyboard.nextDouble();
		
		
		form.format(item2, price2);
		
		
		System.out.println("Please enter item 3:");
		
		String item3 = keyboard.nextLine();
		
		System.out.println("Please enter the price:");
		
		double price3 = keyboard.nextDouble();
		
		
		form.format(item3, price3);
		
		
	}
	
	public void format(String item, double price)
	{
		System.out.printf("\n%10s  %10.2f", item, price);
	}
}