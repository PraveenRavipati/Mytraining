package com.praveen.training.java.concurrency;

/**
 * 
 * @author Praveen Ravipati
 * 
 * here when the runnable has implements, you observe that, you need to send the object as
 *  parameter for the thread constructor
 *
 */
public class HelloWordRunnable implements Runnable {

	public static void main(String[] args) {
		System.out.println("Hello, Im from Main method");
		
		Thread thread = new Thread(new HelloWordRunnable());
		thread.start();
	}

	@Override
	public void run() {
		System.out.println("Hello, Im from Thread");
	}

}
