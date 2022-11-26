package day08;

//Model(변수담기), View(화면), Controller(함수사용) MVC 코딩방식. 이 패턴 스프링에서 많이 사용함 
public class View {
	public static void main(String[] args) {
		Model model = new Model(3000,"아메리카노");	
		Model model2 = new Model(3000,"카페라떼");	
		//모델 변수에 3000이랑 아메리카노가 저장됨
		
		Controller con = new Controller(model2);					//모델 값을 컨트롤러로 넘긴 것
		
		System.out.println(con.sell()+"을(를) 판매합니다");
		System.out.println(con.info().getMenu() + "의 가격은 " + con.info().getPrice() + "원 입니다");
		//여기서만 syso 사용
		
	}//화면에 출력하는 부분
}

//흐름(로직)을 제어하는 부분
class Controller{					//변수 꾸러미를 모델을 통해서 갖고 다님
	
	Model model = new Model();		//Model클래스에 있는 변수를 꺼내올 수 있음(본 클래스에 변수를 추가한 셈)

	public Controller(Model model/*,int price, String menu 로 써도 됨 그러나 저게 더 단순*/) {
		this.model.setPrice(model.getPrice());
		this.model.setMenu(model.getMenu());
	
	}
	//     스트링도 클래스가 되어버림
	public String sell() { 
		
		return model.getMenu();						//이걸 메인클래스에서 사용함
		
	}
	public Model info() {
		return model;								//return 객체화된이름
	}
}