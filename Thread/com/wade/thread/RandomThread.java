package com.wade.thread;

public class RandomThread extends Thread{
	int start;
	int end;
	public RandomThread(int start , int end){
		this.start = start;
		this.end = end;
	}
	public void run(){
		int msec = (int) (Math.random()* 10000);
		String threadName = Thread.currentThread().getName();
		System.out.println(threadName + " gonna sleep for " + msec + " msec");
		try{
			Thread.currentThread().sleep( msec );
			System.out.println(threadName + "thread end");
		}catch (Exception e){
			e.printStackTrace();
		}

		
	}
}