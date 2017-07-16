package com.praveen.training.java.concurrency;

/**
 * 
 * @author Praveen Ravipati
 *  Here when the thread is executing , after 15 sec the thread has been interrupted.
 *  so the thread has stopped
 *
 */
public class HelloThreadInterrupt extends Thread{
	
	private String[] names;
	
	@Override
	public void run() {
		for (String string : names) {
			try {
				Thread.sleep(4000);
				System.out.println("Hello " + string);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		String[] strings = {"praveen","Bharath","sagar","shouki"};
		HelloThreadInterrupt helloThreadInterrupt = new HelloThreadInterrupt();
		helloThreadInterrupt.setStrings(strings);
		helloThreadInterrupt.start();
		Thread.sleep(15000);
		helloThreadInterrupt.interrupt();
		
	}

	public String[] getStrings() {
		return names;
	}

	public void setStrings(String[] names) {
		this.names = names;
	}

}
