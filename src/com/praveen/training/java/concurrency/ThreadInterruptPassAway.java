package com.praveen.training.java.concurrency;

/**
 * 
 * @author Praveen Ravipati
 *  Here when the thread is executing , after 15 sec the thread has been interrupted.
 *  so the thread has not stopped and continued
 *
 */

public class ThreadInterruptPassAway extends Thread {
	
	private String[] names;
	
	@Override
	public void run() {
		boolean printed = false;
		for (String string : names) {
			printed = false;
			try {
				Thread.sleep(4000);
				System.out.println("Hello " + string);
				printed = true;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(!printed){
				System.out.println("Hello " + string);
			}
		}
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		String[] strings = {"praveen","Bharath","sagar","shouki","Sumanth","Raghava"};
		ThreadInterruptPassAway passAway = new ThreadInterruptPassAway();
		passAway.setStrings(strings);
		passAway.start();
		Thread.sleep(15000);
		passAway.interrupt();
		
	}

	public String[] getStrings() {
		return names;
	}

	public void setStrings(String[] names) {
		this.names = names;
	}

}
