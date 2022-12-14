package day09;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTime1 {
	public static void main(String[] args) {
		MyTimer myTimer = new MyTimer();
		myTimer.go();
	}
}
class MyTimer {
	
	
	public void go() {
		//Calender, Date 제공 : 날짜와 시간을 알 수 있음
		//SimpleDateFormat: 내가 원하는 형식대로 날짜와 시간 재구성
		
		Calendar c = Calendar.getInstance(); 		//getInstance(): 클래스 일회성 사용만.(just 다른곳에다 넘겨주기위해 only)
		Date date = c.getTime();				//날짜와 시간이 ms(초)단위로 저장
		
		//우리가 보기 편한형태로 날짜와 시간을 구성
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy:mm:dd HH:mm:ss");
		String date1 = sdf.format(date);
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		String date2 = sdf2.format(date);
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd");
		
		String date3 = sdf3.format(date);
		
		SimpleDateFormat sdf4 = new SimpleDateFormat("HH:mm:ss");
		
		String date4 = sdf4.format(date);
		//출력
		System.out.println(date1);
		System.out.println(date2);
		System.out.println(date3);
		System.out.println(date4);
	}
	
}