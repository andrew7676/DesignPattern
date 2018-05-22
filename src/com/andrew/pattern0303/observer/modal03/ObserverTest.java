package com.andrew.pattern0303.observer.modal03;

import java.util.Observable;
import java.util.Observer;

/**
 * �۲���ģʽ
 * 1.���۲��߼̳�Observable������setChanged()��notifyObservers()����
 * 2.�۲��߼̳�Observer��ʵ��update()����
 * 
 * @author andrew
 * @date 2018/04/24
 */
public class ObserverTest {
	public static void main(String[] args) {
		School school = new School();
		Student student1 = new Student(school);
		Student student2 = new Student(school);
		Teacher teacher = new Teacher(school);
		school.notice();
	}
}


/**
 * ���۲��� ѧУ 
 */
class School extends Observable {
	String notice;
	public void notice() {
		setNotice("�ż�֪ͨ��1~7�ŷż�");
		setChanged();
		notifyObservers();
	}
	public String getNotice() {
		return notice;
	}
	public void setNotice(String notice) {
		this.notice = notice;
	}
}

/**
 * �۲��� ѧ��
 */
class Student implements Observer {
	Observable observable;
	public Student(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}
	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof School) {
			System.out.println("Student �յ�֪ͨ:" + ((School) o).getNotice());
		}
	}
}

/**
 * �۲��� ��ʦ 
 */
class Teacher implements Observer {
	Observable observable;
	public Teacher(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }
	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof School) {
            System.out.println("Teacher �յ�֪ͨ:" + ((School) o).getNotice());
        }
	}
}