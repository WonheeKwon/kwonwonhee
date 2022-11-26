package day07;

public class Review {
	public static void main(String[] args) {
		System.out.println("test");
		
		// 클래스 메서드
		// 클래스 : 변수와 함수의 꾸러미
		// 메서드 : 클래스 안에 있는 함수, 기능단위로 코드를 저장해놓는다
		
		//객체화 : 해당클래스에서 다른 클래스의 내용을 사용하고 싶을 때 해줘야하는 작업
		//클래스명 객체(변수)명 = new 클래스명();
		//변수명.
		
		MyClass mc = new MyClass();			//클래스명 객체 = new 생성자();
		mc.str="Hi";
		mc.Print();
		mc.Print2(11);
		
		ClassImport ci = new ClassImport();
		ci.setStr("Java");			//이전에는 ci.str="JAVA"; set 함수를 만들음.
		ci.setNum(314);				//이전에는 ci.num=314;
		System.out.println(ci.getStr());		//syso(ci.str);
		System.out.println(ci.getNum());
	}
}

class MyClass{		//변수+함수
	//변수
	int num;
	String str = "Hello";				//멤버변수를 초기화하지 않으면 기본 값이 들어감
	double dNum;
	
	//함수
	int Print() {
		for(int i =0; i<5; i++) {
		System.out.println(str+num);
		}
		return 0;		// return: 함수를 끝내고 사용한 곳에다가 최종값을 전달함
	}
	
	int Print2(int num) {
		for(int i =0; i<5; i++) {
			System.out.println(str+num);
			}
			return 0;	
	}
	
}