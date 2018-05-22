package com.andrew.pattern0103.singleton.modal0303;

/**
 * 3.�̰߳�ȫ������ʽ����
 * (3)ʹ��ͬ�������(���ĳЩ��Ҫ�Ĵ�����е�����ͬ����������ȫ������ͬ��)
 * �߳̿��ܲ���ȫ
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
		try {
			if (null != instance) {
			} else {
				Thread.sleep(300);
				// Ӧ���ڴ���ʵ��֮ǰ���ܻ���һЩ׼���Եĺ�ʱ��������ʹ��synchronizedͬ������������Ч��,����ֻͬ��һ����
				synchronized (SingletonTest.class) {
					instance = new SingletonTest();	
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return instance;
	}
	
}
