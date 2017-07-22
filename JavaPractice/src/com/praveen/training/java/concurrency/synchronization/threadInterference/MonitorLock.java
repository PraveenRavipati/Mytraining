package com.praveen.training.java.concurrency.synchronization.threadInterference;

public class MonitorLock {

	private int c1 = 0;
	private int c2 = 0;
	
	private Object lock1 = new Object();
	private Object lock2 = new Object();
	
	public void incrementC1(){
		synchronized (lock1) {
			c1++;
			System.out.println("C1 :" + c1  + " Thread : " + Thread.currentThread().getName());
		}
	}
	
	public void incrementC2(){
		synchronized (lock2) {
			c2++;
			System.out.println("C2 :" + c2 + " Thread : " + Thread.currentThread().getName());
		}
	}
}

