package lmoon.chap15;

import java.util.ArrayList;
import java.util.List;

public class CovariantArrays {
    public static void main(String[] args) {
        Fruit[] fruit = new Apple[10];
        fruit[0] = new Apple();
        fruit[1] = new Jonathan();
        try {
            fruit[0] = new Fruit();
        } catch (Exception e) {
            try {
                System.out.println(e);
                fruit[0] = new Orange();
            } catch (Exception e1) {
                System.out.println(e1);
            }
        }
        List<? extends Fruit> flist = new ArrayList<Apple>();
    }
}

class Fruit{}
class Apple extends Fruit{}
class Jonathan extends  Apple{}
class Orange extends Fruit{}

