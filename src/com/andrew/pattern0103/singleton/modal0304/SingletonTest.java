package com.andrew.pattern0103.singleton.modal0304;

/**
 * 3.线程安全的懒汉式单例
 * (4).双检查锁机制单例(推荐)
 * <1>采用DCL的双检查锁机
 * <2>使用volatile关键字保其可见性
 * 线程安全
 * 
 * @author andrew
 * @date 2018/04/23
 */
public class SingletonTest {
	
	// 使用volatile关键字保其可见性
	volatile private static SingletonTest instance = null;
	
	private SingletonTest() {}
	
	public static SingletonTest getInstance() {
		try {
			if (null != instance) {
			} else {
				Thread.sleep(300);
				// 应当在创建实例之前可能会有一些准备性的耗时工作，并使用synchronized同步代码块来提高效率,但是只同步一部分
				synchronized (SingletonTest.class) {
					// 在实例化之前进行二次检查
					if (null == instance) {
						instance = new SingletonTest();		
					}
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return instance;
	}
	
}
