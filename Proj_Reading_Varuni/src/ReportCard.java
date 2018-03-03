import java.util.Scanner;

public class ReportCard {
	public static void main(String[] args) {
		Scanner rc=new Scanner(System.in);
		System.out.println("Enter Name:");
		String name=rc.nextLine();
		System.out.println("Enter Roll no:"); 
		int rollno=rc.nextInt();
		System.out.println("Enter Physics number:");
		int phy=rc.nextInt();
		System.out.println("Enter Chemistry number:");
		int che=rc.nextInt();
		System.out.println("Enter Maths number:");
		int mat=rc.nextInt();
		System.out.println("Enter Biology number:");
		int bio=rc.nextInt();
		int total=phy+che+mat+bio;
		double per=total/4.0;
		String Result;

		if(phy>100||che>100||mat>100||bio>100)
		{	Result="Invalid";
		System.out.println("Final Result:Invalid Marks Entry");
		}
		else 
		{
			if(phy<40||che<40||mat<40||bio<40)
				Result="Fail";
			else if(per>=85)
				Result="Distinction";
			else if(per>=60)
				Result="First Class";
			else if (per>=50)
				Result="Second Class";
			else 
				Result="Pass";

			System.out.println("<---------Report Card--------->");
			System.out.println("Name:"+name);
			System.out.println("Roll Number:"+rollno);
			System.out.println("-----------------------------");
			System.out.println("Sub     Max     Min    Scored");
			System.out.println("-----------------------------");
			System.out.println("phy     100     40     "+phy);
			System.out.println("che     100     40     "+che);
			System.out.println("mat     100     40     "+mat);
			System.out.println("bio     100     40     "+bio);
			System.out.println("-----------------------------");
			System.out.println("Total   400     160    "+total);

			System.out.println("Student Name:"+name);
			System.out.println("Percentage:"+per);
			System.out.println("Final Result:"+Result);
		}


	}
}
