package day05;

import java.util.Scanner;

public class Review {
	public static void main(String[] args) {
		System.out.println("테스트");
		
		//1.입력
		Scanner sc = new Scanner(System.in);
		
		//2.출력
		System.out.println("Hello");
		
		//3.변수
		String str;
		int num;
		double dnum;
		
		str = "Java";
		num = 314;
		dnum = 3.14;
		
		//4.배열:변수들을 뭉쳐놓음
		String array[]= {"a1", "a2", "a3", "a4"}; //4개의 문자열 변수를 뭉쳐 놓음
		array[0] = "b1";					
		array[1]= "b2";
		array[2] = "b3";
		array[3] = "b4";
		
		//5.조건문
		//if ~ else if~else
		//switch~case~break
		if(num < 100) {
			System.out.println("100미만의 num:" +num);
			
		}else if (num<200) {
			System.out.println("100~199dml num:" +num);
			
		}else {
			System.out.println("200이상의 num:" +num);
			
		}
			
		
		switch(num/100) {
		case 0 :
			System.out.println("100미만의 num:" +num);
			break;
		case 1:
			System.out.println("100~199dml num:" +num);
			break;
		default:
			System.out.println("200이상의 num"+num);
		}
		
		
		//6.반복문(while, for)
		int i=0;
		while(i<5) {
			System.out.println("현재횟수:"+(i+1));
			i++;
		}
		
		for(int j=0; j<5; j++) {
			System.out.println("현재횟수:"+(j+1));
		}
		
		for(int k=0; k<10; k++) {
			if(k%2==0) {
				//짝수다
				continue;	//짝수일 경우 밑에 코드를 실행하지 않고 반복문 시작위치로 올라감(일회성 취소
			}
			if(k>5) {
				break;				//5보다 크면 반복문 강제 종료
			}		
			System.out.println(k+"번");
		
		}
		//배열 + 반복문
		for(int x=0; x<array.length; x++) {
			System.out.print(array [x] + " ");			//ln 빼면 한줄에 다 써짐
			
		}
		
		
		
		
		
		
	}
}
