import java.util.Scanner;
public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a number");
		int n=sc.nextInt();
		final int no=n;
		n=no+0;
		System.out.println(no+"*1="+n);
		n=n+no;
		System.out.println(no+"*2="+n);
		n=n+no;
		System.out.println(no+"*3="+n);
		n=n+no;
		System.out.println(no+"*4="+n);
		n=n+no;
		System.out.println(no+"*5="+n);
		n=n+no;
		System.out.println(no+"*6="+n);
		n=n+no;
		System.out.println(no+"*7="+n);
		n=n+no;
		System.out.println(no+"*8="+n);
		n=n+no;
		System.out.println(no+"*9="+n);
		n=n+no;
		System.out.println(no+"*10="+n);

		int n1=no;

		System.out.println(n1+"*"+1+"="+n1*1);
		System.out.println(n1+"*"+2+"="+n1*2);
		System.out.println(n1+"*"+3+"="+n1*3);
		System.out.println(n1+"*"+4+"="+n1*4);
		System.out.println(n1+"*"+5+"="+n1*5);
		System.out.println(n1+"*"+6+"="+n1*6);
		System.out.println(n1+"*"+7+"="+n1*7);
		System.out.println(n1+"*"+8+"="+n1*8);
		System.out.println(n1+"*"+9+"="+n1*9);
		System.out.println(n1+"*"+10+"="+n1*10);

		for(int i=1;i<=10;i++)
		{
			System.out.println(n1+"*"+i+"="+n1*i);
		}



	}

}


