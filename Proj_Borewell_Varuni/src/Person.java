
public class Person {
	public static void main(String[] args) {
		BoreWell bw=new BoreWell();
		Water wt=bw.pump();
		System.out.println("Wt "+wt);
		System.out.println(wt.type);
	}
}
