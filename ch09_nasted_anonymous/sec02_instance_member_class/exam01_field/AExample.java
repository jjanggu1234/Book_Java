package ch09_nasted_anonymous.sec02_instance_member_class.exam01_field;

public class AExample {
    public static void main(String[] args) {
        //A 객체 생성
        A a = new A();

        //B 객체 생성
        A.B b = a.new B();
    }
}
