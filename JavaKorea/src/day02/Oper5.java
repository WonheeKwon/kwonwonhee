package day02;

public class Oper5 {
	public static void main(String[] args) {
		// 연산자 (연산기호, 특정한 기능)
		// 산술연산 : +, - 등
		// 대입연산자 : =
		// 누적연산자 : +=, -=, *=, /=
		// 증감연산자 : ++, --
		// 비교연산자 : <,>,<=,>=,==같다,!=다르다
		// 논리연산자 : &&, ||, !
		
		//비교연산자
		boolean 참거짓1 = true;				//맞
		boolean 참거짓2 = false;				//틀
		
		System.out.println(3 > 2);
		System.out.println(3 < 2);
		
		
		int 숫자1 = 1;
		int 숫자2 = 2;
		System.out.println(숫자1==숫자2);
		System.out.println(숫자1!=숫자2);
		
		System.out.println("=======================================");
		
		// page 10
		
		int x = 20;
		int y = 10;
		boolean result = true;	//or false			//false true 둘중 하나 해놓으면 반대쪽은 자동 생성
		
		result = x > y;
		System.out.println("x>y="+result);
		
		result = x < y;
		System.out.println("x<y="+result);
		
		result = x == y;
		System.out.println("x==y="+result);
		
		result = x != y;
		System.out.println("x!=y="+result);
	
		//각 자료형의 기본값
		
		int 점수 = 0;
		double 실수 = 0.0;
		String 문자열 = null;
		boolean 불린 = false;
		char 문자 = '\0';
	
	}
}
