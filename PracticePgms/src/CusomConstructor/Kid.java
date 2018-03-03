package CusomConstructor;

public class Kid {
	void eat(Chocolate c)
	{
		System.out.println(c);
	}
	public static void main(String[] args) {
		Chocolate ch=new Chocolate();
		System.out.println(ch);
		Kid k=new Kid();
		k.eat(ch);
	}
}
