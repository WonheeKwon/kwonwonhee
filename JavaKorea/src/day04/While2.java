package day04;

public class While2 {
	public static void main(String[] args) {

		//System.out.println("Hello");
		//while() {}
		//내가 원하는 횟수만큼만 실행하도록 '플래그'세움
		//횟수를 카운팅할 수 있는 플래그(기준점)
		
		int i =0;
		while (i<5) {				//0,1,2,3,4 총 다섯번
			System.out.println("Hello");
			i++;					//반복문 한번 할때마다 플래그 1씩 증가시킨다 -> 증가 안시키면 플래그 계속 1, 그럼 조건문과 관계없이 무한 반복됨
		
		}
		
	}
}
