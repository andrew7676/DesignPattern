package com.andrew.pattern0202.decorator.modal03;

public class ChickenBurger extends Humburger {

	public ChickenBurger(){
		name = "���ȱ�";
	}
	
	@Override
	public double getPrice() {
		return 10;
	}
}
