package com.nt.core;

public class GarbageCollectionUnreference {
int x=10;
int y=20;
void m1(GarbageCollectionUnreference e){
	e=null;
	System.out.println("e="+e);
	GarbageCollectionUnreference e1=new GarbageCollectionUnreference();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GarbageCollectionUnreference e1=new GarbageCollectionUnreference();
		GarbageCollectionUnreference e2=new GarbageCollectionUnreference();
		e1.m1(e2);
		
		

	}

}
