package day09;

import java.util.Random;

public class Random1 {
	public static void main(String[] args) {
		MyRandom1 mr1 = new MyRandom1();
		mr1.go();
	}
}
class MyRandom1 {
	public void go() {
		//랜덤을 돌리는 방법 2가지
		//1. Math.random()
		//2. Random클래스
		Random rand = new Random();
		//1. Math.random()
		double num1 = Math.random();	//0.0~0.9999999까지 랜덤 돌림
		System.out.println(num1);
	
		
		//0~99
		int num2 = (int)( Math.random()*100);
		System.out.println(num2);
		
		//1~100
		int num3 = (int)( Math.random()*100) + 1;		//(0~99)+1 후 1~100
		System.out.println(num3);
	
		//50~100
	//	int num4 = rand.nextInt(num1)+num2;				//(0~50)+50 후 50~100
	//	System.out.println(result);
	
	}
}