package day04;

public class For1 {
	public static void main(String[] args) {
		//반복문: while, for
		//for: while이 너무 지저분하니까 정리해서 쓰자
		
		//while버전
		int x=0;
		while(x<5) {System.out.println("while안녕");
		x++;
		}
		
		//for버전
		for(int i=0; i<5; i++)	{
			System.out.println("for안녕");
		}
		
		//for(초기값;조건식;증감량){
		//반복하고자하는 코드들; 
		//}
		
		
		//1부터 10까지 합
		int b=0;
		int sum = 0;
		while(b<11) {
			//System.out.println(k);
			sum += b;
			b++;
		}
		System.out.println(sum);
		
		//For
		int 총합 = 0;
		for(int c=0; c<11; c++) {
			총합+=c;
			}
		System.out.println(총합);
		
//		1. 초기값을 생성
//		2. 조건식 검사
//		3. {}실행
//		4. 증감식
//		5. 조건식 검사
//		6. {}실행
		
	
	}
}
