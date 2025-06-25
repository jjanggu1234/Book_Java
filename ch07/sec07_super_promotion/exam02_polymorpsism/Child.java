package ch07.sec07_super_promotion.exam02_polymorpsism;

public class Child extends Parent {
    //메소드 오버라이딩
    @Override
    public void method2() {
        System.out.println("Child-method2()");
    }

    //오버라이딩 없이 메소드 선언
    public void method3() {
        System.out.println("Child-method3()");
    }
}
