package com.rim.fo;

import java.util.Scanner;

public class For_ex1 {

	public static void main(String[] args) {
		//1~10까지의 합
//		int sum=0;
//		for(int i=1;i<11;i++) {
//			sum+=i;
//		}
//
//		System.out.println(sum);
		
		int count =0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("원하는 시간을 입력하세요:");
		count = sc.nextInt();
		
		for(int i=0;i<60;i++) {
			System.out.println(i);
			
			if(i==count) {
				System.out.println("ok");
				break;
			}
			
		}
		
		
	}

}
