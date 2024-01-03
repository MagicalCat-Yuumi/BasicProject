package kr.or.ddit.HomeWork;

import java.util.Scanner;

public class HomeWork2 {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        HomeWork2 obj = new HomeWork2();
        //obj.method1();
        //obj.method2();
        //obj.method3();
        obj.method4();
//        obj.method5();
    }

    public void method1() {
        /*
         *  스캐너를 통해서 문자(실수)를 입력 받고.
         *  소수점 2째 짜리에서 버림
         *  ex ) 12.23123 - > 12.23
         */

        System.out.print("실수를 입력하세요 -> ");
        String str = sc.nextLine();

        double a1 = Double.parseDouble(str)*100;

        int num = (int)a1;

        double result = num/(double)100;

        System.out.println("결과 : " + result);

    }

    public void method2() {
        /*
         *  스캐너를 통해서 대문자를 입력 받고 소문자로 변환
         *  ex) A-> a
         */
        System.out.print("대문자 A에서 Z까지 중 하나를 입력하세요: ");
        String inputString = sc.nextLine();

        // 입력된 문자열이 비어있는지 체크

        if (inputString.length() == 1) {
            char inputChar = inputString.charAt(0);

            // 대문자 A에서 Z까지의 범위에 속하는지 체크
            if (inputChar >= 'A' && inputChar <= 'Z') {
                System.out.println("입력: " + inputChar);
                System.out.println("변환 된 문자 : " + (char)(inputChar + 32));

            } else {
                System.out.println("대문자 A에서 Z까지의 문자를 입력하세요.");

            }
        } else {
            System.out.println("하나의 문자만 입력하세요.");

        }


    }
    public void method3() {
        /*
         *  스캐너를 통해서 소문자를 입력 받고 대문자로 변환
         *  ex) f-> F
         */

        System.out.print("소문자 a에서 z까지 중 하나를 입력하세요: ");
        String inputString = sc.nextLine();

        // 입력된 문자열이 비어있는지 체크

        if (inputString.length() == 1) {
            char inputChar = inputString.charAt(0);

            // 대문자 A에서 Z까지의 범위에 속하는지 체크
            if (inputChar >= 'a' && inputChar <= 'z') {
                System.out.println("입력: " + inputChar);
                System.out.println("변환 된 문자 : " + (char)(inputChar - 32));

            } else {
                System.out.println("소문자 A에서 Z까지의 문자를 입력하세요.");

            }
        } else {
            System.out.println("하나의 문자만 입력하세요.");

        }
    }

    public void method4() {
        /*
         *  스캐너를 통해서 숫자 3자리를 입력 받고 각 자리수의 합을 구하시오
         *  ex) 123 -> 1+2+3
         */

        while(true) {
            System.out.print("숫자 3자리를 입력해주세요 -> ");
            String num = sc.nextLine();
            int sum = 0;
            if (num.length() != 3) {
                System.out.println("숫자 3자리요...");
            } else {
                char[] chs = num.toCharArray();
                for (char c : chs) {
                    // '0'의 ASCII 코드 값인 48을 빼서 숫자로 변환
                    int digit = c - '0';
                    sum += digit;
                }
                System.out.println("각 자릿수 합:" + sum);
                break;
            }
        }
    }

    public void method5() {
        /*
         *  스캐너를 통해서 문자(실수)를 입력 받고.
         *  소수점 2째 짜리에서 반올림
         *  ex ) 12.23623 - > 12.24
         */

    	System.out.print("실수를 입력하세요 -> ");
        String str = sc.nextLine();

        double a1 = Double.parseDouble(str) * 100;
        double a2 = Double.parseDouble(str) * 10;

        int num = (int) a2;
        double result;
        if ((a1 % 10) >= 5) {
            result = (num + 1) / (double) 10;
        } else {
            result = num / (double) 10;
        }
        System.out.println("결과 : " + result);
    }


}
