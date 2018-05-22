package com.andrew.pattern0103.singleton.modal0304;

/**
 * 3.�̰߳�ȫ������ʽ����
 * (4).˫��������Ƶ���(�Ƽ�)
 * <1>����DCL��˫�������
 * <2>ʹ��volatile�ؼ��ֱ���ɼ���
 * �̰߳�ȫ
 * 
 * @author andrew
 * @date 2018/04/23
 */
public class SingletonTest {
	
	// ʹ��volatile�ؼ��ֱ���ɼ���
	volatile private static SingletonTest instance = null;
	
	private SingletonTest() {}
	
	public static SingletonTest getInstance() {
		try {
			if (null != instance) {
			} else {
				Thread.sleep(300);
				// Ӧ���ڴ���ʵ��֮ǰ���ܻ���һЩ׼���Եĺ�ʱ��������ʹ��synchronizedͬ������������Ч��,����ֻͬ��һ����
				synchronized (SingletonTest.class) {
					// ��ʵ����֮ǰ���ж��μ��
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
