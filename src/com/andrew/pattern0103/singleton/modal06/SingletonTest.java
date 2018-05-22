package com.andrew.pattern0103.singleton.modal06;

/**
 * 6.ʹ��static�����ʵ��ģʽ
 * �̰߳�ȫ
 * ��̬������еĴ�����ʹ�����ʱ����Ѿ�ִ���ˣ����Կ���Ӧ�þ�̬������������Ե�ʵ�ֵ������ģ��
 * 
 * @author andrew
 * @date 2018/04/23
 */
public class SingletonTest {
	
	private static SingletonTest instance = null;
	
	private SingletonTest(){};
	
	static {
		instance = new SingletonTest();
	}
	
	public static SingletonTest getInstance() {
		return instance;
	}
	
}
