package kr.or.ddit.HomeWork;

import java.util.Scanner;

public class HomeWork11_3 {

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork11_3 obj = new HomeWork11_3();
		obj.grade();
	}
	
	public void grade() {
		System.out.print("첫번째 과목 점수 -> ");
		int s1 = sc.nextInt();
		System.out.print("두번째 과목 점수 -> ");
		int s2 = sc.nextInt();
		System.out.print("세번째 과목 점수 -> ");
		int s3 = sc.nextInt();	
		Grade sum = new Grade(s1, s2, s3);
		System.out.println(sum);
	}
}

//Grade 클래스
class Grade{
	int sum;
	
	public Grade(int s1, int s2, int s3) {
		
		this.sum = s1 + s2 + s3;
	}

	@Override
	public String toString() {
		return "학생 총점 : " + sum;
	}
	
}

