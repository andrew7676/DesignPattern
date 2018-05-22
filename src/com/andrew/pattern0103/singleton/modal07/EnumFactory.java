package com.andrew.pattern0103.singleton.modal07;

/**
 * 7.使用枚举数据类型实现单例模式
 * 线程安全
 * 枚举enum和静态代码块的特性相似，在使用枚举时，构造方法会被自动调用。
 * 
 * @author andrew
 * @date 2018/04/23
 */
public enum EnumFactory {
	
	singletonFactory;
	
	private SingletonTest instance;
	
	private EnumFactory(){
		// 枚举类的构造方法在类加载是被实例化  
        instance = new SingletonTest();  
    }
	
	public SingletonTest getInstance(){
		return instance;
	}
	
}

class SingletonTest {
	// 需要获实现单例的类，比如数据库连接Connection
	public SingletonTest(){}
}