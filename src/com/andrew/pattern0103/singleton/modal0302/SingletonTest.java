package com.andrew.pattern0103.singleton.modal0302;

/**
 * 3.线程安全的懒汉式单例模式
 * (2)使用同步代码块
 * 线程安全
 * 懒汉式单例是指在方法调用获取实例时才创建实例。
 * 为了保证线程安全，提高同步锁效率，使用同步代码块实现
 * 
 * @author andrew
 * @date 2018/04/23
 */
public class SingletonTest {
	
	private static SingletonTest instance = null;
	
	private SingletonTest() {}
	
	public static SingletonTest getInstance() {
		// 应当在创建实例之前可能会有一些准备性的耗时工作，并使用synchronized同步代码块来提高效率
		try {
			synchronized (SingletonTest.class) {
				if (null != instance) {
				} else {
					Thread.sleep(300);
					instance = new SingletonTest();
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return instance;
	}
	
}
