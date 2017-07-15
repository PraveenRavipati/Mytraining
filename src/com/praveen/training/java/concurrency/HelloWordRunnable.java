package com.praveen.training.java.concurrency;

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
