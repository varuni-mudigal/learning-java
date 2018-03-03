import java.util.Scanner;
public class SumofNUsingMethod {
		int sumOfNaturalNos(int n)
		{ 
		int sum=0;
		int num=n;
		for(;n>0;n--)   //for(int i=1;1<=n;i++)
		{               //{
			sum=sum+n;  //sum=sum+i;
			
		}               //}
		return sum;
		//System.out.println("Sum of "+num+" numbers is: "+sum);
		} 
		public static void main(String[] args) {
			SumofNUsingMethod s=new SumofNUsingMethod();
			int sum1=s.sumOfNaturalNos(5);
			
			System.out.println("Sum of "+5+" numbers is: "+sum1);
			int sum2=s.sumOfNaturalNos(6);
			System.out.println("Sum of "+6+" numbers is: "+sum2);
            int sum3=s.sumOfNaturalNos(7);
            System.out.println("Sum of "+7+" numbers is: "+sum3);
		}

}
