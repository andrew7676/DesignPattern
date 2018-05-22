package com.andrew.pattern0103.singleton.modal0202;

/**
 * 2.懒汉式单例模式
 * (2)有间隔的懒汉式单例模式
 * 线程不安全
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
		// 应当在创建实例之前可能会有一些准备性的耗时工作
		// 但是仍然无法保证单例的线程安全
		try {
			if (null != instance) {
			} else {
				Thread.sleep(300);
				instance = new SingletonTest();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return instance;
	}
	
}
