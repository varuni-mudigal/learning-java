
public class Customer {
	public static void main(String[] args) {
		String name="Varuni";
		Shop sh=new Shop();
		sh.sell();
		System.out.println("Customer "+name+" has bought vegetables from the shop '"+sh.name+"' from "+sh.place);
	}

}
