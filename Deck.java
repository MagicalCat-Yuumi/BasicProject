package kr.or.ddit.HomeWork;


public class Deck {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Card[] cList = deck.cardList();
        Card[] mix = deck.mixCard(cList);

      /*  for (Card card : cList) {
            print(card);
        }*/

//        섞였는지 확인
        for (Card card : mix) {
            print(card);
        }

        System.out.println("===================== 게임 결과 =====================");

        if (deck.Chk(mix[0], mix[1])) {
            System.out.println("당신이 이겼습니다!");
        } else {
            System.out.println("졌어요...");
        }
    }

    public static void print(Card card) {
//        String type = "";
//        if (card.type.equals(Type.CLOVER.name())) type = "♣";
//        if (card.type.equals(Type.HEART.name())) type = "♥";
//        if (card.type.equals(Type.DIA.name())) type = "◆";
//        if (card.type.equals(Type.SPADE.name())) type = "♠";
//
//        String num = String.valueOf(card.num);
//        if (card.num == 11) num = "J";
//        if (card.num == 12) num = "Q";
//        if (card.num == 13) num = "K";
//        if (card.num == 14) num = "A"; //에이스가 가장 높은 족보
        System.out.println(card);

    }


    /*
     *  내카드랑 다음카드랑 비교해서 승패 비교하기.
     */
    public boolean Chk(Card player, Card com) {
        Card[] trump = cardList();// 족보 확인
        int p = 0, c = 0; // 족보체크용 변수 생성

        //내가 뽑은 카드 출력
        System.out.print("player : ");
        print(player);

        //상대방이 뽑은 카드 출력
        System.out.print("com : ");
        print(com);


        //플레이어 족보 확인
        for (int i = 0; i < trump.length; i++) {
            if (player.toString().equals(trump[i].toString())) {
                p = i;
                break;
            }
        }

        // 컴퓨터 족보 확인
        for (int i = 0; i < trump.length; i++) {
            if (com.toString().equals(trump[i].toString())) {
                c = i;
                break;
            }
        }

        return p > c; // T = 1 or F = 0
    }

    /*
     *  카드 섞기
     */
    public Card[] mixCard(Card[] Cardlist) {
    
        for (int i = 0; i < 10000; i++) {
        	int ran1 = (int) (Math.random() * Cardlist.length);
            int ran2 = (int) (Math.random() * Cardlist.length);
            Card tmp = Cardlist[ran1];
            Cardlist[ran1] = Cardlist[ran2];
            Cardlist[ran2] = tmp;
        }
        return Cardlist;
    }

    public Card[] cardList() {
        Card[] cardList = new Card[52];
        int cur = 0;
        // 카드의 타입의 강력함까지 생각
        for (int i = 1; i <= 13; i++) {
            for (Type t : Type.values()) {
                Card card = new Card(i + 1, t.name()); // 2부터 시작하여 에이스가 가장 강함
                cardList[cur++] = card;
            }
        }

        return cardList;
    }


}

