package day07;

//상속
public class Extends1 {
	public static void main(String[] args) {
		MyString ms = new MyString();
		ms.setNum(3,-4);
		ms.getPlus();			//저장된 두 수를 더함
		
		// 두 수를 더하긴 더하는데 우리는 마이너스 값이 없다
//		MyStringEx mse = new MyStringEx();
//		ms.setNum(3,-4);
//		ms.getPlus();	
//		ms.getDiv();	
//
//		//우리는 플러스하면서 로고가 보여야한다
//		MyStringLogo msl = new MyStringLogo();
//		msl.setNum(3,-4);
//		msl.getPlus("===logo===");	
//		msl.getDiv();
		
		//버그 | 추가사항
		//추가사항 : 나눗셈 
		
		
		//===> 상속 extends
		
	}

}

class MyString{
	private int num1, num2;
	
	public void setNum(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
		
	}
	
	public int getPlus() {
		System.out.println(num1+num2);
		return num1+num2;
	}
	
	class MyStringEx{
		private int num1, num2;
		
		public void setNum(int num1, int num2) {
			if(num1<0) {
				num1 = num1*-1; 
			}
			if(num2<0) {
				num2 = num2*-1; 
			}
			
			this.num1 = num1;
			this.num2 = num2;
			
		}
		
		public int getPlus() {
			System.out.println(num1+num2);
			return num1+num2;
		}
		
		public double getDiv( ) {
			if(num2 ==0) {
			System.out.println((double)num1/num2);}
			return (double)num1/num2;
		}
		
		class MyStringLogo{
			private int num1, num2;
						
			public void setNum(int num1, int num2) {
				if(num1<0) {
					num1 = num1*-1; 
				}
				if(num2<0) {
					num2 = num2*-1; 
				}
				
				this.num1 = num1;
				this.num2 = num2;
				
			}
			
			public int getPlus() {
				System.out.println(num1+num2);
				return num1+num2;
			}
		
	
}}}