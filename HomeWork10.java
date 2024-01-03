package kr.or.ddit.HomeWork;

import java.util.Scanner;

public class HomeWork10 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork10 obj = new HomeWork10();
		obj.process();
	}
	
	public void process() {
		Member[] memList = new Member[10];
		int cur = 0;
		
		while(true) {
			/*
			 *  스캐너를 통해 
			 *  나라, 지역, 이름을 입력 받기 
			 *  
			 *  지역이 대전이라면 파라미터 1개 생성자  
			 *  아니라면 2개 생성자 호출하기.
			 */
			System.out.println("멤버 추가 여부 (1 or 2)");
			String input =sc.next();
			if(input.equals("2")) {
				System.out.println("종료합니다.");
				break;
			}else if(!input.equals("1")&&!input.equals("2")){
				System.out.println("님?");
				continue;
			}
			else {
				System.out.print("지역을 입력하세요 -> ");
				String rgo = sc.next();
				System.out.print("이름 입력 -> ");
				String name = sc.next();
				Member mem = null;
				if(rgo.equals("대전")) {				
					Member m = new Member(name);
					System.out.println(m);
				}else {
					Member m2 = new Member(rgo, name);
					System.out.println(m2);
				}
				memList[cur++]=mem;
			}
		}
	}
	
}
class Member{
	/*
	 *  나라  - 한국
	 *  지역  - 대전
	 *  이름 
	 */
	
	String state;
	String region; 
	String name;
	
	Member(String name){	
		this("한국", "대전", name);
		System.out.println("파라미터 1개 생성자 사용");
	}
	
	Member(String region, String name){
		
		this("한국", region, name);
		System.out.println("파라미터 2개 생성자 사용");
	}
	
	// 기본 생성자
	Member(String state, String region, String name) {
		this.state = state;
		this.region = region;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Member: 나라  = " + state + ", 지역 = " + region + ", 이름 = " + name ;
	}
}