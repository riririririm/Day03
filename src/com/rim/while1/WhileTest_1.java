package com.rim.while1;

import java.util.Scanner;

public class WhileTest_1 {

	public static void main(String[] args) {
		 int id=1234, pw=5678;
		 Scanner sc = new Scanner(System.in);
		 
		 while(true) {
			 System.out.println("로그인>>1   종료하기>>2");
			 int select = sc.nextInt();
			 if(select==2)
				 break;
			 else if(select==1) {
			 System.out.println("id:");
			 int mId=sc.nextInt();
			 System.out.println("pw:");
			 int mPw=sc.nextInt();
			 
			 if(id==mId && pw==mPw) {
				 System.out.println("로그인성공");
				  break;
			 }else
				 System.out.println("로그인 실패");
			 }
				
		 }

	}

}
