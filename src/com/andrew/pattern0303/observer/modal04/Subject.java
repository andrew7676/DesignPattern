package com.andrew.pattern0303.observer.modal04;

/**
 * ���󱻹۲��ߣ�Subject��
 * 
 * @author andrew
 * @date 2018/05/08
 */
public interface Subject {
	/**
     * ���Ӷ�����
     * @param observer
     */
    public void attach(Observer observer);
    /**
     * ɾ��������
     * @param observer
     */
    public void detach(Observer observer);
    /**
     * ֪ͨ�����߸�����Ϣ
     */
    public void notify(String message);
}
