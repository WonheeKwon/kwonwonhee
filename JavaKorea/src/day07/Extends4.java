package day07;

public class Extends4 {
	public static void main(String[] args) {
	
	Human human = new Human("김김김",12);
	System.out.println("이름: "+human.get이름()+" 나이: "+human.get나이());


	Member member = new Member("김김김",12,123413);
	System.out.println("이름: "+member.get이름()+" 나이: "+member.get나이()+" 회원번호: "+member.get회원번호());
	
	}
}
//사람
//이름, 나이
//생성자를 통해서 정보를 입력
//게터세터

class Human{

	private String 이름;								//본클래스에서 사용할 변수 지정
	private int 나이;
	//getset
	public String get이름() {							//get: 변수를 사용할 때, 변수로 직접 사용하지 말고 이 메서드를 사용해라
		return 이름;
	}
	public void set이름(String 이름) {					//set: 변수에 값을 대입할 때, 이 메서드를 통해 해라 메인 입력값을 본 class에 대입할 수 있게 하기 위한 과정
		this.이름 = 이름;
	}
	public int get나이() {
		return 나이;
	}
	public void set나이(int 나이) {
		this.나이 = 나이;
	}
	//생성자
	Human(String 이름,int 나이){
		this.이름 = 이름;
		this.나이 = 나이;
	}

	
}

class Member extends Human{
	private int 회원번호;
	
	public Member(String 이름, int 나이, int 회원번호) {	
		super(이름,나이);
		this.회원번호 = 회원번호;
		System.out.println("회원번호: "+ 회원번호);
	}

	public int get회원번호() {
		return 회원번호;
	}

	public void set회원번호(int 회원번호) {
		this.회원번호 = 회원번호;
	}
	
//	public void 회원번호Info(){						-> 위에서 객체값을 활용하여 출력형태를 완성하였다면 Info 필요없음
//		
//	}
}

//휴먼 만든 후 멤버에 상속
//회원
//+회원번호
//생성자를 통해서 정보를 입력
//게터세터
//+회원소개

