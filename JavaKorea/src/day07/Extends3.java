package day07;

public class Extends3 {
	public static void main(String[] args) {
		TestClass tc = new TestClass();
		
	}

}

//부모 클래스
class TestClass{
	//private : 나외에 다 사용 불가
	//protected : 상속받은 자식클래스까지는 허용
	//default(안적으면) : 같은 패키지면 허용
	//public : 같은 프로젝트면 허용
	
	//상속받으면 private -> protected로 바꿈
	
	protected int num;
	protected String str;
	private double dNum;					
	
	public void Print() {
		System.out.println("테스트 클래스 사용");
	}
}

//상속 : 부모클래스 복붙하고 추가하고싶은것, 수정하고싶은것 넣고
//class 새로운메서드 extends 부모클래스{@Override/ 부모의 변수를 활욯할 함수}
class TestClassex extends TestClass{			//위 class TestClass의 protected~dNum 변수 상속 시작
	//부모 변수에서 추가할 내용
	private int num2;			//부모 변수 대입
	
	//수정할 내용(오버라이딩)
	public void Print() {	
		int num2;
		System.out.println("TextClassEx가 만든 Print 사용");	//상속받은 변수를 활용할 새로운 함수 작성
	}
	
	//추가
	public int add() {
		System.out.println("추가된 메서드");					//새로운 함수 작성
		super.Print();//부모클래스에 있는 프린트 쓰겠다\		this.Print(); 는 어차피 자식클래스에서는 자식꺼가 우선적용이니까 쓸 필요 없음
		return 0;				
	}
}
// TestClass를 상속받아서 수정&추가
