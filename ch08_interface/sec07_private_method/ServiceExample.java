package ch08_interface.sec07_private_method;

public class ServiceExample {
    public static void main(String[] args) {
        //인터페이스 변수 선언과 구현 객체 대입
        Service service = new ServiceImpl();

        //디폴트 메소드 호출
        service.defaultMethod1();
        System.out.println();
        service.defaultMethod2();
        System.out.println();

        /* private라 호출 안됨
        //정적 메소드 호출
        service.staticMethod1();
        System.out.println();
        Service.staticMethod2();
        System.out.println();
         */

    }
}
