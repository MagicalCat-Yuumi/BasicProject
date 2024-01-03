package kr.or.ddit.HomeWork;

import java.util.Calendar;
import java.util.Scanner;

public class HomeWork17 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork17 obj = new HomeWork17();
		obj.process();
	}

	private void process() {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		
		System.out.print("연도 입력 ");
		int year = sc.nextInt();
		
		while (true) {
			int month = cal.get(Calendar.MONTH) + 1;
			int monthLastDay = cal.getActualMaximum(Calendar.DATE);
			
			cal.set(year, month -1 ,1);
						
			// 해당 주에 현재 요일
			// 1 ~ 7
			int day = cal.get(Calendar.DAY_OF_WEEK);
			System.out.println(" \t <이전달 \t  "+year+"년  "+month+"월\t다음달>\n");
			System.out.println("일\t월\t화\t수\t목\t금\t토");
			int cur = 1;
			for(int i=0; i<=42; i++) {
				if(i < day) {
					System.out.print("\t");
				}else {
					System.out.printf("%02d\t", cur);
					cur++;
				}
				if(i % 7 == 0) {
					System.out.println();
				}
				if(cur > monthLastDay) {
					break;
				}
			}

			System.out.println();
			String input = sc.next();
			if (input.equals("<")) {
                cal.add(Calendar.MONTH, -1); // 한 달 빼기
                year = cal.get(Calendar.YEAR);
            } else if (input.equals(">")) {
                cal.add(Calendar.MONTH, 1); // 한 달 더하기
                year = cal.get(Calendar.YEAR);
            } else {
                break;
            }
		}
	}
}
