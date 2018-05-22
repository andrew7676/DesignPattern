package com.andrew.pattern0103.singleton.modal0303;

/**
 * 3.线程安全的懒汉式单例
 * (3)使用同步代码块(针对某些重要的代码进行单独的同步，而不是全部进行同步)
 * 线程可能不安全
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
		try {
			if (null != instance) {
			} else {
				Thread.sleep(300);
				// 应当在创建实例之前可能会有一些准备性的耗时工作，并使用synchronized同步代码块来提高效率,但是只同步一部分
				synchronized (SingletonTest.class) {
					instance = new SingletonTest();	
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return instance;
	}
	
}
