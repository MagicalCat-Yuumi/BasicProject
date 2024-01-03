package kr.or.ddit.HomeWork;

import java.util.Scanner;

public class HomeWork6 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork6 obj = new HomeWork6();
//		obj.method1();
//		obj.method2();
//		obj.method3();
//		obj.method4();
		obj.method5();
	}

	private void method1() {
		/*
		 * 스캐너를 통해 숫자를 입력 받고 해당 숫자에 해당하는 구구단을 출력하시오
		 * 
		 *  3*1 =3	
			3*2 =6	
			3*3 =9	
			3*4 =12
			3*5 =15
			3*6 =18
			3*7 =21
			3*8 =24
			3*9 =27
		 */
		System.out.print("숫자를 입력하세요 -> ");
		int num = sc.nextInt();
		
		for (int i = 1; i < 10; i++) {
			System.out.println(num + "*" + i + " = " + (num * i));
		}
		
	}
	
	private void method2() {
		/*
		 *  for 문 2개를 이용하여 구구단 전체를 출력하시오.
		 * 
		    2*1 =2	3*1 =3	..............	
			2*2 =4	3*2 =6	4*2 =8	5*2 =10	6*2 =12	7*2 =14	8*2 =16	9*2 =18	
			2*3 =6	3*3 =9	4*3 =12	5*3 =15	6*3 =18	7*3 =21	8*3 =24	9*3 =27	
			2*4 =8	3*4 =12	4*4 =16	5*4 =20	6*4 =24	7*4 =28	8*4 =32	9*4 =36	
			2*5 =10	3*5 =15	4*5 =20	5*5 =25	6*5 =30	7*5 =35	8*5 =40	9*5 =45	
			2*6 =12	3*6 =18	4*6 =24	5*6 =30	6*6 =36	7*6 =42	8*6 =48	9*6 =54	
			2*7 =14	3*7 =21	4*7 =28	5*7 =35	6*7 =42	7*7 =49	8*7 =56	9*7 =63	
			2*8 =16	3*8 =24	4*8 =32	5*8 =40	6*8 =48	7*8 =56	8*8 =64	9*8 =72	
			2*9 =18	3*9 =27	4*9 =36	5*9 =45	6*9 =54	7*9 =63	8*9 =72	9*9 =81	
		 */
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.print(j + "*" + i + "=" + (j * i)+" ");
			}
			System.out.println();
		}
	}
	
	private void method3() {
		/*
		 *  for 문 2개를 이용하여 구구단 전체를 출력하시오.
		 *  스캐너를 통해 숫자를 입력 받고 해당 숫자에 해당하는 구구단은 제외. 
		 *  ex ) 입력 3 
   			2*1 =2	..............	
			2*2 =4	4*2 =8	5*2 =10	6*2 =12	7*2 =14	8*2 =16	9*2 =18	
			2*3 =6	4*3 =12	5*3 =15	6*3 =18	7*3 =21	8*3 =24	9*3 =27	
			2*4 =8	4*4 =16	5*4 =20	6*4 =24	7*4 =28	8*4 =32	9*4 =36	
			2*5 =10	4*5 =20	5*5 =25	6*5 =30	7*5 =35	8*5 =40	9*5 =45	
			2*6 =12	4*6 =24	5*6 =30	6*6 =36	7*6 =42	8*6 =48	9*6 =54	
			2*7 =14	4*7 =28	5*7 =35	6*7 =42	7*7 =49	8*7 =56	9*7 =63	
			2*8 =16	4*8 =32	5*8 =40	6*8 =48	7*8 =56	8*8 =64	9*8 =72	
			2*9 =18	4*9 =36	5*9 =45	6*9 =54	7*9 =63	8*9 =72	9*9 =81	
		 */
		
		System.out.print("숫자를 입력하세요 -> ");
		int num = sc.nextInt();

		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				if (num == j)
					continue;
				System.out.print(j + "*" + i + "=" + (j * i) + " ");
			}
			System.out.println();
		}
	}
	
	private void method4() {
		/*
		 * 양의 정수 n이 매개변수로 주어질때 
		 * n이 홀수라면 n 이하의 홀수인 모든 양의 정수 합
		 * n이 짝수라면 n 이하의 짝수인 모든 양의 정수제곱의 합
		 */
		int n = (int)(Math.random()*100)+1;
		int sum = 0;
		
		
		System.out.println(n + " 이 나왔네여");

		if (n % 2 == 0) {
			for (int i = 2; i <= n; i += 2) {
				sum += i * i;
			}
		} else {
			for (int i = 1; i <= n; i += 2) {
				sum += i;
			}
		}

		System.out.println("합 -> " + sum);
	}
	
	private void method5() {
		/*
		 *   키보드로 돈을 입력 받아 화폐단위별로 개수를 구하시오.
		 *   ex ) 77550 -> 10000 7장 5000 1장 1000원 2장 500원 한개 50원 한개
		 */

		int[] coin = {50000, 10000, 5000, 1000, 500, 100, 50, 10 };

		System.out.print("돈 입력 -> ");
		int money = sc.nextInt();
		System.out.print(money + " -> ");
		for (int i = 0; i < coin.length; i++) {

			int result = money / coin[i];
			money = money % coin[i];
			
			if (result != 0) {
				System.out.print(coin[i] + " : " + result + "개 ");
			}

		}

	}
	
	
	
	

}
