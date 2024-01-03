package kr.or.ddit.HomeWork;

import java.util.*;

public class HomeWork19 {

	Map<Integer, Integer> rst = new HashMap();

	public static void main(String[] args) {
		HomeWork19 hw = new HomeWork19();
		hw.roll(99999);
	}
	
	public int dice(){
		return (int) (Math.random()*6) + 1;
	}
	
	public int dice_result() {
		return dice()+dice();
	}

	public void roll(int n) { 


		for (int r = 0; r < n; r++) {
//			int dice_1 = (int) (Math.random() * 6) + 1; // 주사위 1
//			int dice_2 = (int) (Math.random() * 6) + 1; // 주사위 2
			
			int sum = dice_result();
			
			if(rst.containsKey(sum)) {
				rst.put(sum,rst.get(sum)+1);
			}
			else {
				rst.put(sum,1);
			}

			
		}

		for (int i = 2; i <= 12; i++) {
			System.out.print(i + " : ");
			 int dnum = rst.get(i);
			for (int j = 0; j < (dnum * 100) / n; j++) {
				System.out.print("■");
			}
			System.out.println();
		}

	}

}
