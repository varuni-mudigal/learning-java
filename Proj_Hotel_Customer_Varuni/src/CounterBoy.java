public class CounterBoy {
	Food giveFood(Token tkn)
	{
		Food f=new Food();
		//System.out.println("Food is given to the customer");
		return f;
	}
	public static void main(String[] args) {
		Customer cus=new Customer();
		Token tkn1=cus.getToken();
		System.out.println("Customer has given the token to Counter boy");
		CounterBoy cb=new CounterBoy();
		cb.giveFood(tkn1);
		System.out.println("Counter Boy has given the food mentioned in the token to Customer");
		}
}
