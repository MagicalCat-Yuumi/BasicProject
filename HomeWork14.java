package kr.or.ddit.HomeWork;

import java.util.Scanner;

public class HomeWork14 {
    static Scanner sc = new Scanner(System.in);
    Mem[] memList = new Mem[100];
    int cur = 0;
    public static void main(String[] args) {
        HomeWork14 hw = new HomeWork14();

        while(true) {
            System.out.println("1. 회원 가입.");
            System.out.println("2. 회원 탈퇴.");
            System.out.println("3. 정보 수정.");
            System.out.println("4. 회원 전체 정보 출력.");
            System.out.println("5. 종료.");

            int member = sc.nextInt();

            if(member == 1){
                hw.addMember();
            }
            else if (member == 2) {
                hw.removeMember();
            }

            else if (member == 3){
                hw.updateMember();
            }

            else if (member == 4){
                hw.printMemberList();
            }
            else if (member == 5){
                break;
            }
            else {
                System.out.println("잘못된 입력입니다!");
            }
        }
    }

    /*
     *   회원 가입 메소드 만들기.
     */
    public void addMember() {
        Mem mem = new Mem();

        //등록할 id 입력받기
        System.out.println("등록할 id 입력");
        String id = sc.next();
        mem.setId(id);
        //중복 알림

        //등록할 패스워드 입력받기
        System.out.println("등록할 password");
        String pass = sc.next();
        mem.setPass(pass);

        System.out.println("이름을 입력하세요.");
        String name = sc.next();
        mem.setName(name);

        System.out.println("나이 입력");
        int age = sc.nextInt();
        mem.setAge(age);


    }

    /*
     *   회원 탈퇴 메소드 만들기.
     */
    public void removeMember() {
        /*
         *  회원 전체 정보 출력하기.
         */
        System.out.print("탈퇴할 회원 번호 입력.");
        int num = sc.nextInt();
        remove(num);
    }

    public void remove(int num) {
        Mem[] copyList = new Mem[100];
        // 추후 배포
        memList = copyList;
    }

    /*
     *   회원 전체 정보 출력하기.
     */
    public void printMemberList() {
        for(Mem m : memList){
            System.out.println(m);
        }
    }

    /*
     *   회원 정보 수정하기.
     */

    public void updateMember() {
        /*
         *  회원 전체 정보 출력하기.
         */
        printMemberList();
        System.out.print("수정할 회원 번호 입력. -> ");
        int num = sc.nextInt();
        System.out.print("수정할 이름 입력 ->");
        System.out.print("수정할 패스워드 입력 ->");
        System.out.print("수정할 나이 입력->");
    }

}
class Mem{
    private String id;
    private String pass;
    private String name;
    private int age;

    /*
     * 생성자 사용x
     * getter setter 이용할것.
     */

    //getter
    public String getId() {
        return id;
    }

    public String getPass() {
        return pass;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    //setter
    public void setId(String id) {
        this.id = id;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
