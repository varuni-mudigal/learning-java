import java.util.Scanner;
class Sum_Average
{ 
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter 4 numbers");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		int n4=sc.nextInt();
		
		int sum=n1+n2+n3+n4;
		float average=sum/4;
		
		System.out.println("Sum of 4 numbers entered is:"+sum+" and average of 4 numbers is "+average);

		System.out.println("Thank you");
	}
}


