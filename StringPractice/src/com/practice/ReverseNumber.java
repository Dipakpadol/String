package com.practice;

public class ReverseNumber {

	public static void main(String[] args) {
		int num=1234, revNum=0;
		
		System.out.println("Original Number : "+num);
		
		while(num!=0) {
			revNum=revNum*10+num%10;
			num=num/10;
		}
		System.out.println("Reverse Number : "+revNum);

	}

}
