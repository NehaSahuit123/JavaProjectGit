package com.nt.core;

public class GetNameSetName extends Thread {
	 public void run(){  
		   System.out.println(Thread.currentThread().getName());  
		  }  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetNameSetName t1=new GetNameSetName();
	GetNameSetName t2=new GetNameSetName();
	//System.out.println("Name of t1:"+t1.getName());  
	  //System.out.println("Name of t2:"+t2.getName());  
	  //System.out.println("id of t1:"+t1.getId()); 
	  //System.out.println("id of t2:"+t2.getId()); 

	  t1.start();  
	  t2.start();  
t1.setName("Neha");
//System.out.println("after Changing Name :"+t1.getName());  
	}

}
