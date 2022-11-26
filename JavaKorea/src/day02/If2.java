package day02;

import java.nio.file.attribute.AclFileAttributeView;

public class If2 {
   public static void main(String[] args) {
      //else를 두지 않은 상태에서 if 조건에 못미치는 값 넣으면 아무것도 출력 안됨
      int age = 12;
      
      if (age<10) {System.out.println("어린이");
         
      }else if (age<20) {System.out.println("10대");
         
      }else if (age<30) {System.out.println("20대");
      }else if (age<40) {System.out.println("30대");
         
      }else {
         System.out.println("그 외 40대 이상");
      }
      
      int 나이 = 15;
      int 금액 = 0;
            
      if (나이<14) {System.out.println("어린이");
      
      }else if (나이>14&&나이<20) {System.out.println("청소년");
      
      }else if (나이>=20) {System.out.println("성인");
      
         
      }
      
      
      }
   
}
