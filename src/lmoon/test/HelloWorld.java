package lmoon.test;

public class HelloWorld {
    int a,b,c, d;
    public static void main(String[] args) {
        System.out.println("Hello World!");
//        System.getProperties().list(System.out);
        System.out.println(1 >> 1);
        /*for (int i = 1, j = i + 10; i < 5; i++, j = i * 2) {
            System.out.println("i = " + i + ",j = " + j);
        }*/
        testA(0);
    }

    public static void testA(short i) {
        System.out.println("short value - " + i);
    }

    public static void testA(long i) {
        System.out.println("long value - " + i);
    }
}
