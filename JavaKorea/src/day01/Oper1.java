package day01;

public class Oper1 {
	public static void main(String[] args) {
		//변수에는 글자, 숫자, 소수점있는 숫자 있음
		// 변수 만들어놓고 사용안하면 경고 메시지 뜰 수 있음
		// String : 글자
		// int : 숫자(정수)
		// double : 소수점 있는 숫자(실수
		
		// 자료형 변수명;
		int 숫자1 = 3;
		int 숫자2 = 2;
		
		//프로그래밍에서는 연산이 가능(+,-,*,/,등)
		//연산을 시켜주는 기호들 -> 연산자
		System.out.println(1+1);
		System.out.println(3-4);
		System.out.println(3*3);
		System.out.println(10/2);
		
		//연산자 변수끼리도 가능(저장되어있는 값을 연산함)
		숫자1 = 1;
		숫자2 = 2;
		int 숫자3 = 숫자1+숫자2;
		System.out.println(숫자3);
		System.out.println(숫자1+숫자2);

		String 글자1 ="안녕";
		String 글자2 ="하세요";
		System.out.println(글자1+글자2);
		
	
		
		String str = "Hello" + "World";
		System.out.println(str);
		
		int num = 1+1;
		System.out.println(num);
		
		int num1 = 1-2;
		System.out.println(num1);
		
		int num2 = 2*3;
		System.out.println(num2);
		
		int num3 = 10%3;     //10을 세등분하고 남은 나머지 
		System.out.println(num3);
		
		
		//우선순위높은 : *, /   낮음 : +/-    (1+1)/2 이런식으로 묶어줘야함
		
		int 국어 = 55;
		int 영어 = 41;
		int 수학 = 62;
		int 합계 = 0;
		합계 = 국어 + 영어 + 수학;
		System.out.println(국어+수학+영어);
		System.out.println((국어+수학+영어)/3);   //비효율적
		System.out.println(합계);
		

		// int 평균 = 합계/3;				//딱 떨어지게
		double 평균 = 합계/3.0;		//소수점 다 나오게

		
		System.out.println("평균 : "+평균+"점");
		
		System.out.println((int)3.14);
		System.out.println(3.14);
	}
}
