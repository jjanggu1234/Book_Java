package ch02.sec03_chartype;

public class CharExample {
    public static void main(String[] args) {
        char c1 = 'A';      //문자저장 = 'A' 문자와 매핑되는 숫자: 65로 대입
        char c2 = 65;       //유니코드 직접 저장 = 10진수 65와 매핑되는 문자: 'A'

        char c3 = '가';     //문자저장 = '가' 문자와 매핑되는 숫자: 44032로 대입
        char c4 = 44032;    //유니코드 직접 저장 = 10진수 44032와 매핑되는 문자: '가'

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
    }
}
