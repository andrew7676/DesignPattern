package com.andrew.pattern0103.singleton.modal0502;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 5.序列化与反序列化的单例模式
 * (2)使用readResolve方法的单例模式
 * 线程不安全
 * readResolve方法在反序列化时会被调用，实现反序列化
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
	
	// 该方法在反序列化时会被调用，该方法不是接口定义的方法，有点儿约定俗成的感觉
	protected Object readResolve() throws ObjectStreamException {  
        System.out.println("调用了readResolve方法！");  
        return SingletonTestHandler.instance;   
    }
}
