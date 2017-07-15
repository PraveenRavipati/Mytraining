package com.praveen.training.java.concurrency;

public class ThreadSleep {

	public static void main(String[] args) throws InterruptedException {
		String[] strings = {"praveen","Srinu","raja","kumar","Raghuram"};
		for (String string : strings) {
			Thread.sleep(1000);
			System.out.println("\n"+string);
			Thread.sleep(2000);
			System.out.println(string +" present sir");
			
		}
	}

}
