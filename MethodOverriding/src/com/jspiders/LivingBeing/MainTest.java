package com.jspiders.LivingBeing;

public class MainTest {
	
	public static void main(String[] args) {
		
		LivingBeing lb=new LivingBeing();
		Cow c=new Cow();
		Crocodile cd=new Crocodile();
		Snake s=new Snake();
		lb.eat();
		c.eat();
		cd.eat();
		s.eat();
	}

}
