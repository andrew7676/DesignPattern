package com.andrew.pattern0103.singleton.modal01;

public class ThreadTest extends Thread {
	
	@Override
	public void run() {
		System.out.println(SingletonTest.getInstance().hashCode());
	}
	
	public static void main(String[] args) {
		ThreadTest[] tts = new ThreadTest[10];
		for (int i = 0; i < tts.length; i++) {
			tts[i] = new ThreadTest();
		}
		for (int j = 0; j < tts.length; j++) {
			tts[j].start();
		}
	}
}
