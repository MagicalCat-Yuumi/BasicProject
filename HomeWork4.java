package kr.or.ddit.HomeWork;

import java.util.Scanner;

public class HomeWork4 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork4 obj = new HomeWork4();
		obj.process1();
	}

	public void process1() {
		/*
		 * 0 -> 가위 1 -> 바위 2 -> 보
		 * 
		 * 컴퓨터가 랜덤으로 내는 가위 바위 보랑. 내가 입력한 가위 바위 보를 비교해서 승패를 출력 하시오 if 문 사용 ex) 컴퓨터 : 가위 ,
		 * 사람 : 보, 결과 : 졌다/이겼다/비겼다.
		 */

		int com = (int) (Math.random() * 3);
		System.out.println("가위 : 0, 바위 : 1, 보 : 2");
		int player = sc.nextInt();
		String com_s ="";
		String player_s ="";
		
		if(com ==0) com_s ="가위";
		if(com ==1) com_s ="바위";
		if(com ==2) com_s ="보";
		
		if(player == 0) player_s="가위";
		if(player == 1) player_s="바위";
		if(player == 2) player_s="보";
			
		System.out.printf("com : %s \t user : %s\n" , com_s, player_s);

		if (player == 0) {
			
			switch (com) {
			case 0:
				System.out.println("비겼다");
				break;

			case 1:
				System.out.println("졌다.");
				break;

			default:
				System.out.println("이겼다");
				break;
			}
		}

		else if (player == 1) {
			
			switch (com) {
			case 0:
				System.out.println("이겼다");
				break;

			case 1:
				System.out.println("비겼다.");
				break;

			default:
				System.out.println("졌다");
				break;
			}
		}

		else if (player == 2) {
			
			switch (com) {
			case 0:
				System.out.println("졌다");
				break;

			case 1:
				System.out.println("이겼다.");
				break;

			default:
				System.out.println("비겼다");
				break;
			}
		}

		else
			System.err.println("잘못된 입력!");

	}

}
