package CusomConstructor;

public class FileName {
	String name;
	double size;
	public FileName(String nm)
	{
		this.name=nm;
	}
	public static void main(String[] args) {
		FileName fn=new FileName("Data.txt");
		System.out.println(fn.name);
	}
}
