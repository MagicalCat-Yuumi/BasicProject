package kr.or.ddit.HomeWork;

public class HomeWork13 {

	/*
	 * 예약 시스템
	 */
	public static void main(String[] args) {
		
		Reserve re1 = Reserve.getInstance();
		re1.getReserve("신짱구");
		re1.getReserve("신짱구");
		re1.getReserve("김철수");
		re1.complete();
		re1.getReserve("김철수");
		Reserve re2 = Reserve.getInstance();
		re2.getReserve("이상혁");
	
	}
}

class Reserve{
		
	/*
	 * 싱글톤 만들기
	 */
	private static Reserve instance = null;

	private Reserve() {
	}

	public static Reserve getInstance() {
		if (instance == null) {
			instance = new Reserve();
		}
		return instance;
	}
		
	private String name;
	private boolean reserve = false;
	
	/*
	 * 예약하는 메소드
	 * 이미 예약되어 있다면  "예약이 되어있습니다." 출력
	 * 아니면 예약에 name = "예약 할 사람 이름, reserve : true
	 */
	public Boolean getReserve(String name){
		if(this.name == null) {
			System.out.println(name+ "님 예약");
			this.name = name;
			return reserve = true;
		}else
		{
			if(!this.name.equals(name)) {
				System.out.println(this.name+ "님이 이미 예약한 상태");
			}else {
				System.out.println(name+"님은 이미 예약된 상태");
			}
			return reserve;
		}
	}
	
	/*
	 * 예약 처리 하는 메소드
	 * name = null
	 * reserve false
	 * 
	 * "예약된 사람 이름"님 예약 완료되었습니다
	 */
	
	public void complete(){
		System.out.println(name + "님 주문 완료");
		name = null;
		reserve = false;
	}

}
