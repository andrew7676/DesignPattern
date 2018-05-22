package com.andrew.pattern0303.observer.modal04;

/**
 * 具体观察者（ConcrereObserver）
 * 
 * @author andrew
 * @date 2018/05/08
 */
public class WeixinUser implements Observer {
	private String name;
    public WeixinUser(String name) {
        this.name = name;
    }
    @Override
    public void update(String message) {
        System.out.println(name + "-" + message);
    }
}
