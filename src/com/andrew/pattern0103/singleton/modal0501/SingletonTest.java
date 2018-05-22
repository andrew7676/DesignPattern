package com.andrew.pattern0103.singleton.modal0501;

import java.io.Serializable;

/**
 * 5.序列化与反序列化的单例模式
 * (1)未使用readResolve方法的单例模式
 * 线程不安全
 * 序列号对象的hashCode和反序列化后得到的对象的hashCode值不一样，说明反序列化后返回的对象是重新实例化的，单例被破坏了
 * 
 * @author andrew
 * @date 2018/04/23
 */
public class SingletonTest implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	// 内部类
	private static class SingletonTestHandler{
		private static SingletonTest instance = new SingletonTest();
	}
	
	private SingletonTest() {}
	
	public static SingletonTest getInstance() {
		return SingletonTestHandler.instance;
	}
	
}
