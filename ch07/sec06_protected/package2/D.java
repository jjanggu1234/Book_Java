package ch07.sec06_protected.package2;

import ch07.sec06_protected.package1.*;

public class D extends A {
    //생성자 선언
    public D() {
        //A() 생성자 호출
        super();
    }

    //메소드 선언 -> 상속을 통해서는 가능
    public void method1() {
        //A 필드값 변경
        this.field = "value";
        this.method();
    }

    //메소드 선언 -> 객체 생성으로는 불가능
    /*
    public void method2() {
        A a = new A();
        a.field = "value";
        a.method();
    }
 */

}
