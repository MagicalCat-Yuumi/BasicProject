package kr.or.ddit.HomeWork;

public class HomeWork9 {
    public static void main(String[] args) {

        Score s1 = new Score();
        s1.name = "최우제";
        s1.kr = 85;
        s1.ma = 72;
        s1.en = 81;
        s1.rank = 1;

        Score s2 = new Score();
        s2.name = "문현준";
        s2.kr = 67;
        s2.ma = 90;
        s2.en = 87;
        s2.rank = 1;

        Score s3 = new Score();
        s3.name = "이상혁";
        s3.kr = 77;
        s3.ma = 79;
        s3.en = 94;
        s3.rank = 1;

        Score s4 = new Score();
        s4.name = "이민형";
        s4.kr = 80;
        s4.ma = 90;
        s4.en = 52;
        s4.rank = 1;

        Score s5 = new Score();
        s5.name = "류민석";
        s5.kr = 97;
        s5.ma = 65;
        s5.en = 77;
        s5.rank = 1;

//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);
//		System.out.println(s4);
//		System.out.println(s5);

        Score[] scores = { s1, s2, s3, s4, s5 };

        //scores[0] -> 최우제, score[1] -> 문현준...
        for (Score sc1 : scores) {
            sc1.sum = sc1.kr + sc1.ma + sc1.en;
            sc1.avg = sc1.sum / 3.0;

            //System.out.println(scores[i]);
        }

        // 등수 체크
        for (Score sc1 : scores) {
            for (Score sc2 : scores) {
                if (sc1.sum < sc2.sum) {
                    sc1.rank++;
                }
            }
//			System.out.println(scores[i]);
        }

        for (int i = 0; i < scores.length - 1; i++) {
            for (int j = 0; j < scores.length - 1; j++) {
                Score tmp1 = scores[j];
                Score tmp2 = scores[j+1];
                if(tmp1.rank > tmp2.rank){
                    Score temp = scores[j];
                    scores[j]=scores[j+1];
                    scores[j+1] = temp;
                }
            }
        }

        for (Score score : scores) {
            System.out.println(score);
        }

        //정렬
    }


}



class Score {
    /*
     * 학생 이름
     * 국어
     * 영어
     * 수학
     * 총점
     * 평균
     * 등수
     */
    static String group = "404호";
    String name;
    int kr, ma, en, sum, rank;
    double avg;


    @Override
    public String toString() {
        return "Score [name=" + name + ", kr=" + kr + ", ma=" + ma + ", en=" + en + ", sum=" + sum + ", avg=" + avg
                + ", rank=" + rank + "]";
    }



}

