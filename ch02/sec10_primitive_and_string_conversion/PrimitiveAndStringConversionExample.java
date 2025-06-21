package ch02.sec10_primitive_and_string_conversion;

public class PrimitiveAndStringConversionExample {
    public static void main(String[] args) {
        
        // 문자열을 기본타입으로 변환 -> 매개변수에 문자열 리터럴의 값을 바로 넣는 방법
        int value1 = Integer.parseInt("10");            
        double value2 = Double.parseDouble("3.14");
        boolean value3 = Boolean.parseBoolean("true");      // Boolean.parseBoolean메소드 규칙, 문자열이 정확히 "true" (대소문자 구분 없이)**일 때만 true를 반환.그 외의 모든 문자열은 false로 처리된다.
        System.out.println("value1: "+ value1);
        System.out.println("value2: "+ value2);
        System.out.println("value3: "+ value3);

        // 문자열을 기본타입으롤 변환 -> 매개변수에 str이라는 변수를 넣는 방법
        String str = "10";

        int value4 = Integer.parseInt(str);         // 10진수 숫자 문자열일 때, 정수로 변환
        int value5 = Integer.parseInt(str, value1); // value1의 진수가 달라지면 value5의 진수가 달라진다. ex)value1이 지금은 10진수이지만 8진수라면 value5는 8진수로 변환
        double value6 = Double.parseDouble(str);    // 10진수 숫자 문자열일 때, 실수로 변환
        boolean value7 = Boolean.parseBoolean(str); // 10진수 숫자 문자열일 때, 논리타입으로 변환

        System.out.println("value4: "+ value4);
        System.out.println("value5: "+ value5);
        System.out.println("value6: "+ value6);
        System.out.println("value7: "+ value7);     // Boolean.parseBoolean메소드 규칙으로 false값 출력

        // 기본타입의 값을 문자열로 변환 -> 매개변수에 문자열 리터럴의 값을 바로 넣는 방법
        String str1 = String.valueOf(10);
        String str2 = String.valueOf(3.14);
        String str3 = String.valueOf(true);

        System.out.println("str1: "+ str1);
        System.out.println("str2: "+ str2);
        System.out.println("str3: "+ str3);
        
        // 기본타입의 값을 문자열로 변환 -> 매개변수에 기본타입인 변수를 넣는 방법
        int value8 = 1;
        double value9 = 3.14;
        boolean value10 = true; 

        String str4 = String.valueOf(value8);
        String str5 = String.valueOf(value9);
        String str6 = String.valueOf(value10);
         
        System.out.println("str4: "+ str4);
        System.out.println("str5: "+ str5);
        System.out.println("str6: "+ str6);
       
    }
}
