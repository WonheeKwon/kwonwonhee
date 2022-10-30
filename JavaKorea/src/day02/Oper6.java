package day02;

public class Oper6 {
	public static void main(String[] args) {
		// 연산자 (연산기호, 특정한 기능)
		// 산술연산 : +, - 등
		// 대입연산자 : =
		// 누적연산자 : +=, -=, *=, /=
		// 증감연산자 : ++, --
		// 비교연산자 : <,>,<=,>=,==같다,!=다르다
		// 논리연산자 : &&, ||, !
		
		// && : and	(앞뒤 모두 true 여야 true)
		// || : or	(앞 또는 뒤 둘중 하나만 true 여도 true)
		// ! : not ( boolean 값을 반대로 ), true 면 false로 false면 true로
		boolean tst = !(true);		//false 로 들어감
		
		boolean 참 = true;
		boolean 거짓 = false;
		
		//and &&
		System.out.println("참&&참: "+(참&&참));
		System.out.println("참&&거짓: "+(참&&거짓));
		System.out.println("거짓&&참: "+(거짓&&참));
		System.out.println("거짓&&거짓: "+(거짓&&거짓));
		
		//청소년 14세이상~20세미만
		int age = 15;
		System.out.println(age>=14&&age<=20);
		
		//or ||
		System.out.println("참||참: "+(참||참));
		System.out.println("참||거짓: "+(참||거짓));
		System.out.println("거짓||&참: "+(거짓||참));
		System.out.println("거짓||거짓: "+(거짓||거짓));
		
		//키가 150cm이상이거나 나이가 15이상이면 통과
		//double height = 140.0;
		//System.out.println(height>=150 || age>=15);
		
		//not !
		//System.out.println(!false);
		
		//System.out.println("===============================================");
		
		//page12
		
		//int x= 100;
		//int y= 200;
		//boolean result = true
				
		//System.out.println(x<y&&y<200);
		
	}
}
