package ch05.sec05_string_type;

public class EmptyStringExample {
    public static void main(String[] args) {
        String hobby = "";
        if(hobby.equals("")) {
            System.out.println("Hobby 변수가 참조하는 String 객체는 빈 문자열");
        }
    }
}
