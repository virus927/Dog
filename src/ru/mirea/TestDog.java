package ru.mirea;
import java.lang.*;


public class TestDog {
    public static void main (String[]args){
        Dog d1 = new Dog ("Mike",2);
        Dog d2 = new Dog("Hellen",7);
        Dog d3 = new Dog ("Bob");
        d3.setAge(1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();

    }
}
