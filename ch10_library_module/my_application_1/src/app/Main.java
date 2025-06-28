package app;

import ch10_library_module.my_lib.src.pack1.A;
import ch10_library_module.my_lib.src.pack2.B;

public class Main {
    public static void main(String[] args) {
        //라이브러리에서 가져온 A 클래스 사용
        A a = new A();
        a.method();

        //라이브러리에서 가져온 B 클래스 사용
        B b = new B();
        b.method();
    }
}
