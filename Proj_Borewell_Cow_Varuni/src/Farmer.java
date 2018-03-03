
public class Farmer {
	void feedWaterToCow(){
		System.out.println("Farmer goes to borewell to pump");
		Borewell bw=new Borewell();
		Water w=bw.pumpBorewell();
		System.out.println("Farmer collects water");


		Cow c= new Cow();
		System.out.println("farmer feeds water to cow");
		c.drinkWater(w);

	}
	public static void main(String[] args) {
		Farmer f=new Farmer();
		f.feedWaterToCow();
	}



}   
