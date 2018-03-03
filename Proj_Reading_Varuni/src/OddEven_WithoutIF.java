import java.util.Scanner;
class OddEven_withoutModulus
{ 
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String st[]={"Even","Odd"};
		System.out.println("Please enter the number");
		int no=sc.nextInt();

		System.out.println(no+" is " +st[no%2]+" Number");

		//with bit operators

		if ((no&1)==0)

			System.out.println("Number is even");
		else
			System.out.println("Number is odd");
		
		//without if and with bit operators
		
		System.out.println(no + "is "+st[no&1]+"Number");

		System.out.println("Thank you");
	}
}
