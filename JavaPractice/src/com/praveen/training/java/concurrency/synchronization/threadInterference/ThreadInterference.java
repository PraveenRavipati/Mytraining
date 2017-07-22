package com.praveen.training.java.concurrency.synchronization.threadInterference;

public class ThreadInterference {

	public static void main(String[] args) {
		Counter counter = new Counter();
		
		IncrementThread incrementThread = new IncrementThread(counter);
		DecrementThread decrementThread = new DecrementThread(counter);
		incrementThread.start();
		decrementThread.start();
	}

}

class Counter {
	private int value = 0;
	
	public void increment(){
		value++;
	}
	
	public void decrement(){
		value--;
	}
	
	public int getvalue(){
		return value;
	}
}

class IncrementThread extends Thread {
	
	protected Counter counter;
	
	public IncrementThread(Counter counter) {
		this.counter = counter;
	}
	
	@Override
	public void run() {
		System.out.println("Valie in Increment : " + counter.getvalue());
		counter.increment();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		counter.increment();
		System.out.println("Valie in Increment : " + counter.getvalue());
	}
}

class DecrementThread extends Thread {
	
	protected Counter counter;
	
	public DecrementThread(Counter counter) {
		this.counter = counter;
	}
	
	@Override
	public void run() {
		System.out.println("Valie in decrement : " + counter.getvalue());
		counter.decrement();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		counter.decrement();
		System.out.println("Valie in decrement : " + counter.getvalue());
	}
}