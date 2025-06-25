package ch07_inheritance.sec05_final.exam02_method;

public class SportsCar extends Car {
    @Override
    public void speedUp() {
        speed += 10;
    }

    //재정의 불가
    /*@Override
    public void stop() {
        System.out.println("스포츠 카를 멈춤");
        speed = 0;
    }
        */
}
