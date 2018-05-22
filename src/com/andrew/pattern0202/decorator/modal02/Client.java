package com.andrew.pattern0202.decorator.modal02;

/**
 * 2.装饰着模式
 * 
 * @author andrew
 * @date 2018/05/08
 */
public class Client {
	public static void main(String[] args) {
		// 节点流
		Component component = new ConcreteComponent();
		// 过滤流
		Component component2 = new ConcreteDecorator1(component);
		component2.doSomething();
		System.out.println("------------");
		// 过滤流
		Component component3 = new ConcreteDecorator2(component2);
		component3.doSomething();
		System.out.println("------------");
		Component component11 = new ConcreteDecorator1(new ConcreteDecorator2(new ConcreteComponent()));
		component11.doSomething();
	}
}
