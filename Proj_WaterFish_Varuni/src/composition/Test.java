package composition;


public class Test {

	public static void main(String[] args) {
		Water w=new Water();
		System.out.println(w.f);
		System.out.println(w.f.type+" fish cannot live without water in "+w.type);
	}

}
