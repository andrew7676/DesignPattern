package com.andrew.pattern0202.decorator.modal02;

public class Decorator implements Component {
	private Component component;
	public Decorator(Component component){
		this.component = component;
	}
	@Override
	public void doSomething(){
		component.doSomething();
	}
}
