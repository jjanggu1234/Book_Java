package ch04.sec02_if;

public class IfExample {
    public static void main(String[] args) {
        int score = 93;

        //중괄호 있는 if문
        if(score >= 90) {
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("등급은 A입니다.");
        }

        //중괄호 없는 if문
        if(score < 90)
        System.out.println("점수가 90보다 작습니다.");
        System.out.println("등급은 B입니다.");
    }
}
