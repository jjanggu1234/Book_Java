package ch06.sec13_access_modifer.exam02_constructor.package2;

import ch06.sec13_access_modifer.exam02_constructor.package1.*;
public class C {
    //필드 선언
    A a1 = new A(true);
    // A a2 = new A(1); defalut 생성자 접근 불가(컴파일 에러)
    // A a3 = new A("문자열"); private 생성자 접근 불가(컴파일 에러)
}
