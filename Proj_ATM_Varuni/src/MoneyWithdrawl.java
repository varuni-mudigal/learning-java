import java.util.Scanner;
public class MoneyWithdrawl {
	Scanner sc=new Scanner(System.in);

	ATMMachine cashWithdraw()

	{
		ATMMachine am=new ATMMachine();

		System.out.println("Please enter the PIN ");
		am.pin=sc.nextInt();
		System.out.println("Please enter the amount " );
		am.amount=sc.nextInt();
		System.out.println("For the card type "+am.cardType+" amount "+am.amount+" is dispatched");
		return am;
	}

	public static void main(String[] args) {
		MoneyWithdrawl mw=new MoneyWithdrawl();
		mw.cashWithdraw();

	}

}
