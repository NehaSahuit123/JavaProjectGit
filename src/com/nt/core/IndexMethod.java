package com.nt.core;

public class IndexMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="this is index of example"; 
		int index1=s1.indexOf("is");
		int index2=s1.indexOf("index");//returns the index of index substring  
		System.out.println(index1+"..."+index2);//2 8  
	//	int index1=s1.indexOf("is");
		int index3=s1.indexOf("is",4);
		System.out.println(index3);
		//System.out.println(index1+"..."+index2);//2 8 
		int index4=s1.indexOf('s');
		System.out.println(index4);
		String s2="javatpoint";  
		System.out.println(s2.substring(2,4));
		System.out.println(s2.substring(2));
		System.out.println(s2.substring(0));
		System.out.println(s2.substring(5,10));
		System.out.println(s2.substring(5,15));
		"arrb6???4ef5???eee5";
	}

}
