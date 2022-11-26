package day08;

//데이터(변수)를 저장하는 부분 mvc패턴
public class Model {
	private int price;
	
	private String menu;

	//기본생성자
	public Model( ) {
		
	}
	
	//우클릭 소스, 머 누르면 아래 뜸
	public Model(int price, String menu) {
		super();
		this.price = price;
		this.menu = menu;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}



}
