package com.practice;

public class Pattern1 {

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			for(int k=10-i; k>=0; k--) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
