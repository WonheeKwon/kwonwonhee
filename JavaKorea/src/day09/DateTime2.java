package day09;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTime2 {
	public static void main(String[] args) {
		MyTimer2 mytimer2 = new MyTimer2();
		mytimer2.go();
	}
}

class MyTimer2{
	public void go() {
		while(true) {
			curTime();	
			try {	
				Thread.sleep(1000);				//프로그램을 1초(1000ms)마다 쉬어줘라
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}				
			
		}
		
	}

	public void curTime() {
		//현재시간 Calender, Date, SimpleDateFormat
		Calendar c = Calendar.getInstance();
		Date date = c.getTime();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yy년 MM월 dd일 - HH:mm:ss");
		String cur_time = sdf.format(date);			//형식 재구성
	
		System.out.println(cur_time);
	}



}

