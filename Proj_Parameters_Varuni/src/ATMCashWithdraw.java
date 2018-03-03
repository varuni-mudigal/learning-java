
public class ATMCashWithdraw {
	Cash withdraMoney(Card c,int pin,double amount)
	{
		Cash c1=new Cash();
		return c1;
	}
	public static void main(String[] args) {
		ATMCashWithdraw atm=new ATMCashWithdraw();
		Card c1=new Card(); 
		atm.withdraMoney(c1,1234,25000);
		System.out.println("Customer has card type "+c1.cardtype+" with PIN number 1234 and withdrew 25000");
	}

}
