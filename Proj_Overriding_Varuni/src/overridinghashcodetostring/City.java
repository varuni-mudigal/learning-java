package overridinghashcodetostring;

public class City {
	int pincode;
	String name;
	
	@Override
	public String toString() {
		String msg=this.name+"   "+this.pincode;
		return msg;
		
	}
	
	@Override
	public int hashCode() {
		int pin=this.pincode;
		return pin;
	}
	public static void main(String[] args) {
		City c=new City();
		c.name="Bengaluru";
		c.pincode=560001;
		System.out.println(c);
		System.out.println(c.hashCode());
		
	}

}
