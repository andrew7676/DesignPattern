package com.andrew.pattern0103.singleton.modal04;

/**
 * 4.使用静态内置类实现单例模式	
 * 线程安全
 * 
 * @author andrew
 * @date 2018/04/23
 */
public class SingletonTest {
	
	// 内部类
	private static class SingletonTestHandler{
		private static SingletonTest instance = new SingletonTest();
	}
	
	private SingletonTest() {}
	
	public static SingletonTest getInstance() {
		return SingletonTestHandler.instance;
	}
	
}
