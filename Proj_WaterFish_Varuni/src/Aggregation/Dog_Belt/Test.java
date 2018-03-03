package Aggregation.Dog_Belt;

public class Test {
	public static void main(String[] args) {
		Pendant pd=new Pendant();
		Belt bt=new Belt();
		Dog d=new Dog();
		d.b=bt;
		d.b.p=pd; //bt.p=pd;
		pd.type="Gold";
		d.b.type="Leather";
		d.bark();
		System.out.println("Model of the pendant is "+d.b.p.model);

	}

}
