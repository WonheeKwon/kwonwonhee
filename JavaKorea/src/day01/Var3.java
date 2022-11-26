package day01;

public class Var3 {
	public static void main(String[] args) {
	//변수(variable) - 저장공간
	// 저장공간에도 종류가 많음
	// 숫자형, 소수점있는 숫자형, 글자형, 등
		
		String 변수1 = "저장공간1";   //; 안쓰면 문장 종료가 안됨. 에러뜸
	// 13 다시 4 인지 빼기인지 구분 안감. 변수의 형태 정해야 함.

		//숫자를 저장하는 공간
		int 뺄셈 = 13-4;
		//글자를 저장하는 공간
		
		String 휴대폰 = "010000000";
		//소수점있는 숫자
		double 파이 = 3.14;
		
		//공간을 처음 만들 땐
		//String var1;    //공간만 만들어줌(선언)
		//String var2 = "hi";	//공간만들면서 값도 넣어줌(초기화)
		//var1 = "hello";		//이미 있는 공간에 값을 넣음(대입)
	
		
		String name = "권원희";
		int year = 1997, month = 10, day = 06;
		double height = 165.0;
	
		System.out.println("이름: "+name);
		System.out.println("생일: "+year);
		System.out.println("height: "+height+"cm");
		
	}
}
