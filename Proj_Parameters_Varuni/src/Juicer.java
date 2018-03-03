
public class Juicer {
	Juice makeJuice(Milk m,Fruit f)
	{
		Juice j=new Juice();
		System.out.println("Juice is prepared using milk and fruit");
		return j;
	}
	public static void main(String[] args) {
		Juicer jc=new Juicer();
		Milk m=new Milk();
		Fruit f=new Fruit();
		Juice j=jc.makeJuice(m, f);
		System.out.println("Juicer has prepared nice milkshake of  "+f.type);
	}

}
