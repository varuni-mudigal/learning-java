
public class AreaofCircle {

	final double PIE=3.142;
	double areaCircle(double r)
	{
		double area=PIE*r*r;
		return area;
	}
	public static void main(String[] args) {
		AreaofCircle a=new AreaofCircle();
		//double var=a.areaCircle(4.5) ;
		System.out.println("Area of a Circle is : "+a.areaCircle(4.5));
	}
}
