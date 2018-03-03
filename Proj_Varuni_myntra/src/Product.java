
public class Product {
	String type= "Shoe";
	int price=1399;
	int discount=65;
	int size=7;

	public static void main(String[] args) {
		Product p1= new Product();
		Product p2 = new Product();
		System.out.println("Objects created");
		System.out.println(p1);
		p1=new Product();
		System.out.println(p1);
	}
}
