package lmoon.chap07;

public class Cartoon extends Drawing{
    public Cartoon() {
        System.out.println("Cartoon constructor");
    }

    public static void main(String[] args) {
        Cartoon x = new Cartoon();
    }
}
class Art {
    Art(String s) {
        System.out.println("Art constructor");
    }
    void test(){
        System.out.println("test in Art");
    }
}
class Drawing extends Art {
    Drawing(String a) {
        super(a);
    }
    Drawing() {
        super("");
        System.out.println("Drawing constructor");
    }

    @Override
    void test() {
        super.test();
        System.out.println("test in Drawing");
    }
}
