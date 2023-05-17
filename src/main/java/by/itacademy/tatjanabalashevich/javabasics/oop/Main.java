package by.itacademy.tatjanabalashevich.javabasics.oop;

import jdk.jfr.Description;

public class Main {
    public static void main(String[] args) {

        Airplane airplaneOne = new Airplane();

        Wing wing1 = new Wing();
        wing1.wingLength = 15;
        wing1.wingWidth = 3;
        wing1.insideMaterial = "titanium";
        wing1.outsideMaterial = "aluminum";

        Engine engine1 = new Engine();
        engine1.engineAmount = 4;
        engine1.enginePower = 111000;

        Chassis chassis1 = new Chassis();
        chassis1.axisAmount = 3;
        chassis1.oneWheelDiameter = 38.2;
        chassis1.oneWheelWidth = 19.7;

        airplaneOne.wing = wing1;
        airplaneOne.engine = engine1;
        airplaneOne.chassis = chassis1;
        System.out.println("");
    }
}
