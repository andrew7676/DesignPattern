package com.andrew.pattern0103.singleton.modal0201;

/**
 * 2.����ʽ����ģʽ
 * (1)������ʽ����ģʽ
 * �߳̿��ܲ���ȫ
 * ����ʽ������ָ�ڷ������û�ȡʵ��ʱ�Ŵ���ʵ����
 * 
 * @author andrew
 * @date 2018/04/23
 */
public class SingletonTest {
	
	private static SingletonTest instance = null;
	
	private SingletonTest() {}
	
	public static SingletonTest getInstance() {
		// ��������޷��ڶ��߳��±�֤ʵ����Ψһ��
		if (null == instance) {
		 	instance = new SingletonTest();
		}
		return instance;
	}
}
