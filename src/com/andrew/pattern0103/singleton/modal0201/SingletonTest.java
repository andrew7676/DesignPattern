package com.andrew.pattern0103.singleton.modal0201;

/**
 * 2.懒汉式单例模式
 * (1)简单懒汉式单例模式
 * 线程可能不安全
 * 懒汉式单例是指在方法调用获取实例时才创建实例。
 * 
 * @author andrew
 * @date 2018/04/23
 */
public class SingletonTest {
	
	private static SingletonTest instance = null;
	
	private SingletonTest() {}
	
	public static SingletonTest getInstance() {
		// 下面代码无法在多线程下保证实例的唯一性
		if (null == instance) {
		 	instance = new SingletonTest();
		}
		return instance;
	}
}
