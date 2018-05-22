package com.andrew.pattern0303.observer.modal03;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者模式
 * 1.被观察者继承Observable，调用setChanged()和notifyObservers()方法
 * 2.观察者继承Observer，实现update()方法
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
 * 被观察者 学校 
 */
class School extends Observable {
	String notice;
	public void notice() {
		setNotice("放假通知：1~7号放假");
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
 * 观察者 学生
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
			System.out.println("Student 收到通知:" + ((School) o).getNotice());
		}
	}
}

/**
 * 观察者 老师 
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
            System.out.println("Teacher 收到通知:" + ((School) o).getNotice());
        }
	}
}