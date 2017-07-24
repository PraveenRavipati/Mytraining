package com.praveen.training.java.concurrency.atomic;

public class VolatileExample extends Thread{

	static volatile long l = 0;
	
	
	public static void main(String[] args) {
		
		VolatileExample nonAtomicExample1 = new VolatileExample();
		VolatileExample nonAtomicExample2 = new VolatileExample();
		VolatileExample nonAtomicExample3 = new VolatileExample();
		VolatileExample nonAtomicExample4 = new VolatileExample();
		VolatileExample nonAtomicExample5 = new VolatileExample();
		VolatileExample nonAtomicExample6 = new VolatileExample();
		VolatileExample nonAtomicExample7 = new VolatileExample();
		VolatileExample nonAtomicExample8 = new VolatileExample();
		VolatileExample nonAtomicExample9 = new VolatileExample();
		VolatileExample nonAtomicExample10 = new VolatileExample();
		
		
		nonAtomicExample1.start();
		nonAtomicExample2.start();
		nonAtomicExample3.start();
		nonAtomicExample4.start();
		nonAtomicExample5.start();
		nonAtomicExample6.start();
		nonAtomicExample7.start();
		nonAtomicExample8.start();
		nonAtomicExample9.start();
		nonAtomicExample10.start();
		

	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread Name : " + Thread.currentThread().getName() + " Long Value : " + l++);
		}
	}
}
