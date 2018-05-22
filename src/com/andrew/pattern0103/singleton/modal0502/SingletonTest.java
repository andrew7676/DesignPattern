package com.andrew.pattern0103.singleton.modal0502;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 5.���л��뷴���л��ĵ���ģʽ
 * (2)ʹ��readResolve�����ĵ���ģʽ
 * �̲߳���ȫ
 * readResolve�����ڷ����л�ʱ�ᱻ���ã�ʵ�ַ����л�
 * 
 * @author andrew
 * @date 2018/04/23
 */
public class SingletonTest implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	// �ڲ���
	private static class SingletonTestHandler{
		private static SingletonTest instance = new SingletonTest();
	}
	
	private SingletonTest() {}
	
	public static SingletonTest getInstance() {
		return SingletonTestHandler.instance;
	}
	
	// �÷����ڷ����л�ʱ�ᱻ���ã��÷������ǽӿڶ���ķ������е��Լ���׳ɵĸо�
	protected Object readResolve() throws ObjectStreamException {  
        System.out.println("������readResolve������");  
        return SingletonTestHandler.instance;   
    }
}
