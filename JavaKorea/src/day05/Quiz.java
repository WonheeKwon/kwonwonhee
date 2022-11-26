package day05;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		//입력받은 나라의 수로를 알려주는 프로그램
		String nations[] = {"한국","대한민국","미국","중국","일본"};
		String cities[] = {"서울","서울","워싱턴","베이징","도쿄"};
		
		Scanner sc = new Scanner(System.in);
		String in;
		
		while(true) {
		System.out.print("어느 나라의 수도가 궁금하십니까?(0을 입력하면 종료)");
		in = sc.next();
		int idx = -1;		//위 array가 0번도 있으니
		
		for(int i=0; i<nations.length; i++) {
			if(in.equals(nations[i])) {
				idx = i;			//같다면 해당 위치를 idx에 백업
				
			}
		
		
		}
		
		if(in.equals("0")) {System.out.println("프로그램 종료"); break; }
		
		
		if(idx!=-1) {				//-1은 idx에 저장된 값임. 계속 변수 -1이라면 입력으로 인해 idx 변화가 생기지 않은것
			System.out.println(nations[idx]+"의 수도는 "+cities[idx]+"입니다");
		} else {
			System.out.println("해당국가가 없습니다");
		}
		}
		
		
	}
}
