package day03;

import java.util.Scanner;

public class If4 {
	public static void main(String[] args) {
		//국어, 영어, 수학
		//각각 40점 이상이고
		//총합이 150점 이상이면 '합격'
		//그 외에는 '불합격'
		
		Scanner scanner = new Scanner(System.in);
		int 국어;
		int 영어;
		int 수학;
		System.out.println("국어점수를 입력하세요");
		국어=scanner.nextInt();
		System.out.println("영어점수를 입력하세요");
		영어=scanner.nextInt();
		System.out.println("수학점수를 입력하세요");
		수학=scanner.nextInt();		
		
		
		if (국어>=40&&영어>=40&&수학>=40&&국어+영어+수학>=150) {System.out.println("합격");
			
		} else {
			System.out.println("불합격");
		}
		
		
		//선생님 방식 
		//int 국어, 영어, 수학, 총합;
		//가운데는 같고
		//총합 = 국어 + 영어 + 수학 ;
		//if~
//		if (총합>=150) {if (국어>=40&&영어>=40&&수학>=40) {System.out.println("합격");
//			위 조건이 맞으면     이 조건도 확인   후               출력    ->if 중첩
//		}else{System.out.println("과락")
//			
//		} else{System.out.println("불합격")
		
	}
}
