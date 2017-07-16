package com.praveen.training.java.concurrency.join;

/**
 * 
 * @author Praveen Ravipati
 * Here the join work as stopping all other threads until current thread (join) 
 * 		has complete
 *
 */
public class BasicJoin extends Thread{

	public static void main(String[] args) {
		BasicJoin basicJoin1 = new BasicJoin();
		BasicJoin basicJoin2 = new BasicJoin();
		BasicJoin basicJoin3 = new BasicJoin();
		
		String[] strings = {"Praveen" , "Shouki" , "Sagar", "Raghuram"};
		
		basicJoin1.setStrings(strings);
		
		basicJoin1.start();
		
		try {
			basicJoin1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		basicJoin2.setStrings(strings);
		basicJoin3.setStrings(strings);
		
		basicJoin2.start();
		basicJoin3.start();
	}

	@Override
	public void run() {
		for (String string : strings) {
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Thread : " + Thread.currentThread().getName() + 
					" Name : " + string);
		}
	}
	
	public String[] getStrings() {
		return strings;
	}

	public void setStrings(String[] strings) {
		this.strings = strings;
	}

	private String[] strings;
}
