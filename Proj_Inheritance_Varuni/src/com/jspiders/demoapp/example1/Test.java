package com.jspiders.demoapp.example1;

public class Test {
	public static void main(String[] args) {
		
		TextBox tb=new TextBox();
		tb.id="fn";
		tb.label="First Name";
		tb.click();
		tb.onMouseOver();
		tb.enterData();
		tb.clearData();
		
		TextArea ta=new TextArea();
		ta.column=10;
		ta.row=5;
		ta.id="ad";
		ta.label="Address";
		ta.onMouseOver();
		ta.enterData();
		ta.click();
		ta.clearData();
		
	}

}
