package day04;

import java.util.Iterator;

public class For3 {
	public static void main(String[] args) {
		
		//5번 안녕하기
		for(int a=0; a<5; a++)
		{System.out.println("안녕");}
		
		
		//1~10 더하기
		int 총합 = 0;
		for (int x=0; x<11; x++) {
			총합 += x;
		}
		System.out.println(총합);
		
		//10~1 거꾸로 출력하기
		for(int c=10; c>0; c--) {
			System.out.println(c);
		}
		
		//0~20 사이의 숫자 중 짝수만 출력하기
		int 짝수 =0;
		for(int d=0; d<21; d++) {
			
			짝수=d++;			System.out.println(짝수);
		}
		
		
		
		}
		
		
		
	}


