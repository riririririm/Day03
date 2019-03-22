package com.rim.while1;

import java.util.Scanner;

public class WhileTest_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String menu="";
		int cost=0;
		int check=1;
		int bul=0, chic=0, fri=0, sal=0;
		int bu=0, ch=0,fr=0,sa=0;

		while(check!=0) {
		System.out.println("***메뉴를 선택하세요***");
		System.out.println("햄버거**************");
		System.out.println("1.불고기버거	3500원");
		System.out.println("2.치킨버거	3200원");
		System.out.println("추가****************");
		System.out.println("3.감자튀김	1000원");
		System.out.println("4.샐러드		2000원");
		System.out.println();
		System.out.println("메뉴선택:");
		int num=sc.nextInt();
		
		switch(num) {
		case 1:
			menu="불고기버거";
			cost=3500;
			break;
		case 2:
			menu="치킨버거";
			cost=3200;
			break;
		case 3:
			menu="감자튀김";
			cost=1000;
			break;
		case 4:
			menu="샐러드";
			cost=2000;
			break;
		}
		System.out.println(menu+"를 선택하셨습니다.");
		
		System.out.println("수량:");
		int count = sc.nextInt();
		
		switch(num) {
		case 1:
			bul+=count*cost;
			bu+=count;
			break;
		case 2:
			chic+=count*cost;
			ch+=count;
			break;
		case 3:
			fri+=count*cost;
			fr+=count;
			break;
		case 4:
			sal += count*cost;
			sa+=count;
			break;
		}
		
		System.out.println(count+"개 주문하셨습니다.");
		
		
		System.out.println("추가주문하시겠습니까?(1/0):");
		check = sc.nextInt();
		
		if(check==0) {
			break;
		}
		
		}//while

		
		System.out.println("[주문정보]");
		if(bu!=0)System.out.println("1.불고기버거	"+bu+"개\t"+bul+"원");
		if(ch!=0)System.out.println("2.치킨버거	"+ch+"개\t"+chic+"원");
		if(fr!=0)System.out.println("3.감자튀김	"+fr+"개\t"+fri+"원");
		if(sa!=0)System.out.println("4.샐러드		"+sa+"개\t"+sal+"원");
		System.out.println("총 금액: "+(bul+chic+fri+sal)+"원");
		
		
		
		 
			
		
	
	}

}
