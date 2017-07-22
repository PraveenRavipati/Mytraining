package com.praveen.training.java.concurrency.synchronization.threadInterference;

class SynchronizedThread extends Thread {
	
	private MonitorLock monitorLock;
	
	public SynchronizedThread(MonitorLock monitorLock) {
		this.monitorLock = monitorLock;
	}
	
	@Override
	public void run() {
		monitorLock.incrementC1();
		monitorLock.incrementC2();
	}
	
	public static void main(String[] args) {
		MonitorLock monitorLock = new MonitorLock();
		
		SynchronizedThread thread0 = new SynchronizedThread(monitorLock);
		SynchronizedThread thread1 = new SynchronizedThread(monitorLock);
		SynchronizedThread thread2 = new SynchronizedThread(monitorLock);
		SynchronizedThread thread3 = new SynchronizedThread(monitorLock);
		
		thread0.start();
		thread1.start();
		thread2.start();
		thread3.start();
	}
}