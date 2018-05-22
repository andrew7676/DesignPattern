package com.andrew.pattern0103.singleton.modal0301;

/**
 * 3.�̰߳�ȫ������ʽ����ģʽ
 * (1)ʹ��ͬ��������synchronized
 * �̰߳�ȫ
 * ����ʽ������ָ�ڷ������û�ȡʵ��ʱ�Ŵ���ʵ����
 * Ϊ�˱�֤�̰߳�ȫ��Ҫʹ��ͬ�������ƣ��ڷ���������synchronized�ؼ���
 * 
 * @author andrew
 * @date 2018/04/23
 */
public class SingletonTest {
	
	private static SingletonTest instance = null;
	
	private SingletonTest() {}
	
	public synchronized static SingletonTest getInstance() {
		// Ӧ���ڴ���ʵ��֮ǰ���ܻ���һЩ׼���Եĺ�ʱ������������ͬ����synchronized�ؼ���
		// �������ַ���Ч�ʺܵ�
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
