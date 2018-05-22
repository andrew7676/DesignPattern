package com.andrew.pattern0103.singleton.modal0501;

import java.io.Serializable;

/**
 * 5.���л��뷴���л��ĵ���ģʽ
 * (1)δʹ��readResolve�����ĵ���ģʽ
 * �̲߳���ȫ
 * ���кŶ����hashCode�ͷ����л���õ��Ķ����hashCodeֵ��һ����˵�������л��󷵻صĶ���������ʵ�����ģ��������ƻ���
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
	
}
