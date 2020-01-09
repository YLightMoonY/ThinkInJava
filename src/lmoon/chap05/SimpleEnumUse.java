package lmoon.chap05;

import lmoon.chap05.Spiciness;

public class SimpleEnumUse {

    public static void main(String[] args) {
        Spiciness howHot = Spiciness.MEDIUM;
        System.out.println(howHot);
//        Child chile = new Child();
        Child child = new Child();
        child.testProtect();
    }
}
