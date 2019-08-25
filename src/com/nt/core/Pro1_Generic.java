package com.nt.core;

import java.util.ArrayList;
import java.util.Iterator;

public class Pro1_Generic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList();
		al.add("a");
		//al.add(1);
		al.add("c");
		//al.add(2);
		System.out.print(al+",");
		Iterator<String> it=al.iterator();
		while(it.hasNext()) {
			String obj=it.next();
			/*if(obj instanceof String) {
				String str=((String) obj).toUpperCase();*/
				System.out.println(obj.toUpperCase());
				}
		}

	}


