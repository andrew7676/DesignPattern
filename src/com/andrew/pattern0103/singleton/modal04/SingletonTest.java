package com.andrew.pattern0103.singleton.modal04;

/**
 * 4.ʹ�þ�̬������ʵ�ֵ���ģʽ	
 * �̰߳�ȫ
 * 
 * @author andrew
 * @date 2018/04/23
 */
public class SingletonTest {
	
	// �ڲ���
	private static class SingletonTestHandler{
		private static SingletonTest instance = new SingletonTest();
	}
	
	private SingletonTest() {}
	
	public static SingletonTest getInstance() {
		return SingletonTestHandler.instance;
	}
	
}
