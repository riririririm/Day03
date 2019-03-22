package com.rim.fo;

import java.util.Scanner;

public class For_ex5 {

	public static void main(String[] args) {
		//분, 초
		//0분 0초
		//0분 1초
		//0분 2초
		//1분 0초
		//59분 59초
		//분과 초를 입력받아 그 시간이 되면 끝냄
		
		int min=0, sec=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("분:");
		min = sc.nextInt();
		System.out.println("초:");
		sec = sc.nextInt();
		
		for(int i=0;i<=min;i++) {
			for(int j=0;j<60;j++) {
				if(i==min && j==sec+1)
					break;
				System.out.println(i+"분 "+j+"초");
			}
		}
		
		

	}

}
