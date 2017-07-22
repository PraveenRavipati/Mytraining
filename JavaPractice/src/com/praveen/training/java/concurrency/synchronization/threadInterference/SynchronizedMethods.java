package com.praveen.training.java.concurrency.synchronization.threadInterference;

public class SynchronizedMethods {

	public static void main(String[] args) {
		SynchronizedCounter counter = new SynchronizedCounter();
		
		IncrementThread2 incrementThread = new IncrementThread2(counter);
		DecrementThread2 decrementThread = new DecrementThread2(counter);
		incrementThread.start();
		decrementThread.start();
	}

}

class SynchronizedCounter {
	private int value = 0;
	
	public synchronized void increment(){
		value++;
	}
	
	public synchronized void decrement(){
		value--;
	}
	
	public synchronized int getvalue(){
		return value;
	}
}

class IncrementThread2 extends Thread {
	
	protected SynchronizedCounter counter;
	
	public IncrementThread2(SynchronizedCounter counter) {
		this.counter = counter;
	}
	
	@Override
	public void run() {
		System.out.println("Valie in Increment : " + counter.getvalue());
		counter.increment();
		counter.increment();
		System.out.println("Valie in Increment : " + counter.getvalue());
	}
}

class DecrementThread2 extends Thread {
	
	protected SynchronizedCounter counter;
	
	public DecrementThread2(SynchronizedCounter counter) {
		this.counter = counter;
	}
	
	@Override
	public void run() {
		System.out.println("Valie in decrement : " + counter.getvalue());
		counter.decrement();
		counter.decrement();
		System.out.println("Valie in decrement : " + counter.getvalue());
	}
}