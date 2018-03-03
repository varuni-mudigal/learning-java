public class Customer {
	Token getToken()
	{
		Money m=new Money();
		Cashier c=new Cashier();
		Token tkn=c.giveToken(m);
		System.out.println("Customer has collected the token");
		return tkn;
	}
}
