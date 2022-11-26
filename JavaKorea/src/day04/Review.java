package day04;

public class Review {
	public static void main(String[] args) {
		String name = "sung";	//문자열 변수			변수:저장공간
		int age = 33;			//정수 변수
		double height = 177.0;	//실수 변수
		boolean marry = false;	//불린 변수 (참거짓)		false:0		true:1
		
		//조건문 : if, switch ->조건이 맞으면 {}실행
		//if~else~if~else
		//switch~case~break
	
		if (age>=20) {
			System.out.println("성인");					//"한줄만 있으면 중괄호 생략가능->그러나 추천 안함"
		}else if (age>=0) {
			System.out.println("미성년자");			//상한선을 적지 않아도 첫번째 조건문이 있어서 알아서 0~20 사이는 미성년이 됨
		}else {
			System.out.println("?");
		}
		
		switch (age/10) {
		case 0: System.out.println("어린이");
			break;
		case 1: System.out.println("10대");
			break;
		case 2: System.out.println("20대");
			break;
		default:System.out.println("30대 이상");
			}
		
		
		
		
	
		
		
		
	}
}
