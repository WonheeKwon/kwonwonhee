package day04;

public class Flow2 {
	public static void main(String[] args) {
		//제어문 : 조건문, 반복문, 기타 제어문
		//조건문 : if, switch
		//반복문 : while, for
		//기타제어문: break, continue, goto(쓰지마!)
		
		//break : 반복문을 끝냄
		//continue : 반복문 일회성 취소
		for(int i=1; i<6; i++) {
			if (i == 3) { break;					//i가 3과 같다면 반복문 종료
							
			}
			System.out.println(i+"번");
		}
		System.out.println("프로그램 종료");
		
		for(int i=1; i<6; i++) {
			if(i==3){
			continue;		//i가 3과 같다면 밑에 있는 코드는 실행하지 않고 위로 올라감(일회성 취소)
		} System.out.println(i+"회");
		
		
		}
		System.out.println("프로그램 종료2");
			
	}}
