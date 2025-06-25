package ch06_class.sec12_package.hyundai;

import ch06_class.sec12_package.hankook.SnowTire;
import ch06_class.sec12_package.kumho.AllSeasonTire;

public class Car {
    //부품 필드 선언
    ch06_class.sec12_package.hankook.Tire tire1 = new ch06_class.sec12_package.hankook.Tire();
    ch06_class.sec12_package.kumho.Tire tire2 = new ch06_class.sec12_package.kumho.Tire();
    SnowTire tire3 = new SnowTire();
    AllSeasonTire tire4 = new AllSeasonTire();
}
