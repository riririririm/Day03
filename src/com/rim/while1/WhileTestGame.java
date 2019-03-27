package com.rim.while1;

import java.util.Scanner;

public class WhileTestGame {
	public static void main(String[] args) {
		int login=0, level=0, gold=0, up=0;
		int id=1234, pw=5678, select=0;
		int mId=0, mPw=0, totalG=0;
		Scanner sc = new Scanner(System.in);
		
		
		while(login==0) {//login값 0은 로그아웃 1은 로그인 2는 종료
			System.out.println("-----로그인-----");
			System.out.println("1.로그인 / 2.종료");
			select = sc.nextInt();
			
			switch(select) {
			case 1:
				System.out.println("ID");
				mId=sc.nextInt();
				System.out.println("PW");
				mPw=sc.nextInt();
				
				if(id==mId && pw==mPw) {//로그인성공시
					System.out.println("로그인성공");
					login=1;
				}else {
					System.out.println("로그인실패");
					login=0;
				}
				break;
				
			case 2://프로그램 종료
				System.out.println("게임종료");
				login=2;
				break;
				
			default:
				System.out.println("다시 선택하세요");
			}
			
			if(login==1)
				break;
			
			
		}//while
		
	
		
		while(login==1 && up==0) {
			System.out.println();System.out.println();
			System.out.println("--------게임진행-------");
			System.out.println("1.사냥 / 0.종료");
			int con = sc.nextInt();
			
			switch(con) {
			case 0: //종료
				up=1;
				break;
			case 1: //사냥
				break;
			default:
				System.out.println("다시 선택하세요");
			}
			
			if(up==1) {
				//게임종료
				System.out.println("게임종료");
				break;
			}else {
				//사냥
				for(int i=1;i<=15;i++) {
					System.out.println("레벨"+i);
					
					if(i==5 || i==10 ||i==15) {
						totalG +=i/5*1000;
						System.out.println("******레벨"+i+"달성!!******");
						System.out.println("보상으로 "+i/5*1000+" Gold를 지급했습니다");
					}
					
					
					/*
					 * if(i%5==0) { System.out.println("******레벨"+i+"달성!!******"); switch(i) { case
					 * 5: gold=1000; totalG+=gold; break; case 10: gold=2000; totalG+=gold; break;
					 * case 15: gold=3000; totalG+=gold; level=15; break; }
					 * System.out.println("보상으로 "+gold+" Gold를 지급했습니다"); System.out.println();
					 * 
					 * }
					 */
					
					for(int j=1;j<=3*i;j++) {
						if(i!=15)System.out.print(j+"K  ");
					}
					System.out.println();
					System.out.println("leve up!!");System.out.println();
				}
				
			}
			
		}//end of while
		
		if(login!=2)
		System.out.println("결과 레벨:"+level+" 현재 골드:"+totalG);
		
		sc.close();

	}
}
