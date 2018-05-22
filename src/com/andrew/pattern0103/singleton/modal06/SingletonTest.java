package com.andrew.pattern0103.singleton.modal06;

/**
 * 6.使用static代码块实现模式
 * 线程安全
 * 静态代码块中的代码在使用类的时候就已经执行了，所以可以应用静态代码块的这个特性的实现单例设计模。
 * 
 * @author andrew
 * @date 2018/04/23
 */
public class SingletonTest {
	
	private static SingletonTest instance = null;
	
	private SingletonTest(){};
	
	static {
		instance = new SingletonTest();
	}
	
	public static SingletonTest getInstance() {
		return instance;
	}
	
}
