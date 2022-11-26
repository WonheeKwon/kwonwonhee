package day03;

import java.util.Scanner;

public class Switch2 {
	public static void main(String[] args) {
		String job ="";
		int salary = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("직급을 입력하세요");
		job=sc.next();
		
			
		switch (job) {
		case "사원": 
			salary =2800;
			break;
		case "대리":
			salary=3600;
		case "과장":
		salary=5000;
		case"부장":
		salary=7000;
		default:
			break;
		}
		
		System.out.println(job+"의 연봉은"+salary+"입니다");
	}
}
