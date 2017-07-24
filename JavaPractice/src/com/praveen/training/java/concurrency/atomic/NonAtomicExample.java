package com.praveen.training.java.concurrency.atomic;

import java.util.concurrent.atomic.AtomicLong;

public class NonAtomicExample extends Thread{

	Long l;
	
	public NonAtomicExample(Long l) {
		this.l = l;
	}
	
	public static void main(String[] args) {
		Long l = new Long(0);
		NonAtomicExample nonAtomicExample1 = new NonAtomicExample(l);
		NonAtomicExample nonAtomicExample2 = new NonAtomicExample(l);
		NonAtomicExample nonAtomicExample3 = new NonAtomicExample(l);
		NonAtomicExample nonAtomicExample4 = new NonAtomicExample(l);
		NonAtomicExample nonAtomicExample5 = new NonAtomicExample(l);
		
		nonAtomicExample1.start();
		nonAtomicExample2.start();
		nonAtomicExample3.start();
		nonAtomicExample4.start();
		nonAtomicExample5.start();

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
			System.out.println("Thread Name : " + Thread.currentThread().getName() + " Long Value : " + l++);
		}
	}
}
