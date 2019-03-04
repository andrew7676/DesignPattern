package com.andrew.pattern0103.singleton.modal01;

/**
 * 1.饿汉式单例模式
 * 线程安全
 * 饿汉式单例是指在方法调用前，实例就已经创建好了。
 * 
 * @author andrew
 * @date 2018/04/23
 */
public class SingletonTest {
	
	private static SingletonTest instance = new SingletonTest();
	
	private SingletonTest(){};
	
	public static SingletonTest getInstance() {
		return instance;
	}
}
