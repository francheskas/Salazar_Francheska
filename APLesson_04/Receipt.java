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
		keyboard.nextLine(); //eats the extra return 
		
		System.out.println("Please enter item 2:");
		String item2 = keyboard.nextLine();
		System.out.println("Please enter the price:");
		double price2 = keyboard.nextDouble();
		keyboard.nextLine();
		
		System.out.println("Please enter item 3:");
		String item3 = keyboard.nextLine();
		System.out.println("Please enter the price:");
		double price3 = keyboard.nextDouble();

		double subTotal = price1+price2+price3;
		double tax = subTotal*0.075;
		double total = tax+subTotal;
		
		System.out.println("<<<<<<<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>>>>>>>"); 
		
		form.format(item1,price1);
		form.format(item3, price3);
		form.format(item2, price2);
		System.out.println("\n");
		form.format("Subtotal", subTotal);
		form.format("Tax:", tax);
		form.format("Total:",total);
		
		System.out.println("_______________________________________________________");
		System.out.println("*Thank you for your support*");
		
	}
	
	public void format(String item, double price)
	{
		System.out.printf("* %17s ........ %17.2f\n", item, price);
	}
	
}