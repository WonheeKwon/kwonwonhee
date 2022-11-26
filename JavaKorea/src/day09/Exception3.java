package day09;

import java.io.BufferedReader;
import java.io.IOException;

// exception: 제일 포괄적임
// IOException:  Input Output 관련된 예외에 대한 범위(작아짐)

public class Exception3 {
	public static void main(String[] args) throws Exception{
		Try3 try3 = new Try3();
		try3.go();
		//throws Exception : 예외가 발생할 경우 exception클래스에 맡긴다.
	}
}

class Try3 {
	private BufferedReader br = null;
	
	public void go() throws Exception {
		//1번 try~catch 사용 : 프로그램 강제종료를 막음
		try {								//오류가 나면 try
			br.read();
		}
		catch (IndexOutOfBoundsException e) {		//얘마저 오류나면 catch
				e.printStackTrace();}				//배열범위가 넘어갔을때 예외처리
		
		catch (IOException e) {			
				e.printStackTrace();}				//IO오류가 났을 때만
		
		catch (Exception e) {			
				e.printStackTrace();			//모든 예외대상에 대해서
		}		
		
		//2번 메서드에 throws Exception 사용
		br.read();
	}
}