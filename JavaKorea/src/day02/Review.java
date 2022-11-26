package day02;
//Window -> Perspective -> Reset Perspective 하면 패키지 다시 뜸
//프로젝트 이름을 겹치지 않게 잘 설정해야 함. 
//변수이름 만들 때. 맨앞에는 숫자, 특수문자 x   / 한글과 영어만 가능. / 띄어쓰기 (_)로 써야함.
//왼쪽에 특수문자X
public class Review {
	public static void main(String[] args) {
		//출력 syso + (Ctrl+space) -> 자동완성
		//(디버깅없이)재생 버튼 or Ctrl+F11 -> 실행
		//문장 끝날때마다 무조건 ; 쓰기
		String World = "Java";
		System.out.println("Hello" + World);
		System.out.println("Hello" + World);
		System.out.println("Hello" + World);
		System.out.println("Hello" + World);
		System.out.println("Hello" + World);
	
		//Ctrl+Alt+아래키 : 커서있는 줄 밑으로 복붙
		//Ctrl+Z, Ctrl+Y : 뒤로돌리기, 뒤로돌리기 취소
		//변수 : 저장공간
		
		String str = "Hi";		//글자를 저장할 수 있는 공간
		int num = 0;				//숫자를 저장할 수 있는 공간
		double dnum= 0.0;			//소수점있는 숫자를 저장할 수 있는 공간
		//int num = "Hello"			-> 자료형이 값과 맞지 않으면 오류처리(자바가 알려줌)
	
		
		//자료형 변환
		System.out.println((double)num);
	
		//변수(공간)을 처음 만들 땐 변수이름 앞에다가 자료형을 적어주고
		//이미 만들어진 변수(공간)을 사용할 땐 자료형 없이 적어준다.
		str = "Hello";					//다른 값으로 바꿔줄 때
		System.out.println(str); 		//사용 시
	
		// = : 대입연산자(오른쪽의 값을 왼쪽의 공간에 담는다)
		str = "Java2";			
		
		World = str;		// World : 공간(왼쪽), str : 안에 들어있는 값(오른쪽)
		
		System.out.println(World);		//최후의 값으로 대입
		
		World = World;					//World(왼쪽) : 공간, 오른쪽: 안에 들어있는 값
		System.out.println(World);
	}
}
