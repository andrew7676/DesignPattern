package com.andrew.pattern0303.observer.modal04;

/**
 * 抽象被观察者（Subject）
 * 
 * @author andrew
 * @date 2018/05/08
 */
public interface Subject {
	/**
     * 增加订阅者
     * @param observer
     */
    public void attach(Observer observer);
    /**
     * 删除订阅者
     * @param observer
     */
    public void detach(Observer observer);
    /**
     * 通知订阅者更新消息
     */
    public void notify(String message);
}
