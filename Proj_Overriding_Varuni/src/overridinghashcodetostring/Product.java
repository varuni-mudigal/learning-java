package overridinghashcodetostring;

public class Product {
	String barcode;
	double price;
	
	@Override
	public String toString() {
		return this.barcode+"   "+this.price;
	}
	
	@Override
	public int hashCode() {
		int bc=this.barcode.hashCode();
		return bc;
	}
	
	public static void main(String[] args) {
		Product p=new Product();
		System.out.println(p);
		//System.out.println(p.hashCode()); NULL.HASHCODE IS ALWAYS A NULL POINTER EXCEPTION
	
		p.barcode="31245";
		p.price=3753.543;
		System.out.println(p);
		System.out.println(p.hashCode());
	}

}
