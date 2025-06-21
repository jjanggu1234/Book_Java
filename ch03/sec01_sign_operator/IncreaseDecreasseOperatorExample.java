package ch03.sec01_sign_operator;

public class IncreaseDecreasseOperatorExample {
 public static void main(String[] args) {
    int x = 10;
    int y = 10;
    int z;

    x++;    //다른 연산을 수행한 후에 피연산자의 값을 1 증가시킴
    ++x;    //피연산자의 값을 1증가시킴
    System.out.println("x=" + x);       //x =12

    System.out.println("------------------------------");
    y--;
    --y;
    System.out.println("y=" + y);       //y =8

    System.out.println("------------------------------");
    z = x++;
    System.out.println("z=" + z);   //z=12
    System.out.println("x=" + x);   //x=13

    System.out.println("------------------------------");
    z = ++x;
    System.out.println("z=" + z);   //z=14
    System.out.println("x=" + x);   //x=14

    System.out.println("------------------------------");
    z = ++x + y++;
    System.out.println("z=" + z);   //15+8
    System.out.println("x=" + x);   //15
    System.out.println("y=" + y);   //9
 }   
}
