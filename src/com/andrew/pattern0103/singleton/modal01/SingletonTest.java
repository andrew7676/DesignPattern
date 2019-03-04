package com.andrew.pattern0103.singleton.modal01;

/**
 * 1.����ʽ����ģʽ
 * �̰߳�ȫ
 * ����ʽ������ָ�ڷ�������ǰ��ʵ�����Ѿ��������ˡ�
 * 
 * @author andrew
 * @date 2018/04/23
 */
public class SingletonTest {
	
	private static SingletonTest instance = new SingletonTest();
	
	private SingletonTest(){};
	
	public static SingletonTest getInstance() {
		return null;
	}
}
