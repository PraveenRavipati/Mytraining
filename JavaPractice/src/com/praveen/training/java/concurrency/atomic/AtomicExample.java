package com.praveen.training.java.concurrency.atomic;

import java.util.concurrent.atomic.AtomicLong;

public class AtomicExample extends Thread{

	AtomicLong atomicLong;
	
	public AtomicExample(AtomicLong atomicLong) {
		this.atomicLong = atomicLong;
	}
	
	public static void main(String[] args) {
		AtomicLong atomicLong = new AtomicLong();
		AtomicExample atomicExample1 = new AtomicExample(atomicLong);
		AtomicExample atomicExample2 = new AtomicExample(atomicLong);
		AtomicExample atomicExample3 = new AtomicExample(atomicLong);
		AtomicExample atomicExample4 = new AtomicExample(atomicLong);
		AtomicExample atomicExample5 = new AtomicExample(atomicLong);
		
		atomicExample1.start();
		atomicExample2.start();
		atomicExample3.start();
		atomicExample4.start();
		atomicExample5.start();

	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Thread Name : " + Thread.currentThread().getName() + " Long Value : " + atomicLong.incrementAndGet());
		}
	}
}
