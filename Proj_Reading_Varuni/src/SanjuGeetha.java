import java.util.Scanner;
public class SanjuGeetha {

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a number");
		int num=sc.nextInt();
		if (num%3==0 && num%5==0)
			System.out.println("Sanju weds Geetha");
		else if (num%3==0)
			System.out.println("Sanju");
		else if (num%5==0)
			System.out.println("Geetha");
		else
			System.out.println("Number"+num+" is not devisible by either 3 or 5" );

	}
}