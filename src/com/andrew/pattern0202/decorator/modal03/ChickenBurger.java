package com.andrew.pattern0202.decorator.modal03;

public class ChickenBurger extends Humburger {

	public ChickenBurger(){
		name = "º¶Õ»±§";
	}
	
	@Override
	public double getPrice() {
		return 10;
	}
}
