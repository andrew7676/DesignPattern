package com.andrew.pattern0202.decorator.modal02;

public class ConcreteDecorator1 extends Decorator {
	public ConcreteDecorator1(Component component){
		super(component);
	}
	@Override
	public void doSomething(){
		super.doSomething();
		this.doAnotherThing();
	}
	private void doAnotherThing(){
		System.out.println("¹¦ÄÜ1");
	}

}
