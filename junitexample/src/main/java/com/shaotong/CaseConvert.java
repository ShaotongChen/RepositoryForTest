package com.shaotong;

public class CaseConvert {

	public String convertCase(String s) {
		String temp="";
		if(s == null || s.length()==0) {
			return "";
		}else if( s.length()==1 && isNumber(s)) {
			return s;
		}else {
			for(int i = 0; i<s.length();i++) {
				int x = s.charAt(i);
				x -=32;
				temp += (char)x;
				
			}
			return temp;
		} 
	}
	public boolean isNumber(String s) {
		int num = s.charAt(0);
		if(num >47 && num <58) {
			return true;
		}
		return false;
	}
}
