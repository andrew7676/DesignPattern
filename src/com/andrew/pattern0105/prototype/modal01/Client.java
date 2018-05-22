package com.andrew.pattern0105.prototype.modal01;

/**
 * 原型模式
 * 
 * @author andrew
 * @date 2018/05/14
 */
public class Client {
	public static void main(String[] args) {
		ConcretePrototype cp = new ConcretePrototype();
		for (int i = 0; i < 10; i++) {
			ConcretePrototype clonecp = (ConcretePrototype) cp.clone();
			clonecp.show();
		}
	}
}

class Prototype implements Cloneable {
	public Prototype clone() {
		Prototype prototype = null;
		try {
			prototype = (Prototype) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return prototype;
	}
}

class ConcretePrototype extends Prototype {
	public void show() {
		System.out.println("原型模式实现类");
	}
}