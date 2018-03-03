
public class VendingMachine {

	//public static void main(String[] args) {
	Drink pressButton(){

		java.util.Random r=new java.util.Random();



		int option=r.nextInt(3);
		if(option==0)
		{
			Coffee cf=new Coffee();
			System.out.println("Coffee is Ready");
			return cf;
		}
		else if(option==1)
		{
			Tea t=new Tea();
			System.out.println("Tea is ready");
			return t;
		}
		else
		{
			Milk m=new Milk();
			System.out.println("Milk is ready");
			return m;
		}
	}
}
