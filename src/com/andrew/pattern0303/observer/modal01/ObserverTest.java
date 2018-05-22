package com.andrew.pattern0303.observer.modal01;

/**
 * 观察者模式
 * 
 * @author andrew
 * @date 2018/04/24
 */
public class ObserverTest {
	public static void main(String[] args) {
		Watched girl = new ConcreteWatched();
		Watcher watcher1 = new ConcreteWatcher();
		Watcher watcher2 = new ConcreteWatcher();
		Watcher watcher3 = new ConcreteWatcher();
		girl.addWatcher(watcher1);
		girl.addWatcher(watcher2);
		girl.addWatcher(watcher3);
		girl.notifyWatchers("大家放假了！");
		
		girl.removeWatcher(watcher2);
		girl.notifyWatchers("大家开学了！");
	}
}
