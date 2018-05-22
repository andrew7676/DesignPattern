package com.andrew.pattern0103.singleton.modal07;

/**
 * 7.ʹ��ö����������ʵ�ֵ���ģʽ
 * �̰߳�ȫ
 * ö��enum�;�̬�������������ƣ���ʹ��ö��ʱ�����췽���ᱻ�Զ����á�
 * 
 * @author andrew
 * @date 2018/04/23
 */
public enum EnumFactory {
	
	singletonFactory;
	
	private SingletonTest instance;
	
	private EnumFactory(){
		// ö����Ĺ��췽����������Ǳ�ʵ����  
        instance = new SingletonTest();  
    }
	
	public SingletonTest getInstance(){
		return instance;
	}
	
}

class SingletonTest {
	// ��Ҫ��ʵ�ֵ������࣬�������ݿ�����Connection
	public SingletonTest(){}
}