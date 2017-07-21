package com.praveen.training.java.concurrency;

/**
 * 
 * @author Praveen Ravipati
 * here when you extends thread class, observe that, "No" need to send the object as
 *  parameter for the thread constructor. you can create the object of your own class
 *
 */
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
