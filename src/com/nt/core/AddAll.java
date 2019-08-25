package com.nt.core;


import java.util.ArrayList;
import java.util.List;

public class AddAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List al=new ArrayList();
		al.add("50");
		al.add("30");
		al.add("40");
		al.add("20");
		al.add("10");
		List al1=new ArrayList();
		al1.addAll(al)
;
		System.out.println(al1);
		System.out.println(al);
		
		

	}

}
