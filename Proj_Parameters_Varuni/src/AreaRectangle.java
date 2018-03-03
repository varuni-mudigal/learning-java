
public class AreaRectangle {

	double findAreaRectangle(double x,double y)
	{
		double area=x*y;
		return area;
	}
	public static void main(String[] args) {
		AreaRectangle a=new AreaRectangle();
		double var=a.findAreaRectangle(20, 65.3);
		System.out.println("Area of Rectangle is: "+var);
	}
}
