package com.rim.fo;

import java.util.Scanner;

public class For_ex3 {

	public static void main(String[] args) {
		int id = 1234;
		int pwd = 5678; int btn=0;
		Scanner sc = new Scanner(System.in);
		String result="";
		
		for(int i=0;i<5;i++) {
			System.out.println("ID:");
			int uId = sc.nextInt();
			System.out.println("PW:");
			int uPwd = sc.nextInt();
			
			if(id==uId && pwd==uPwd) {
				result="로그인성공";
				break;
			}else if(id != uId || pwd !=uPwd) {
				if(i==4)
					result="은행에 방문해주세요";
				else
					System.out.println("다시 로그인하세요");
			}
		}//for
		
		System.out.println(result);
		
		if(result.equals("로그인성공")) {
			System.out.println("1.계좌조회 / 2.계좌이체 / 3.대출  선택하세요");
			btn = sc.nextInt();
			
			switch(btn) {
			case 1:
				System.out.println("계좌조회");
				break;
			case 2:
				System.out.println("계좌이체");
				break;
			case 3:
				System.out.println("대출");
				break;
			default:
				System.out.println("1~3중에 선택하세요");
			}
			
			
		}
		
		
		

	}

}
