package day09;

import java.util.Random;
import java.util.Scanner;

public class Random3 {
	public static void main(String[] args) {
		MyRandom3 mr3 = new MyRandom3();
		mr3.go();
	}
}

class MyRandom3{
	public void go() {
		Random rand = new Random();
		Scanner sc= new Scanner(System.in);
		int num1 = 0, num2 = 0, result = -1;
		
		System.out.println("최소범위를 입력하세요");
		num1 = Integer.parseInt(sc.nextLine());
		
		System.out.println("최대범위를 임력하세요");	
		num2 = Integer.parseInt(sc.nextLine());
	
		result = rand.nextInt((num2+1)-num1) + num1;
		
		System.out.println(result);
		
		
	}

}