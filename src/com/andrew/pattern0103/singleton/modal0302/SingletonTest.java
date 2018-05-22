package com.andrew.pattern0103.singleton.modal0302;

/**
 * 3.�̰߳�ȫ������ʽ����ģʽ
 * (2)ʹ��ͬ�������
 * �̰߳�ȫ
 * ����ʽ������ָ�ڷ������û�ȡʵ��ʱ�Ŵ���ʵ����
 * Ϊ�˱�֤�̰߳�ȫ�����ͬ����Ч�ʣ�ʹ��ͬ�������ʵ��
 * 
 * @author andrew
 * @date 2018/04/23
 */
public class SingletonTest {
	
	private static SingletonTest instance = null;
	
	private SingletonTest() {}
	
	public static SingletonTest getInstance() {
		// Ӧ���ڴ���ʵ��֮ǰ���ܻ���һЩ׼���Եĺ�ʱ��������ʹ��synchronizedͬ������������Ч��
		try {
			synchronized (SingletonTest.class) {
				if (null != instance) {
				} else {
					Thread.sleep(300);
					instance = new SingletonTest();
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return instance;
	}
	
}
