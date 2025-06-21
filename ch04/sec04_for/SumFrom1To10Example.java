package ch04.sec04_for;

public class SumFrom1To10Example {
    public static void main(String[] args) {
        int sum = 0;
        int i;

        for(i=1; i<=100; i++) {
            sum += i;
        }
        System.out.println(i);
        System.out.println(sum);

        System.out.println("1~" + (i-1) + " 합 : " + sum);
    }
}
