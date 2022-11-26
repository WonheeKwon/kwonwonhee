package day04;

import java.util.Iterator;
import java.util.Scanner;

public class Array4 {
	public static void main(String[] args) {
		//입력받은 나라의 수도를 알려주는 프로그램 만들기
		
		String 국가[] = {"대한민국", "중국", "미국", "일본"};
		String 수도[] = {"서울","베이징","워싱턴DC","도쿄"};
		String in = null;	//사용자로부터 입력받은 값을 저장할 변수를 만들어야함
		int idx; //입력받은 문자열의 값과 동일한 문자열의 위치를 백업해둘 변수
		
		
		Scanner sc =new Scanner(System.in);

		{System.out.println("어느 나라의 수도가 궁금하신가요?");
		in = sc.next();
		
		//for(; idx<국가.length; idx++) {System.out.println(국가[idx]+"의 수도는 "+수도[idx]+"입니다.");
//		
//		int i=0;
//		answer = sc.next();
//		for(; i<국가.length;i++) {System.out.println(수도[i]);
//		}
//		}
//	
//		System.out.println(국가[i]+"의 수도는"+수도[i]+"입니다.");
//	
		}}}
		
//for(int i=0; i<name.length;i++) {
//	System.out.println(no[i]+"번-"+name[i]);
//}