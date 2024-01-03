package kr.or.ddit.HomeWork;

public class HomeWork11_2 {

	public static void main(String[] args) {
		TV tv = new TV("삼성", 2023, 81);	
		System.out.println(tv);
	}
}

class TV {
	String brand;
	int prod, size;

	public TV(String brand, int prod, int size) {
		this.brand = brand; // 제조사
		this.prod = prod; // 생산연도
		this.size = size; // 크기

	}

	@Override
	public String toString() {
		return "TV정보 -> 제조사 : " + brand + ", 생산연도 : " + prod + ", 크기 : " + size;
	}

}
