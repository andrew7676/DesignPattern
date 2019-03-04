package com.andrew.pattern0202.decorator.modal03;

public class Test {
	public static void main(String[] args) {
		Humburger humburger = new ChickenBurger();
		System.out.println(humburger.getName() + "  ��Ǯ��" + humburger.getPrice());
		Lettuce lettuce = new Lettuce(humburger);
		System.out.println(lettuce.getName() + "  ��Ǯ��" + lettuce.getPrice());
		Chilli chilli = new Chilli(humburger);
		System.out.println(chilli.getName() + "  ��Ǯ��" + chilli.getPrice());
		Chilli chilli2 = new Chilli(lettuce);
		System.out.println(chilli2.getName() + "  ��Ǯ��" + chilli2.getPrice());
	}
}