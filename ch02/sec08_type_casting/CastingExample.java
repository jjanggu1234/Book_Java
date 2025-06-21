package ch02.sec08_type_casting;

public class CastingExample {
    public static void main(String[] args) {
        int var1 = 10;
        byte var2 = (byte) var1;
        System.out.println(var2);   // byte로 강제변환 후 10이 그대로 유지

        long var3 = 300;
        int var4 = (int) var3;
        System.out.println(var4);   // int로 강제변환 후 300이 그대로 유지

        int var5 = 65;
        char var6 = (char) var5;
        System.out.println(var6);   // 숫자65에서 유니코드 'A'로 출력

        double var7 = 3.14;
        int var8 = (int) var7;
        System.out.println(var8);   // 실수 3.14에서 정수인 3으로 출력
    }
}
