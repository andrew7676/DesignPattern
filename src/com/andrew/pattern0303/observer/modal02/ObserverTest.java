package com.andrew.pattern0303.observer.modal02;

import java.util.Observable;
import java.util.Observer;

class BeingWatchecd extends Observable{
	void counter(int number){
		for (; number >=0; number--) {
			this.setChanged();
			this.notifyObservers(number);
		}
	}
}

class Watcher1 implements Observer{
	@Override
	public void update(Observable o, Object arg) {
		System.out.println("watcher1's count is:" + arg);
	}
}

class Watcher2 implements Observer{
	@Override
	public void update(Observable o, Object arg) {
		if (((Integer)arg).intValue() <= 5) {
			System.out.println("watcher2's count is:" + arg);
		}
	}
}

public class ObserverTest {
	public static void main(String[] args) {
		BeingWatchecd watched = new BeingWatchecd();
		Watcher1 watcher1 = new Watcher1();
		Watcher2 watcher2 = new Watcher2();
		watched.addObserver(watcher1);
		watched.addObserver(watcher2);
		watched.counter(10);
	}
}

