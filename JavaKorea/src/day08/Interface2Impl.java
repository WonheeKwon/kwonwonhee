package day08;

import java.util.Scanner;

public class Interface2Impl {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Interface2 shop = null;
		int shop_num;
		
		System.out.println("지점을 입력하세요(1:강남, 2:신촌, 3:인천)");
		shop_num = sc.nextInt();
		if(shop_num == 1) {
		shop = new Gangnam();
		}else if (shop_num ==2 ) {
			shop = new Sinchon();
			
		}else if (shop_num ==3 ) {
			shop = new Incheon();
			
		}
	
		
		Interface2 gangnam = new Gangnam();						//다형성(자료형을 부모의 것으로 통일할 수 있음)
		Interface2 sinchon = new Sinchon();
		Interface2 incheon = new Incheon();
		
		shop.make("아메리카노",3000);
		shop.make("꿀아메리카노",3000);
		shop.coffeelist();
		
		System.out.println("구입할 커피를 입력하세요");
		gangnam.sell(sc.next());
	}
}

class Gangnam implements Interface2{
	String menu[] = new String[100];				//100개의 공간을 만들어 놓음
	int priceList[]= new int [100];
	int end_idx = 0;				//배열이 영부터 시작
	
	@Override
	public void sell(String coffee) {
		// 판매했다고 출력
		int index = -1;
		for(int i =0; i<menu.length;i++) {
		if(coffee.equals(menu[i])) {
			index = i;			//커피를 찾으면 인덱스에 백업
			break;
		}
		}System.out.println("강남점 "+ menu[index]+"를 " +priceList[index]+"에 판매하였습니다.");
	}

	@Override
	public void make(String coffee, int price) {
		// 커피항목+가격을 메뉴에 추가
		menu[end_idx] = coffee;
		priceList[end_idx] = price;
		end_idx++;			//다음 방번호를 순서대로 맞추려면
		System.out.println("강남점 커피를 추가했습니다.");
	}

	@Override
	public void coffeelist() {
		// 현재 커피리스트와 가격리스트를 출력
		// 에스프레소 : 2000원...
		System.out.println("강남점");
		for(int i =0; i<end_idx;i++) {
				if(menu[i].equals(null) || menu[i].equals("")) {
					break;
				}else {System.out.println(menu[i]+" : " + priceList[i] + "원");		
					
				}
				
				
	}}}
	
class Sinchon implements Interface2{
	String menu[] = new String[100];				//100개의 공간을 만들어 놓음
	int priceList[]= new int [100];
	int end_idx = 0;				//배열이 영부터 시작
	
	@Override
	public void sell(String coffee) {
		// 판매했다고 출력
		int index = -1;
		for(int i =0; i<menu.length;i++) {
		if(coffee.equals(menu[i])) {
			index = i;			//커피를 찾으면 인덱스에 백업
			break;
		}
		}System.out.println("신촌점 "+ menu[index]+"를 " +priceList[index]+"에 판매하였습니다.");
	}

	@Override
	public void make(String coffee, int price) {
		// 커피항목+가격을 메뉴에 추가
		menu[end_idx] = coffee;
		priceList[end_idx] = price;
		end_idx++;			//다음 방번호를 순서로 맞추려면
		System.out.println("신촌점 커피를 추가했습니다.");
	}

	@Override
	public void coffeelist() {
		// 현재 커피리스트와 가격리스트를 출력
		// 에스프레소 : 2000원...
		System.out.println("신촌점");
		for(int i =0; i<end_idx;i++) {
				if(menu[i].equals(null) || menu[i].equals("")) {
					break;
				}else {System.out.println(menu[i]+" : " + priceList[i] + "원");		
					
				}
				
				
	}}}

class Incheon implements Interface2{
	String menu[] = new String[100];				//100개의 공간을 만들어 놓음
	int priceList[]= new int [100];
	int end_idx = 0;				//배열이 영부터 시작
	
	@Override
	public void sell(String coffee) {
		// 판매했다고 출력
		int index = -1;
		for(int i =0; i<menu.length;i++) {
		if(coffee.equals(menu[i])) {
			index = i;			//커피를 찾으면 인덱스에 백업
			break;
		}
		}System.out.println("인천점 "+ menu[index]+"를 " +priceList[index]+"에 판매하였습니다.");
	}

	@Override
	public void make(String coffee, int price) {
		// 커피항목+가격을 메뉴에 추가
		menu[end_idx] = coffee;
		priceList[end_idx] = price;
		end_idx++;			//다음 방번호를 순서로 맞추려면
		System.out.println("인천점 커피를 추가했습니다.");
	}

	@Override
	public void coffeelist() {
		// 현재 커피리스트와 가격리스트를 출력
		// 에스프레소 : 2000원...
		System.out.println("인천점");
		for(int i =0; i<end_idx;i++) {
				if(menu[i].equals(null) || menu[i].equals("")) {
					break;
				}else {System.out.println(menu[i]+" : " + priceList[i] + "원");		
					
				}
				
				
	}}}

