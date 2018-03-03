import java.util.Scanner;
public class MainRunner {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Please enter your age");
	int age=sc.nextInt();
	if(age>=18)
		System.out.println("Person with age "+age+" is eligible to vote");
	else
		System.out.println("Person with age "+age+" is not eligible to vote");
	 
	System.out.println("Thank you..");
}
}

