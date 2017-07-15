package com.praveen.training.java.concurrency;

public class HelloWordThread extends Thread{

	public static void main(String[] args) {
		System.out.println("Hello, Im from Main");
		
		HelloWordThread thread = new HelloWordThread();
		thread.start();
	}
	
	@Override
	public void run() {
		System.out.println("Hello, Im from Thread");
	}

}
