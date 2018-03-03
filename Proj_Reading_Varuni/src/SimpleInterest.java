import java.util.Scanner;
class SimpleInterest
{ 
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter Principle amount");
		int pa=sc.nextInt();
		System.out.println("Please enter time in years");
		int time=sc.nextInt();
		System.out.println("Please enter the rate of interest per annum");
		float ri=sc.nextFloat();
		float si=(pa*time*ri)/100;
		System.out.println("Simple Interest calculated is : "+si);

		System.out.println("Thank you");
	}
}


