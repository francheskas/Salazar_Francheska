public class RetMethods
{
	public static void main (String[]args)
	{
		RetMethods avergae = new RetMethods();
		int n1 = 3;
		int n2 = 8;
		int n3 = 15;
		double avg = avergae.calcAvg(n1,n2,n3);
		System.out.printf("The volume of your cube is %10.2f\n", avg);
	}
	
	public double calcAvg(int one, int two, int three)
	{
		return (one+two+three)/3.0;
	}
}