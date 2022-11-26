package day03;

public class If1 {
	public static void main(String[] args) {
		//조건문
		//if, switch
		//외부 조건에 따라서 프로그램 동작을 다르게 하고 싶을 때 사용
		
		//if(){}
		//()안의 내용이 맞으면 중괄호 실행, 틀리면 무시함. 값이 안나옴.
		
//		 int age = 10; 
//		 if (age>=20) {System.out.println("성인 입니다"); }
//		 else {
//			//if가 틀렸을 대 실행할 토드
//			 System.out.println("성인이 아닙니다");
//		}
		
		int age = 20;
		if (age>=20) {
			System.out.println("성인입니다");
					} 
		else if (age>=14) {
			System.out.println("청소년입니다");
					}
		else if (age>=0) {
			System.out.println("어린이입니다");
					}
		else {
			System.out.println("?");
		}
	
		
		
		
		
		
		
	}
}
