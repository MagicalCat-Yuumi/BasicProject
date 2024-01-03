package kr.or.ddit.HomeWork;

import java.util.Scanner;

public class HomeWork11_4 {

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {	
		HomeWork11_4 obj = new HomeWork11_4();
		obj.process();
	}

	public void process() {	
		Rect[] rect =  new Rect[3];
		int cur = 0;

		double[] x = { 0, 0, 0, 0 };
		double[] y = { 0, 0, 0, 0 };
		
		while (cur < 3) {
			System.out.println(cur + 1 + "번째 사각형 가로 길이 입력");
			double l = sc.nextDouble();
			x[0] = l/2; x[1] = -l/2; x[2] = -l/2; x[3] = l/2;
			System.out.println(cur + 1 + "번째 사각형 세로 길이 입력");
			double h = sc.nextDouble();
			y[0] = h/2; y[1] = h/2; y[2] = -h/2; y[3] = -h/2;			
			Rect sh = new Rect(x, y);					
			rect[cur] = sh;			
			cur++;
		}
		
		if((rect[0].x[0] < rect[1].x[0]) || (rect[0].x[0] < rect[2].x[0]) || (rect[0].y[0] < rect[1].y[0]) || (rect[0].y[0]<rect[2].y[0])||
				(Math.abs(rect[0].x[2]) < Math.abs(rect[1].x[2])) || (Math.abs(rect[0].x[2]) < Math.abs(rect[2].x[2])) || (Math.abs(rect[0].y[2])< Math.abs(rect[1].y[2])) ||(Math.abs(rect[0].y[2])< Math.abs(rect[2].y[2]))){
			System.out.println("포함 안해요!");
			
		}else
			System.out.println("포함 해요!");
		
		
		
	}
}

class Rect {

	double[] x = { 0, 0, 0, 0 };
	double[] y = { 0, 0, 0, 0 };
	
	// 기본 생성자
	Rect(double[] x, double[] y) {
		this.x[0] = x[0]; this.x[1] = x[1]; this.x[2] = x[2]; this.x[3] = x[3];
		this.y[0] = y[0]; this.y[1] = y[1]; this.y[2] = y[2]; this.y[3] = y[3];
	}
}
