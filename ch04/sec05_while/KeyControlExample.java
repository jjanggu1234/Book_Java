package ch04.sec05_while;

import java.util.Scanner;

public class KeyControlExample {
    public static void main(String[] args) {
        Scanner p1 = new Scanner(System.in);
        boolean run = true;
        int speed = 0;

        while (run) {
            System.out.println("-------------------------------------");
            System.out.println("1. 증속 | 2. 감속 | 3. 중지");
            System.out.println("-------------------------------------");
            System.out.print("선택: ");

            String strNum = p1.nextLine(); // 입력을 while 안에서 받아야 반복됨

            if (strNum.equals("1")) {
                speed++;
                System.out.println("현재 속도 = " + speed);
            } else if (strNum.equals("2")) {
                speed--;
                System.out.println("현재 속도 = " + speed);
            } else if (strNum.equals("3")) {
                run = false; // 반복 종료
            }
        }

        System.out.println("프로그램 종료");
        p1.close(); // Scanner 닫기
    }
}
