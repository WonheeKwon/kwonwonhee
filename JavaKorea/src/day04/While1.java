package day04;

public class While1 {
	public static void main(String[] args) {
		//조건문 : if, switch (만약에)
		//반복문 : while,for (동안에)
				
		int age = 30;
		if (age >= 20) {		//if는 소괄호 내용이 맞으면 중괄호 실행 틀리면 무시
			System.out.println("if문:" +age);
			}
		//while : if와 유사하나 다름 / 소괄호 내용이 맞으면 틀릴때까지 중괄호 계속 실행, 틀리면 중괄호 무시하고 진행
		//while은 별다른 작업을 안해주면 무한반복에 빠짐 -> 밑의 코드가 실행 안됨
		
		//반복문 while
		while (age>=20) {
			System.out.println("while문"+age);
			}
		
		
		
		
		
	}
}
