package com.practice;

public class ReverseString1 {

	public static void main(String[] args) {
		String str="Dipak";
		
		char[] ch=str.toCharArray();
		
		for(int i=ch.length-1; i>=0; i--) {
			System.out.print(ch[i]);
		}

	}

}
