package day08;

public class Extends1 {
	public static void main(String[] args) {
		
		Star star = new Star("아이스아메리카노",2000); 
		StarBupyeong starB = new StarBupyeong("아이스아메리카노",2000,1800); 
		starB.Info();
		starB.Sell();
		star.Info();
		star.Sell();
	}
}
//1. 상속용 2. 모든 메서드가 재정의되어야만 함. 3.명세서를 제공			--> Interface로 추가하라. : 명세서대로 안하면 오류 발생(누락방지)
class Star{
	protected int price;
	protected String menu;
	static int menu2;				//굳이 객체화를 안해도 갖다 쓸 수 있음. 기존변수와 다른 공간에 저장되어서 계속 살아있음
	
	Star(String menu, int price){
		
		this.menu = menu;
		this.price = price;
		
	}
	public void Sell() {System.out.println("본점의 "+ menu + "는 " + price + "원 입니다");}
	public void Info() {System.out.println("본점에서는 "+ menu + " 를" + "판매합니다");}
	//본사: 스타벅스가 갖춰야할 기본 데이터(변수)와 기능(함수)

	//기능 ㅇㅇ을 판매합니다.
	//ㅇㅇ의 가격은 ㅇㅇ원입니다.
}

class StarBupyeong extends Star{
	protected int Bprice;
	public StarBupyeong(String menu, int price, int Bprice) {
		super(menu, price);
		this.Bprice = Bprice;
		;
	}
	@Override					// 부모클래스에서 썼던 함수를 또 쓸 수 있음
	public void Sell(){
	//	int num = 0; 				-> sell함수가 사용되는 동안만 생성되었다가 sell함수가 끝나면 없어짐(지역변수)->데이터 아낄 수 있음
		
		System.out.println("부평점의 "+ menu + "는 " + Bprice + "원 입니다");
	}
	
	@Override
	public void Info(){ System.out.println("부평점에서는 "+ menu + "를 " + "판매합니다" );
	
	
	
	
	//부평점: 스타벅스가 기본적으로 갖춰야할 것 + 부평점만의 특징
//부평점 ㅇㅇ을 판매합니다.
//부평점 - ㅇㅇ의 가격은 ㅇㅇ원 입니다.
}
	
}
//인터페이스를 상속받을 때에는 impl 하고 컨트롤 스펭스
class StarGangnam implements Star2{					
	int price;
	String menu;
	
	//
	public StarGangnam(String menu, int price) {
		this.price = price;
		this.menu = menu;
		// TODO Auto-generated constructor stub
	}
		
	
	@Override
	public void sell() { System.out.println("강남점의 "+ menu + "는 " + price + "원 입니다");
		// TODO Auto-generated method stub
		
	}
	@Override
	public void info() { System.out.println("강남점의 "+ menu + "는 " + price + "원 입니다");
		// TODO Auto-generated method stub
		
	}}

interface AA{
	
}

//다중 상속가능. new 클래스 이름 오류에 위 메시지 클릭하면 아래 override 자동 생성
//class SS extends implements AA, Star2{

//	@Override
//	public void sell() {
		// TODO Auto-generated method stub
		
	//}

	//@Override
//	public void info() {
		// TODO Auto-generated method stub
		
//	}

//}