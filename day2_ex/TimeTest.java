package day2_ex;

public class TimeTest {

	public static void main(String[] args) {
		int time = 32150; // 초기화
		int hour = time/3600; // 시간
		int min = (time%3600)/60; // 분
		int sec = time%60; // 초
		
		System.out.println(hour+"시간 "+min+"분 "+sec+"초"); //앞애 널문자열이 있을 필요가 없다.""+ 불필요
	
	}

}
