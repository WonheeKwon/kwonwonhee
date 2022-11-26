package day04;

public class Array2 {
	public static void main(String[] args) {
		String menu[] = {"에스프레소","아메리카노","카페라떼"};
		int price[] = {1500, 2500, 3500};					//3칸 0~2까지
		
		
		for(int i=0; i<menu.length;i++) {							//length 배열의 끝까지
			System.out.println(menu[i]+":"+price[i]);				//메뉴의 i번째는 가격의 i번째
		}
	
		// 배열 초기화(선언(생성)과 동시에 값 대입)
		int num[] = {0,10,20,30,40};
		
		//배열 선언만 먼저 하고싶다면?(값 넣지 않고 공간만 먼저 만드는 것)    ->이렇게 잘안함
		int no[] = new int[5];
		int numbers[];
		int myNum[]; //중간 대문자는 띄어쓰기 의미함
				
		//대입(수정, 위 배열의 숫자를 바꿀 수 있다)
		num[0]=5;
		no[0]=5;
		
	
		
	}
}
