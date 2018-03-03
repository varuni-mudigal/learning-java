
public class User_Game {
	Weapon pressButton(){
		 java.util.Random r=new java.util.Random();
		 int option=r.nextInt(3);
		 if(option==0){
			 Gun g=new Gun();
			 System.out.println("Gun is invoked");
			 return g;
		 }
		 else if(option==1){
			 Bomb b=new Bomb();
			 System.out.println("Bomb is invoked");
			 return b;
		 }
		 else {
			 //Knife k=new Knife();
			 System.out.println("Knife is invoked");
			 return new Knife();
		 }
	}
	

}
