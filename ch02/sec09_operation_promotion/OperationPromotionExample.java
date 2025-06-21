package ch02.sec09_operation_promotion;

public class OperationPromotionExample {
    public static void main(String[] args) {
        byte result1 = 10 + 20;                         // 정수 기본은 int이지만 byte는 컴파일 단계에서 연산
        System.out.println("result1: " + result1);  

        byte v1 = 10;
        byte v2 = 20;
        int result2 = v1 + v2;                          // 연산식에서 int 타입으로 변환 후 연산
        System.out.println("result2: " + result2);  

        byte v3 = 10;
        int v4 = 100;
        long v5 = 1000L;
        long result3 = v3 + v4 + v5;                    // 연산식에서 byte, int를 long 타입으로 변환 후 연산
        System.out.println("result3: " + result3);

        char v6 = 'A';
        char v7 = 1;
        int result4 = v6 + v7;                          // 연산식에서 문자타입인 char를 int타입으로 변환 후 연산
        System.out.println("result4: " + result4);
        System.out.println("result4: " + (char)result4);// 출력문에서도 형변환 가능

        int v8 = 10;
        int result5 = v8 / 4;                           // 정수 연산의 결과는 정수
        System.out.println("result5: " + result5);

        float result5A = (float)v8 / 4;                 // 실수 값으로 나오고 싶다면 v8변수를 형변환, 그리고 result5A는 int타입 불가능 같은 타입끼리만 값을 담을 수 있기 때문
        System.out.println("result5A: " + result5A);
        System.out.println("result5A: " + (int)result5A);

        int v9 = 10;
        double result6 = v9 / 4.0;                      // double 타입으로 변환 후 연산
        System.out.println("result6: " + result6);

        int v10 = 1;
        int v11 = 2;
        double result7 = (double) v10 / v11;            // result5A와 같은 내용
        System.out.println("result7: " + result7);
    }
}
