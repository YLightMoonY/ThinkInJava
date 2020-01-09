package lmoon.chap05;

public class NewVarArgs {
    static void printArray(Object... args) {
        for (Object obj : args) {
            System.out.println(obj + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printArray(new Integer(123), new Float(23.324), new Double(123.123));
        printArray();
        printArray((Object[])new Integer[]{1,2,3,4});
    }
}
