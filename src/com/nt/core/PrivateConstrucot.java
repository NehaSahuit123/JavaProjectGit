package com.nt.core;

public class PrivateConstrucot {
	private PrivateConstrucot() {
		// TODO Auto-generated constructor stub
		System.out.println("hi");
	}
	private PrivateConstrucot(int a) {
		// TODO Auto-generated constructor stub
		System.out.println("i arg");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrivateConstrucot ps=new PrivateConstrucot(50);
		
	}

}
