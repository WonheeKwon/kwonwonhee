package day02;

public class Oper4 {
	public static void main(String[] args) {
		// 연산자 (연산기호, 특정한 기능)
		// 산술연산 : +, - 등
		// 대입연산자 : =
		// 누적연산자 : +=, -=, *=, /=
		// 증감연산자 : ++, --
		// 비교연산자 : <,>,<=,>=,==,!=
		// 논리연산자 : &&, ||, !
		
		int 숫자1 = 0;
		숫자1 += 1;			//숫자1 = 숫자1 +1;
		숫자1++;				// 숫자1+=1;
		
		숫자1 += 2; 			// 이건 안됨. 누적값이 1일 경우에만 ++ 대체 가능
		
		숫자1 -= 1;			// 숫자1 --;
		
		int num = 3;
		num --;	
		System.out.println(num);
		num++;		//num += 1;
		System.out.println(num);
		
		++num;				//앞에쓰면 먼저 1을 누적 연산하고 시작
		num++; 				//해당코드 실행 후 다끝나면 1을 누적연산
		
		int 숫자2 = 0;
		System.out.println(++숫자2);			// ++하고 출력  다른 수식 없이도 ++가 출력 전 값 변형 줌
		System.out.println(숫자2++);			// 출력하고 ++  출력 후 값 변형
		System.out.println(숫자2);
		
		num = num +1;
		num += 1;
		num ++;
		
	}
}
