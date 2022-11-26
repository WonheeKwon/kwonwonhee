package day03;

public class While2 {
	public static void main(String[] args) {
		// while은 무한반복을 방지하기 위해 플래그를 세움
		// 반복문 : 유사한 코드를 원하는 횟수만큼 실행시키기 위해서 
		
		 //5번 해주고 싶을 땐 
//		System.out.println("Hello");         +ctrl +alt + 아래방향키 -> 복사
//		System.out.println("Hello");  
//		System.out.println("Hello");  
//		System.out.println("Hello");  
//		System.out.println("Hello");  
//	
		//15번 해주고 싶을 땐? 관리하기 어려움 그래서 반복문을 사용함. 횟수를 숫자로 나타낼 수 있음
		
		int i = 0; 					//플래그 0
		while (i != 3)//i가 5인 순간에 소괄호를 틀리게 처리하여 출력 x 하게 함 
			{System.out.println("Hello");
			i++;	//중괄호 실행할 때마다 i를 1씩 늘려줄것임
			
			
		}
		
		
		
		
		
	}
}
