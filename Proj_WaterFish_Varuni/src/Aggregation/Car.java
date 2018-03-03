package Aggregation;

public class Car {
	String model="Swift";
	String color="Red";
	MusicSystem ms;
	void start()
	{
		System.out.println("Car is started with music ON");
	} 

	public static void main(String[] args) {
		MusicSystem m=new MusicSystem();
		System.out.println(m.make+" "+m.price);
		Car c=new Car();
		c.ms=m;
		c.ms.make="Honda";
		c.ms.price=35000;

		c.start();
		c.ms.playMusic();

		DVD d1=new DVD();

		c.ms.d=d1;
		//d1.songSelect();
		c.ms.d.songSelect();
		System.out.println("Music System has DVD with title "+d1.title+" and size "+c.ms.d.size+"GB");


		//System.out.println(c.ms.make+" "+c.ms.price);


	}

}
