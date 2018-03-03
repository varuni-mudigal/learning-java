import java.util.Scanner;
class FindMiddleNumber
{ 
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter 3 numbers");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		String ar[]={};
		if (n1>n2 && n1<n3||n1<n2 && n1>n3)
			System.out.println(n1+" is the middle number");
		else if(n2>n1 && n2<n3||n2>n3&&n2<n1)
			System.out.println(n2+" is the middle number");
		else
			System.out.println(n3+" is the middle number");

		System.out.println("Thank you");
	}
}


