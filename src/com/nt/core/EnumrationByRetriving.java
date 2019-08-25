package com.nt.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class EnumrationByRetriving {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Vector v=new Vector();
	ArrayList v=new ArrayList();
		v.add("a");
		v.add("b");
		v.add("c");
		System.out.println(v);
		//Enumeration e=v.elements();
		Enumeration e=Collections.enumeration(v);
		while(e.hasMoreElements()) {
			Object obj=e.nextElement();
			System.out.println(obj);
			
		}
		

	}

}
