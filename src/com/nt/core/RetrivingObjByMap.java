package com.nt.core;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RetrivingObjByMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map=new HashMap();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		System.out.println(map);
		System.out.println();
		for(Map.Entry<Integer, String> entry:map.entrySet()) {
			
			System.out.println(entry.getKey()+"="+entry.getValue());
		}
		

	}

}
