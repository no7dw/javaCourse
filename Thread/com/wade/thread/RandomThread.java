package com.wade.thread;

public class RandomThread extends Thread{
	int start;
	int end;
	public RandomThread(int start , int end){
		this.start = start;
		this.end = end;
	}
	public void run(){
		int sec = (int) (Math.random()* 10);
		System.out.println("gonna sleep for " + sec + " secs");
		try{
			Thread.currentThread().sleep( sec );
			System.out.println("thread end");
		}catch (Exception e){
			e.printStackTrace();
		}

		
	}
}