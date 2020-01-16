package lmoon.chap08;

public class FieldAccess {
    public static void main(String[] args) {
        Super sup = new Sub();
        System.out.println("super.field " + sup.field
            + ",sup.getField() " + sup.getField());
        sup.staticMethod();
        Sub sub = new Sub();
        System.out.println("sub.field " + sub.field
                + ",sub.getField() " + sub.getField()
                + ",sub.getSuperField() " + sub.getSuperField());
        //Sub.staticMethod();
        sub.staticMethod();
    }
}
class Super {
    public int field = 0;
    public int getField() {
        return field;
    }
    public static void staticMethod() {
        System.out.println("staticMethod Super");
    }
}

class Sub extends Super {
    public int field = 1;
    public int getField() {
        return field;
    }
    public int getSuperField() {
        return super.field;
    }
    public static void staticMethod() {
        System.out.println("staticMethod Sub");
    }
}
