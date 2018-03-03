import java.util.Scanner;
class OddEven
{ 
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Please enter the number");
int no=sc.nextInt();
if(no%2==0)
System.out.println(no+" is even number");
else
System.out.println(no+" is odd number");

System.out.println("Thank you");
}
}
