package day02;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class If2 {
	public static void main(String[] args) {
		//else 안써놓고 if 조건에 못미치는 값 넣으면 아무것도 안뜸
		int age = 12;
		
		if (age<10) {System.out.println("어린이");
			
		}else if (age<20) {System.out.println("10대");
			
		}else if (age<30) {System.out.println("20대");
			
		}else if (age<40) {System.out.println("30대");
			
		}else {
			System.out.println("그 외 40대 이상");
		}
		int 나이 = 0;
		if (나이<14) {System.out.println("어린이");
		
			
		}else if (나이>14&&나이<20) {System.out.println("청소년");
		
			
		}else if (나이>=20) {System.out.println("성인");			}
			
		
		int 점수 = 100;			
		if (점수>=90) {System.out.println("공부벌레 입니다.");}
		
	
		int 나이1=0;
		int 금액 = 1000;
		if (나이1>=20) {System.out.println("성인입니다")금액,없음;
			
		}
	
	}}
