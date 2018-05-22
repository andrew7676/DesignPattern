package com.andrew.pattern0103.singleton.modal08;

/**
 * 8.����ʹ��enumö��ʵ�ֵ���ģʽ
 * �̰߳�ȫ
 * ����¶ö����ʵ��ϸ��
 * 
 * @author andrew
 * @date 2018/04/23
 */
public class ClassFactory {
	
	private enum EnumSingletonTest {
		
		singletonFactory;
		
		private SingletonTest instance;
		
		private EnumSingletonTest() {
			// ö����Ĺ��췽����������Ǳ�ʵ����
			instance = new SingletonTest();
		}
		
		public SingletonTest getInstance(){
			return instance;
		}
	}
	
	public static SingletonTest getInstance(){  
        return EnumSingletonTest.singletonFactory.getInstance();  
    }
}

class SingletonTest {
	// ��Ҫ��ʵ�ֵ������࣬�������ݿ�����Connection
	public SingletonTest(){};
}
