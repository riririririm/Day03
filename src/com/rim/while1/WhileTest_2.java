package com.rim.while1;

import java.util.Scanner;

public class WhileTest_2 {

	public static void main(String[] args) {
		 int id=1234, pw=5678;
		 Scanner sc = new Scanner(System.in);
		 boolean check=false;
		 
		 do{
			 System.out.println("id:");
			 int mId=sc.nextInt();
			 System.out.println("pw:");
			 int mPw=sc.nextInt();
			 
			 if(id==mId && pw==mPw) {
				 System.out.println("로그인성공");
				  break;
			 }
		 }while(check);
		 
		 

	}
}
