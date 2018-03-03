
public class TokenMachine {

	Token pressButton()
	{
		Token t= new Token();
		t.printToken();
		return t; 
	}
	public static void main(String[] args) {
		TokenMachine t1=new TokenMachine();
		t1.pressButton();
	}

}
