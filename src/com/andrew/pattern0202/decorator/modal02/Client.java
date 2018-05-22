package com.andrew.pattern0202.decorator.modal02;

/**
 * 2.װ����ģʽ
 * 
 * @author andrew
 * @date 2018/05/08
 */
public class Client {
	public static void main(String[] args) {
		// �ڵ���
		Component component = new ConcreteComponent();
		// ������
		Component component2 = new ConcreteDecorator1(component);
		component2.doSomething();
		System.out.println("------------");
		// ������
		Component component3 = new ConcreteDecorator2(component2);
		component3.doSomething();
		System.out.println("------------");
		Component component11 = new ConcreteDecorator1(new ConcreteDecorator2(new ConcreteComponent()));
		component11.doSomething();
	}
}
