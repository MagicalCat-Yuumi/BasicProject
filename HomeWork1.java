package kr.or.ddit.HomeWork;

public class HomeWork1 {

	public static void main(String[] args) {
		//1년은 365.2422 일이다.
		
		double day = 365.2422;
		
		int days = (int)day; // 일
		
		day = day - days;
	
		int hours =(int)(day*24);
	
		double min = ((double)day*24 - hours)*60;
		
		int mins = (int)min;
		
		double sec = (min-mins)*60;
		
		int secs = (int)sec;
		
		System.out.println("1년은 365일 "+hours+"시간 "+mins+"분 "+secs+"초 입니다.");
		
	}

}
