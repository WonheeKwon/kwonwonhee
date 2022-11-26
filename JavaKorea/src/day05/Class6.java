package day05;

public class Class6 {
	public static void main(String[] args) {
		Person 홍길동 = new Person();
		Person 이순신 = new Person();
		
		홍길동.setInfo("홍길동",19,"남자",170);
		이순신.setInfo("이순신", 22, "여자", 155);
		
		홍길동.getInfo(); 홍길동.sayHello();
		이순신.getInfo();	이순신.sayHello();
	}
}

class Person{
	String 이름;
	int 나이;
	String 성별;
	int 키;
	
	public void getInfo() {
		System.out.println("이름: "+이름+" 나이: "+나이+" 성별: "+성별+" 키: "+키);
	}
	
	public void sayHello() {System.out.println(이름+"이 인사합니다.");}
	public void setInfo(String 이름,int 나이,String 성별,int 키) {
		this.이름 = 이름;
		this.나이 = 나이;
		this.성별 = 성별;
		this.키 = 키;
		
	}
	
	// 이름, 나이, 성별, 키
	// 정보보기 기능 : getInfo(이름, 나이, 성별, 키 출력)
	// 인사하기(홍길동이 인사합니다.)
}