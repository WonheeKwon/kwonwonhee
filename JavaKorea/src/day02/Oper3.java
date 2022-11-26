package day02;

public class Oper3 {
	public static void main(String[] args) {
		// 연산자 (연산기호, 특정한 기능)
		// 산술연산 : +, - 등
		// 대입연산자 : =
		// 누적연산자 : +=, -=, *=, /=
		// 증감연산자 : ++, --
		// 비교연산자 : <,>,<=,>=,==,!=
		// 논리연산자 : &&, ||, !
		
		//int 숫자1;
		//int 숫자2;				//변수를 만듦
		//숫자1 = 3;
		//숫자2 = 2;				//변수에 값을 담음
		//int 숫자3 = 1;
		
		//System.out.println(숫자1+숫자2);
		//int 숫자3 = 숫자1 + 숫자2;
		//int 숫자1 = 숫자1 + 숫자2;
		//System.out.println(숫자1);
		//숫자1 = 숫자1 + 숫자2;	 			// 숫자1 값과 숫자2값을 더한 후 숫자1 공간에 저장
		
		//숫자1 += 숫자2;	//int 숫자1 = 숫자1+숫자2; 와 같음
		
		//int 숫자4 = 0;
		//System.out.println(숫자4);
		//숫자4 = 숫자4+1;
		//System.out.println(숫자4);
		
		//숫자4 += 2;				// 숫자4 = 숫자4 +2;
		
		//숫자4 -= 1;				// 숫자4 = 숫자4 -1
		
		//숫자4 *= 2;				// 숫자4= 숫자4*2
		
	
		int i = 0;
		
		i += 3;
		System.out.println("i += 3"+i);
		
		i += 3.14;
		System.out.println("i += 3.14"+i);
		
		i *= 2;
		System.out.println("i*=2"+i);
		
		i/=2;
		System.out.println("i/=2"+i);
	
		
	
	}
}
