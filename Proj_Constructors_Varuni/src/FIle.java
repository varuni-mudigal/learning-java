
public class FIle {
	String name;
	double size;

	FIle(String nm) 
	{
		this.name=nm;
	}

	public static void main(String[] args) {
		FIle f=new FIle("data.txt");
		System.out.println(f.name);
	}

}
