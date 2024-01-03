package kr.or.ddit.HomeWork;

public class HomeWork8 {

	public static void main(String[] args) {
		HomeWork8 obj = new HomeWork8();
		obj.process();
	}
	
	public void process() {
		// 5명의 3과목 성적과 이름을 배열에 저장하고
		// 총점과 평균과 등수를 구하여 출력
		String[] name = { "최우제", "문현준", "이상혁", "이민형", "류민석" };
		int[][] score = {{85,72,81,0,0,1},
				{67,90,87,0,0,1},
				{77,79,94,0,0,1},
				{80,90,52,0,0,1},
				{97,65,77,0,0,1}
				};
		
		for(int i=0; i<score.length; i++) {
			score[i][3] = score[i][0] + score[i][1] + score[i][2];
			score[i][4] = score[i][3]/3;
		}
		
		// i= 본인
		for(int i=0; i<score.length; i++) {
			// 다른사람
			for(int j=0; j<score.length; j++) {
				// 내 점수보다 다른 사람 점수가 더 크면 내 등수를 하나 올림
				if(score[i][3] < score[j][3])
					score[i][5]++;
			}
		}
		System.out.println("정렬 전");
		System.out.println("================================================================");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t등수");
		for(int i=0; i<score.length; i++) {
			System.out.print(name[i]+"\t");
			for(int j=0; j<score[i].length; j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("================================================================");
		
		//등수 정렬 
		
		for (int i = 0; i < score.length - 1; i++) {
	        int rank = i;
	        for (int j = i + 1; j < score.length; j++) {
	            if (score[j][5] < score[rank][5]) {
	   
	            	rank = j;
	            }
	        }
	    
	        //성적
	        int[] temp = score[i];
	        score[i] = score[rank];
	        score[rank] = temp;
	        
	        //이름
	        String tmp = name[i];
	        name[i] = name[rank];
	        name[rank] = tmp;
	        
	
	    }
		
		
		System.out.println();
		System.out.println("정렬 후");
		System.out.println("================================================================");

	
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t등수");
		for(int i=0; i<score.length; i++) {
			System.out.print(name[i]+"\t");
			for(int j=0; j<score[i].length; j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("================================================================");	
	}
}
