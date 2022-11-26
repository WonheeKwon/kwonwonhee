package day05;

public class Class4 {
 public static void main(String[] args) {
	Aircon aircon = new Aircon();			//클래스명 객체명정하기 = new 클래스명();
	aircon.temp = 20;						//Aircon안의 temp를 20으로 대입하겠다
	System.out.println(aircon.temp);		//그럼 에어컨 안의 온도는 20이 됨
	
	aircon.powerOn();
	aircon.tempUp();
	aircon.tempDown();
	aircon.currentTemp();
}
}

class Aircon{
	int temp = 25;
	
	void currentTemp() {
		int temp = 0;					//변수는 중괄호에서 만들어지면, 그 중괄호가 끝날 때 사라짐.(함수가끝나면사라짐)->지역변수
										//class안에서 만들어진 변수는(멤버변수) < 지역변수가 편리함, 우선순위임
		System.out.println("현재온도는 "+this.temp+" 입니다");			
		
		//this. : 멤버에 있는 변수 또는 메서드를 지칭. 지역변수 대신 멤버변수를 사용하도록 강제할 수 있음.
		//별다른 언급 없으면 무조건 멤버변수가 들어감 class 안의 함수에는 this가 늘 숨어져있음
		//중복이 있다면 this 유용. 중복 없다면 생략 가능
		//함수와 메서드는 this 유무의 차이
		
	}
	void tempUp() {
		temp++;
		System.out.println("에어컨을 온도를 올립니다 온도:" +temp);
	}
	
	void tempDown() {
		temp--;
		System.out.println("에어컨 온도를 내립니다 온도:" +temp);
	}
	void powerOn() {
		System.out.println("에어컨을 가동합니다 온도:" +temp);
	}
}
