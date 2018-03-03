import java.util.Scanner;

//import java.util.Scanner;
public class Shop {
	String name="Garden Fresh";
	String place="Bengaluru";
	int carrotprice=50;

	Vegetable sell()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the vegetable available in shop[Tomato|Carrot|Cucumber]");
		String veg=s.next();
		s.close();
		if(veg.equals("Tomato")){
			Tomato t=new Tomato();
			System.out.println("Tomato is bought");
			System.out.println("Price is:"+t.price);
			return t;11
		} else if(veg.equals("Carrot")){
			Carrot c=new Carrot();
			System.out.println("Carrot is brought");
			System.out.println("Price is:"+this.carrotprice);
			return c;

		}else if(veg.equals("Cucumber")){
			Cucumber cu=new Cucumber();
			System.out.println("Cucumber is bought");
			System.out.println("Price is:"+cu.price);
			return cu;
		} else {
			//System.out.println("Vegetable not available");
			return null;
		}
	}

}
