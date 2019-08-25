package com.nt.core;

public class Demo {

	static String Super(String s) {
		StringBuffer sb=new StringBuffer();
		String str[]=null;
				int len=s.length();
				int c=0;
				char ch[]=s.toCharArray();
				if(len>4) {
					for(int i=0; i<ch.length;i++)
					{
						if(ch[i]=='a' || ch[i]=='b'|| ch[i]=='c' || ch[i]=='d'||ch[i]=='e' || ch[i]=='f'||ch[i]=='g' || ch[i]=='h')
							c++;
					}
					if(c==2) {
						sb.append("empty ");
					}
					if(c==3) {
			for(int i=0; i<len;) {
				sb.append(ch[i]);
					i=i+3;
					}//for
			//return sb.toString();
					}//if
		
		//	return sb.toString();
				}
				
				else if(len>=2 && len <=4){
					sb.append("Empty");
				}
				else {}
			return sb.toString();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	String s="aa";
		//String s="aaabccddd";
		//String s="baab";
		//String s="babanc";
		String s="aabbcc";
				String str=Super(s);
				System.out.println(str);
		

}
}
