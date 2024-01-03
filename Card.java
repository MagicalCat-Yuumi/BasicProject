package kr.or.ddit.HomeWork;

public class Card {
    int num;
    String type;

    public Card(int num, String type) {
        this.num = num;
        this.type = type;
    }

    @Override
    public String toString() {
        String type = "";
        if (this.type.equals(Type.CLOVER.name())) type = "♣";
        if (this.type.equals(Type.HEART.name())) type = "♥";
        if (this.type.equals(Type.DIA.name())) type = "◆";
        if (this.type.equals(Type.SPADE.name())) type = "♠";

        String num = String.valueOf(this.num);
        if (this.num == 11) num = "J";
        if (this.num == 12) num = "Q";
        if (this.num == 13) num = "K";
        if (this.num == 14) num = "A"; //에이스가 가장 높은 족보
        
        return type + num;
    }

}
