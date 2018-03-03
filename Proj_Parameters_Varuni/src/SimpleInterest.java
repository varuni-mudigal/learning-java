
public class SimpleInterest {
	double findSimpleInterest(double p,double t,double r)
	{
		double si=(p*t*r)/100;
		return si;
	}
	public static void main(String[] args) {
		SimpleInterest s=new SimpleInterest();
		double si=s.findSimpleInterest(30000, 2, 7.5);
				System.out.println("Simple Interest Calculated is: "+si);
	}

}
