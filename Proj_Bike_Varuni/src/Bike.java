
public class Bike {
	Smoke startCar()
	{
		Smoke s=new Smoke();
		s.omitSmoke();
		return s;
	}
	public static void main(String[] args) {
		Bike b=new Bike();
		b.startCar();
	}
}
