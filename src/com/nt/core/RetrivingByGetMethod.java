package com.nt.core;

import java.util.ArrayList;

public class RetrivingByGetMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add("a");
		al.add("b");
		al.add("c");
		al.add("d");
		System.out.print(al+",");
		for(int i=0; i<al.size(); i++) {
			Object obj=al.get(i)
;
			System.out.print(obj);
		}
		

	}

}
