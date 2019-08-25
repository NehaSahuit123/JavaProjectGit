package com.nt.core;

import java.util.ArrayList;

public class ForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add("a");
		al.add("b");
		al.add("c");
		al.add("d");
		System.out.print(al+",");
		for(Object obj:al)
		{
			System.out.println(al);
		}

	}

}
