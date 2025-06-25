package ch06_class.sec11_final_field_and_constant.exam02_constant;

public class EarthExample {
    public static void main(String[] args) {
        //상수 읽기
        System.out.println("지구의 반지름: " + Earth.EARTH_RADIUS + "kim");
        System.out.println("지구의 표면적: " + Earth.EARTH_SURFACE_AREA + "km^2");
    }
}
