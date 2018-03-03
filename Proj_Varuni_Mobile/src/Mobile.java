
public class Mobile {
	String model;
	int price;
	public static void main(String[] args) {

		Mobile m1=new Mobile();
		Mobile m2=new Mobile();
		Mobile m3=new Mobile();

		m1.model="iPhoneX";
		m1.price=65000;
		System.out.println("Phone model " + m1.model + "  costs " + m1.price);

		m2.model="Nokia";
		m2.price=3000;
		System.out.println("Phone model " + m2.model + " costs " + m2.price);

		m3.model="Samsung S8";
		m3.price=55000;
		System.out.println("Phone model " + m3.model + " costs " + m3.price);
	}
}