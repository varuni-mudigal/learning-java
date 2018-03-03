import java.util.Scanner;
class AreaCircle
{ 
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the Radius");
		float r=sc.nextFloat();
		final double PIE=3.142;
		double area=PIE*r*r;
		System.out.println("Area of a circle is : "+area);

		System.out.println("Thank you");
	}
}
