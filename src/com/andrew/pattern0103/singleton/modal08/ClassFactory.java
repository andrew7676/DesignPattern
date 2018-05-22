package com.andrew.pattern0103.singleton.modal08;

/**
 * 8.完善使用enum枚举实现单例模式
 * 线程安全
 * 不暴露枚举类实现细节
 * 
 * @author andrew
 * @date 2018/04/23
 */
public class ClassFactory {
	
	private enum EnumSingletonTest {
		
		singletonFactory;
		
		private SingletonTest instance;
		
		private EnumSingletonTest() {
			// 枚举类的构造方法在类加载是被实例化
			instance = new SingletonTest();
		}
		
		public SingletonTest getInstance(){
			return instance;
		}
	}
	
	public static SingletonTest getInstance(){  
        return EnumSingletonTest.singletonFactory.getInstance();  
    }
}

class SingletonTest {
	// 需要获实现单例的类，比如数据库连接Connection
	public SingletonTest(){};
}
