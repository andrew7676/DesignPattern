package com.andrew.pattern0103.singleton.modal0301;

/**
 * 3.线程安全的懒汉式单例模式
 * (1)使用同步锁机制synchronized
 * 线程安全
 * 懒汉式单例是指在方法调用获取实例时才创建实例。
 * 为了保证线程安全，要使用同步锁机制，在方法中声明synchronized关键字
 * 
 * @author andrew
 * @date 2018/04/23
 */
public class SingletonTest {
	
	private static SingletonTest instance = null;
	
	private SingletonTest() {}
	
	public synchronized static SingletonTest getInstance() {
		// 应当在创建实例之前可能会有一些准备性的耗时工作，并声明同步锁synchronized关键字
		// 但是这种方法效率很低
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
