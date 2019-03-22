package com.rim.fo;

import java.util.Scanner;

public class For_ex6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int select=0; int j=0;
		
		for(int i=0;i<3;i++) {
			System.out.println("1.단발 / 2.점사");
			select = sc.nextInt();
			
			for(j=0;j<30;j++) {
				if(select==1) 
					System.out.print("탕 ");
				else if(select==2) { 
					System.out.print("타타탕 ");
					j+=2;
				}
			}
			
			System.out.println(); System.out.println();
		}

	}

}
