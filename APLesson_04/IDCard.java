import java.util.Scanner;

public class IDCard
{
	public static void main (String[]args)
	
	{
		IDCard form = new IDCard();
	
		Scanner keyboard = new Scanner (System.in);
	
		System.out.println("Enter your first name:");
		String name = keyboard.nextLine();
		
		System.out.println("Enter your last name:");
		String lastName = keyboard.nextLine();
		
		System.out.println("Enter your title:");
		String title = keyboard.nextLine();
		
		System.out.println("Enter the school site:");
		String site = keyboard.nextLine();
		
		System.out.println("Enter the school year:");
		String year = keyboard.nextLine(); 
		
		System.out.println("What is your subject?");
		String subject = keyboard.nextLine();
		
		System.out.println("***********************************");
		
		form.format(site, year);
		form.format(name, lastName);
		form.format(title, subject);
		
		System.out.println("***********************************");
	}
	
	public void format(String one, String two )
	{
		System.out.printf("* %13s %16s*\n", one, two);
	}
}