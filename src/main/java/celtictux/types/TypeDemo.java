package celtictux.types;

import java.util.Scanner;

public class TypeDemo {

    private final int primInteger = 1;
    private final Integer objInteger = new Integer(1);



    private String objString;

    private final boolean primBoolean = true;
    private final Boolean objBoolean = new Boolean(true);

    private final SomeClass someClass1 = new SomeClass("classOne");
    private final SomeClass someClass2 = new SomeClass("classOne");

    public static void main(final String[] args) {
        final TypeDemo demo = new TypeDemo();
        demo.runChecks();
    }

    public TypeDemo() {

    }

    public void runChecks() {
        System.out.println("Are Integer values the same: " + areIntegersSame(primInteger, objInteger));
        System.out.println("Are Boolean values the same: " + areBooleansSame(primBoolean, objBoolean));

        boolean b = someClass1.equals(someClass2);
        System.out.println("Are objects equal " + b);
        System.out.println(someClass1.hashCode() + " " + someClass2.hashCode());

        System.out.println("adding: " + (primInteger - objInteger));

        for (int i = 0 ; i < 10 ; i++ ) {
            System.out.println(i);
        }

        int c = 0;
        while(c < 12) {
            System.out.println("c"+c);
            c++;
        }

        Scanner scanner =new Scanner(System.in);
        objString = scanner.next();
        System.out.println("Did you type: " + objString);
    }

    private boolean areIntegersSame(final int primative, final Integer object) {
        if (primative == object) {
            return true;
        } else {
            return false;
        }
    }

    private boolean areBooleansSame(final boolean primative, final Boolean object) {
        if (primative == object) {
            return true;
        } else {
            return false;
        }
    }

}
