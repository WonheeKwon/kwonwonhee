package day04;

public class Flow1 {
	public static void main(String[] args) {
		//조건문안에 반복문
		int flag =1;
		if(flag != 0) {
			for(int i=0;i<5;i++) {
				System.out.println("조건문 안에 반복문");
			}
		}
		
		//반복문 안에 조건문
		for(int i=0; i<5; i++) {
			if(i%2==0) {System.out.println("반복문 안에 조건문"+i);
			
			}
		}
		
		//조건문 안에 조건문
		int age = 30;
		if(age>=20) {
			System.out.println("성인");
			if(age<50) {
				System.out.println("50세 미만");						//처음 있는 if 거르지 못하면 뒤 조건문 반영 못함
			}						
		}
		
		//반복문 안에 반복문
		for(int out = 0; out<3; out++) {						//바깥반복문한번에 안쪽반복문 계속 반복, 또다시 앞으로와서 바깥반복문 두번에 안쪽반복문 계속반복~ 
			System.out.println("바깥 반복문"+(out+1));				//괄호 써줘야함
			for(int in=0; in<3; in++) {
				System.out.println("안쪽 반복문"+(in+1));
			}
					
		}
		
		
		
		
	}
}
