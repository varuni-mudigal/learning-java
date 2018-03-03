
public class Bird {
	String type;
	
	void fly()
	{
		System.out.println(this.type+" bird flying");
	}
	public static void main(String[] args) {
		Bird b1=new Bird(); 
		b1.type="Parrot";
		Bird b2=new Bird();
		b2.type="Pigeon";
		Bird b3=new Bird();
		b3.type="Humming";
		
		b3.fly();
	}

}
