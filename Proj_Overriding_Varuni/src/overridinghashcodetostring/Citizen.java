package overridinghashcodetostring;

public class Citizen {
	long aadharNum;
	String name;
	
	@Override
	public int hashCode() {
		Long wl=this.aadharNum;
		return wl.hashCode();
	}
	
	@Override
	public String toString() {
		return this.name;//+"   "+this.aadharNum;
	}
	
	public static void main(String[] args) {
		Citizen c=new Citizen();
		System.out.println(c);
		System.out.println(c.hashCode());
		c.aadharNum=37985;
		c.name="Varuni";
		System.out.println(c);
		System.out.println(c.hashCode());
	}

}
