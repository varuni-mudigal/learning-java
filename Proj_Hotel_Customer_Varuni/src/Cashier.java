public class Cashier {
	Token giveToken(Money m)
	{
		
		Token t=new Token();
		t.cost=30;
		t.foodType="Dosa";
		t.quantity="1 Plate";
	
		System.out.println("Token for following food is given to Customer: "+t.quantity+" of "+t.foodType+" of cost "+t.cost);
		return t;
		
	}
}
