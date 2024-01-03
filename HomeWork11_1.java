package kr.or.ddit.HomeWork;

import java.util.Scanner;

public class HomeWork11_1 {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		HomeWork11_1 obj = new HomeWork11_1();			
		obj.std();
	}
	public void std() {
		System.out.print("학과 입력 -> ");
		String major = sc.next();
		System.out.print("학번 입력 -> ");
		int snum = sc.nextInt();
		
		//Student 객체 생성
		Student student1 = new Student(major,snum);
		
		//값 출력
		System.out.println(student1);
	}
	
}

class Student{
	
	//필드 선언
	String major; // 학과
	int snum; // 학번 
	
	Student(String major , int snum){
		this.major = major;
		this.snum = snum;
	}

	@Override
	public String toString() {
		return "학생 정보 -> 학과  : " + major + ", 학번 : " + snum;
	}
}
