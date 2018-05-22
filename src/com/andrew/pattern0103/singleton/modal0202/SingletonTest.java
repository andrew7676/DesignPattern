package com.andrew.pattern0103.singleton.modal0202;

/**
 * 2.����ʽ����ģʽ
 * (2)�м��������ʽ����ģʽ
 * �̲߳���ȫ
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
		// Ӧ���ڴ���ʵ��֮ǰ���ܻ���һЩ׼���Եĺ�ʱ����
		// ������Ȼ�޷���֤�������̰߳�ȫ
		try {
			if (null != instance) {
			} else {
				Thread.sleep(300);
				instance = new SingletonTest();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return instance;
	}
	
}
