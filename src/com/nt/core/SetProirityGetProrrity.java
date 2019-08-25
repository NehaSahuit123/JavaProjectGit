package com.nt.core;

public class SetProirityGetProrrity extends Thread {
	 public void run(){  
		   System.out.println("running thread name is:"+Thread.currentThread().getName());  
		   System.out.println("running thread priority is:"+Thread.currentThread().getPriority());  
		  
		  }  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetProirityGetProrrity t1=new SetProirityGetProrrity();
		SetProirityGetProrrity t2=new SetProirityGetProrrity();
		t1.setPriority(Thread.MIN_PRIORITY);  
		  t2.setPriority(Thread.MAX_PRIORITY);  
		t1.start();
		  t2.start();
	}

}
